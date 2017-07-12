package studentOrientation.Activity;

import studentOrientation.ActivityI.CourseI;
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

public class Course implements CourseI{
	private CostI cost;
	private String type="";
	private CarbonFootPrintI carbonFootPrint;
	private DurationI duration;
	private EffortI effort;
	
	
	public Course() {
		Logger.writeMessage("Default Constructor of Course called.",DebugLevel.CONSTRUCTOR);
	}
	/**
	 * This method calculates the cost,duration,carbonfootprint,effort for the activity of registration from 
	 * default registrationSystem
	 * @param nothing.
	 * @return nothing.
	 */
	
	@Override
	public void registerationSystem() {
		cost=new Cost();
		type="registerationSystem";
		carbonFootPrint=new CarbonFootPrint();
		duration=new Duration();
		effort=new Effort();
		cost.addRegisterationCost(type);
		carbonFootPrint.addCarbonRegisterationStore(type);
		duration.addDurationRegisterationStore(type);
		effort.addCaloriesRegisterationStore(type);
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [cost=" + cost + ", type=" + type + ", carbonFootPrint=" + carbonFootPrint + ", duration="
				+ duration + ", effort=" + effort + "]";
	}


	/**
	 * This method calculates the cost,duration,carbonfootprint,effort for the activity of registration from 
	 * check payment
	 * @param nothing.
	 * @return nothing.
	 */
	
	@Override
	public void checkPayment() {
		// TODO Auto-generated method stub
		cost=new Cost();
		type="checkPayment";
		carbonFootPrint=new CarbonFootPrint();
		duration=new Duration();
		effort=new Effort();
		cost.addRegisterationCost(type);
		carbonFootPrint.addCarbonRegisterationStore(type);
		duration.addDurationRegisterationStore(type);
		effort.addCaloriesRegisterationStore(type);
		
	}

}
