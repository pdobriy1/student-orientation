package studentOrientation.Activity;

import studentOrientation.ActivityI.CampusTourI;
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

public class CampusTour implements CampusTourI{

	
	public CampusTour() {
		Logger.writeMessage("Default Constructor of CampusTour called.",DebugLevel.CONSTRUCTOR);
	}
	private CostI cost;
	private CarbonFootPrintI carbonFootPrint;
	private String type="";
	private DurationI duration;
	private EffortI effort;

	/**
	 * This method calculates the cost,duration,carbonfootprint,effort for the activity of campus tour from 
	 * bus ride
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void busRide() {
		// TODO Auto-generated method stub
		cost=new Cost();
		carbonFootPrint=new CarbonFootPrint();
		duration=new Duration();
		effort=new Effort();
		type="busride";
		cost.addCampusCost(type);
		carbonFootPrint.addCarbonCampusTour(type);
		duration.addDurationCampusTour(type);
		effort.addCaloriesCampusTour(type);
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CampusTour [cost=" + cost + ", carbonFootPrint=" + carbonFootPrint + ", type=" + type + ", duration="
				+ duration + ", effort=" + effort + "]";
	}
	/**
	 * This method calculates the cost,duration,carbonfootprint,effort for the activity of campus tour from 
	 * foot
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void onFoot() {
		// TODO Auto-generated method stub
		cost=new Cost();
		carbonFootPrint=new CarbonFootPrint();
		duration=new Duration();
		effort=new Effort();
		type="onFoot";
		cost.addCampusCost(type);
		carbonFootPrint.addCarbonCampusTour(type);
		duration.addDurationCampusTour(type);
		effort.addCaloriesCampusTour(type);
		
	}

}
