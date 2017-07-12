package studentOrientation.Activity;

import studentOrientation.ActivityI.BooksI;
import studentOrientation.choiceCalcualtions.CarbonFootPrint;
import studentOrientation.choiceCalcualtions.Cost;
import studentOrientation.choiceCalcualtions.Duration;
import studentOrientation.choiceCalcualtions.Effort;
import studentOrientation.choiceCalculationsI.CarbonFootPrintI;
import studentOrientation.choiceCalculationsI.CostI;
import studentOrientation.choiceCalculationsI.DurationI;
import studentOrientation.choiceCalculationsI.EffortI;
import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;

public class Books implements BooksI{


	public Books() {
		Logger.writeMessage("Default Constructor of Books called.",DebugLevel.CONSTRUCTOR);
	}

	private CostI cost;
	private CarbonFootPrintI carbonFootPrint;
	private String type="";
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	private DurationI duration;
	private EffortI effort;

	/**
	 * This method calculates the cost,duration,carbonfootprint,effort for the activity of buing books from 
	 * university book store
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void universityBookStore() {
		// TODO Auto-generated method stub
		cost=new Cost();
		carbonFootPrint=new CarbonFootPrint();
		duration=new Duration();
		effort=new Effort();
		type="universityBookStore";
		cost.addBookStoreCost(type);
		carbonFootPrint.addCarbonBookStore(type);
		duration.addDurationBookStore(type);
		effort.addCaloriesBookStore(type);
		
	}

	/**
	 * This method calculates the cost,duration,carbonfootprint,effort for the activity of buing books from 
	 * mando book store
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void mandoBooks() {
		// TODO Auto-generated method stub
		cost=new Cost();
		carbonFootPrint=new CarbonFootPrint();
		duration=new Duration();
		effort=new Effort();
		type="mandoBooks";
		cost.addBookStoreCost(type);
		carbonFootPrint.addCarbonBookStore(type);
		duration.addDurationBookStore(type);
		effort.addCaloriesBookStore(type);
	
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Books [cost=" + cost + ", carbonFootPrint=" + carbonFootPrint + ", type=" + type + ", duration="
				+ duration + ", effort=" + effort + "]";
	}

}
