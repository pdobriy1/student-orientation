package studentOrientation.Activity;

import studentOrientation.ActivityI.DormI;
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

public class Dorm implements DormI {

	
	
	
	public Dorm() {
		Logger.writeMessage("Default Constructor of Dorm called.",DebugLevel.CONSTRUCTOR);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dorm [cost=" + cost + ", type=" + type + ", carbonFootPrint=" + carbonFootPrint + ", duration="
				+ duration + ", effort=" + effort + "]";
	}

	private CostI cost;
	private String type="";
	private CarbonFootPrintI carbonFootPrint;
	private DurationI duration;
	private EffortI effort;
	
	

	/**
	 * This method calculates the cost,duration,carbonfootprint,effort for the activity of dorm selection from 
	 * admin office
	 * @param nothing.
	 * @return nothing.
	 */
	
	
	@Override
	public void adminOffice() {
		cost=new Cost();
		carbonFootPrint=new CarbonFootPrint();
		duration=new Duration();
		effort=new Effort();
		type="adminCost";
		cost.addDormSelectionCost(type);
		carbonFootPrint.addCarbonDormSelection(type);
		duration.addDurationDormSelection(type);
		effort.addCaloriesDormSelection(type);
	
	}


	/**
	 * This method calculates the cost,duration,carbonfootprint,effort for the activity of dorm selection from 
	 * online gaming
	 * @param nothing.
	 * @return nothing.
	 */
	
	@Override
	public void onlineGaming() {
		cost=new Cost();
		carbonFootPrint=new CarbonFootPrint();
		duration=new Duration();
		effort=new Effort();
		type="onlineGamingCost";
		cost.addDormSelectionCost(type);
		carbonFootPrint.addCarbonDormSelection(type);
		duration.addDurationDormSelection(type);
		effort.addCaloriesDormSelection(type);
		
	}

}
