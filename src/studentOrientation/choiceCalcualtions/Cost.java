package studentOrientation.choiceCalcualtions;

import studentOrientation.choiceCalculationsI.CostI;
import studentOrientation.store.Result;
import studentOrientation.store.StdoutDisplayInterface;
import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;

public class Cost implements CostI{

	
	
	public Cost() {
		Logger.writeMessage("Default Constructor of Cost called.",DebugLevel.CONSTRUCTOR);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cost [totalCost+=" + totalCost+  "]";
	}

	private static double totalCost=0;
	private static StdoutDisplayInterface result=new Result();
	
	
	/**
	 * This method calculates the cost for the activity of campus tour 
	 * @param nothing.
	 * @return nothing.
	 */
	
	@Override
	public void addCampusCost(String tourType) {
		// TODO Auto-generated method stub
		
		if(tourType.equalsIgnoreCase("busride"))
		{
			totalCost+=2.0;
		}
		else if(tourType.equalsIgnoreCase("onFoot"))
		{
			totalCost+=0.10;
			
		}
		result.addToResults("cost in dollars", totalCost);
		
		
	}

	/**
	 * This method calculates the cost for the activity of Buying books
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void addBookStoreCost(String bookStoreType) {
		// TODO Auto-generated method stub
		
		double bookuniv=Math.random()*50+1;
		if(bookStoreType.equalsIgnoreCase("universityBookStore"))
		{
			totalCost+=bookuniv;
		}
		else if(bookStoreType.equalsIgnoreCase("mandoBooks"))
		{
			totalCost+=(bookuniv*5)/100;
		}
		result.addToResults("cost in dollars", totalCost);
	
	}

	/**
	 * This method calculates the cost for the activity of registration
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void addRegisterationCost(String registerationType) {
		// TODO Auto-generated method stub
		double regpay=Math.random()*4000+1;
		if(registerationType.equalsIgnoreCase("registerationSystem"))
		{
			totalCost+=regpay;
		}
		else if(registerationType.equalsIgnoreCase("checkPayment"))
		{
			
			totalCost+=regpay-(regpay*(3/100));
		}
		result.addToResults("cost in dollars", totalCost);
		
		
	}

	/**
	 * This method calculates the cost for the activity of Dorm selection
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void addDormSelectionCost(String dormSelectionType) {
		// TODO Auto-generated method stub
		double admincost=Math.random()*50+1;
		if(dormSelectionType.equalsIgnoreCase("adminCost"))
		{
			totalCost+=admincost;
		}
		else if(dormSelectionType.equalsIgnoreCase("onlineGamingCost"))
		{
			totalCost+=admincost+(2/100);
		}
		result.addToResults("cost in dollars", totalCost);
		
		
	}

}
