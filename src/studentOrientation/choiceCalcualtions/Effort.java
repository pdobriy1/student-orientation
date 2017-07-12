package studentOrientation.choiceCalcualtions;

import studentOrientation.choiceCalculationsI.EffortI;
import studentOrientation.store.Result;
import studentOrientation.store.StdoutDisplayInterface;
import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;

public class Effort implements EffortI{

	private static double totalEffort=0;
	private static StdoutDisplayInterface result=new Result();
	
	
	public Effort() {
		Logger.writeMessage("Default Constructor of Effort called.",DebugLevel.CONSTRUCTOR);
	}
	
	/**
	 * This method calculates the effort for the activity of campus tour
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void addCaloriesCampusTour(String typeCampusTour) {
		// TODO Auto-generated method stub
		if(typeCampusTour.equalsIgnoreCase("busride"))
		{
			totalEffort+=20;
		}
		else if(typeCampusTour.equalsIgnoreCase("onFoot"))
		{
			totalEffort+=50;
			
		}
		
		result.addToResults("TotalEffort in calories", totalEffort);
		
	}
	/**
	 * This method calculates the effort for the activity of buying books
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void addCaloriesBookStore(String typeBookStore) {
		// TODO Auto-generated method stub
		if(typeBookStore.equalsIgnoreCase("universityBookStore"))
		{
			totalEffort+=Math.random()*5+1;
		
		}
		else if(typeBookStore.equalsIgnoreCase("mandoBooks"))
		{
			totalEffort+=Math.random()*15+1;
			
		}
		
		result.addToResults("TotalEffort in calories", totalEffort);
		
	}
	
	/**
	 * This method calculates the effort for the activity of registration
	 * @param nothing.
	 * @return nothing.
	 */

	@Override
	public void addCaloriesRegisterationStore(String typeRegisterationStore) {
		// TODO Auto-generated method stub
		double effortreg=Math.random()*10+1;
		if(typeRegisterationStore.equalsIgnoreCase("registerationSystem"))
		{
			totalEffort+=Math.random()*10+1;
		}
		else if(typeRegisterationStore.equalsIgnoreCase("checkPayment"))
		{
			totalEffort+=(effortreg*5)/100;
		}
		
		result.addToResults("TotalEffort in calories", totalEffort);
		
	}

	/**
	 * This method calculates the effort for the activity of dorm selection
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void addCaloriesDormSelection(String typeDormSelection) {
		// TODO Auto-generated method stub
		if(typeDormSelection.equalsIgnoreCase("adminCost"))
		{
			totalEffort+=Math.random()*5+1;
		}
		else if(typeDormSelection.equalsIgnoreCase("onlineGamingCost"))
		{
			totalEffort+=Math.random()*15+1;
		}
		
		result.addToResults("TotalEffort in calories", totalEffort);
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Effort []";
	}

}
