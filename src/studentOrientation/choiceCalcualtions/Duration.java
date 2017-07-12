package studentOrientation.choiceCalcualtions;

import studentOrientation.choiceCalculationsI.DurationI;
import studentOrientation.store.Result;
import studentOrientation.store.StdoutDisplayInterface;
import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;

public class Duration implements DurationI {

	private static double totalDuration=0;
	private static StdoutDisplayInterface result=new Result();
	
	
	
	public Duration() {
		Logger.writeMessage("Default Constructor of Duration called.",DebugLevel.CONSTRUCTOR);
	}
	
	/**
	 * This method calculates the duration for the activity of campus tour
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void addDurationCampusTour(String typeCampusTour) {
		// TODO Auto-generated method stub
		if(typeCampusTour.equalsIgnoreCase("busride"))
		{
			totalDuration+=5;
		}
		else if(typeCampusTour.equalsIgnoreCase("onFoot"))
		{
			totalDuration+=10;
			
		}
		
		result.addToResults("Duration in minutes", totalDuration);
	
	}
	
	
	/**
	 * This method calculates the duration for the activity of buying books
	 * @param nothing.
	 * @return nothing.
	 */

	@Override
	public void addDurationBookStore(String typeBookStore) {
		// TODO Auto-generated method stub
		double totalDurationbooks=Math.random()*30+1;
		if(typeBookStore.equalsIgnoreCase("universityBookStore"))
		{
			totalDuration+=totalDurationbooks;
		}
		else if(typeBookStore.equalsIgnoreCase("mandoBooks"))
		{
			totalDuration+=(totalDurationbooks*5)/100;
		}
		
		result.addToResults("Duration in minutes", totalDuration);
		
	}

	/**
	 * This method calculates the duration for the activity of registration system
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void addDurationRegisterationStore(String typeRegisterationStore) {
		// TODO Auto-generated method stub
		if(typeRegisterationStore.equalsIgnoreCase("registerationSystem"))
		{
			totalDuration+=Math.random()*60+1;
		}
		else if(typeRegisterationStore.equalsIgnoreCase("checkPayment"))
		{
			totalDuration+=(Math.random()*10+1);
			
		}
		
		result.addToResults("Duration in minutes", totalDuration);
		
	}
	
	/**
	 * This method calculates the duration for the activity of dorm selection
	 * @param nothing.
	 * @return nothing.
	 */

	@Override
	public void addDurationDormSelection(String typeDormSelection) {
		// TODO Auto-generated method stub
		double durationDorm=Math.random()*15+1;
		if(typeDormSelection.equalsIgnoreCase("adminCost"))
		{
			totalDuration+=durationDorm;
		}
		else if(typeDormSelection.equalsIgnoreCase("onlineGamingCost"))
		{
			totalDuration+=Math.random()*20+1;
		}
		
		
		result.addToResults("Duration in minutes", totalDuration);
	
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Duration []";
	}

}
