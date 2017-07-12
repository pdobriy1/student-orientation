package studentOrientation.choiceCalcualtions;

import studentOrientation.choiceCalculationsI.CarbonFootPrintI;
import studentOrientation.store.Result;
import studentOrientation.store.StdoutDisplayInterface;
import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;

public class CarbonFootPrint implements CarbonFootPrintI{

	private static double  totalCarbonFootPrint=0;
	private static StdoutDisplayInterface result=new Result();
	
	public CarbonFootPrint() {
		Logger.writeMessage("Default Constructor of CarbonFootPrint called.",DebugLevel.CONSTRUCTOR);
	}
	/**
	 * This method calculates the carbonfootprint for the activity of campus tour 
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void addCarbonCampusTour(String typeCampusTour) {
		// TODO Auto-generated method stub
		if(typeCampusTour.equalsIgnoreCase("busride"))
		{
			totalCarbonFootPrint+=2;
		}
		else if(typeCampusTour.equalsIgnoreCase("onFoot"))
		{
			totalCarbonFootPrint+=1;
			
		}
		
		result.addToResults("CarbonFootPrint in tonnes of CO2", totalCarbonFootPrint);
	
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CarbonFootPrint [totalCarbonFootPrint+=" + totalCarbonFootPrint+  "]";
	}

	/**
	 * This method calculates the carbonfootprint for the activity of Buying books
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void addCarbonBookStore(String typeBookStore) {
		// TODO Auto-generated method stub
		int carbonuniv=6;
		if(typeBookStore.equalsIgnoreCase("universityBookStore"))
		{
			totalCarbonFootPrint+=carbonuniv;
		}
		else if(typeBookStore.equalsIgnoreCase("mandoBooks"))
		{
			totalCarbonFootPrint+=(carbonuniv*5)/100;
		}
		
		result.addToResults("CarbonFootPrint in tonnes of CO2", totalCarbonFootPrint);
		
	}
	/**
	 * This method calculates the carbonfootprint for the activity of registration
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void addCarbonRegisterationStore(String typeRegisterationStore) {
		// TODO Auto-generated method stub
		if(typeRegisterationStore.equalsIgnoreCase("registerationSystem"))
		{
			totalCarbonFootPrint+=10;
		}
		else if(typeRegisterationStore.equalsIgnoreCase("checkPayment"))
		{
			totalCarbonFootPrint+=4;
			
		}
		result=new Result();
		result.addToResults("CarbonFootPrint in tonnes of CO2", totalCarbonFootPrint);
		
	}

	/**
	 * This method calculates the carbonfootprint for the activity of Dorm selection
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void addCarbonDormSelection(String typeDormSelection) {
		// TODO Auto-generated method stub
		if(typeDormSelection.equalsIgnoreCase("adminCost"))
		{
			totalCarbonFootPrint+=3;
		}
		else if(typeDormSelection.equalsIgnoreCase("onlineGamingCost"))
		{
			totalCarbonFootPrint+=4;
		}
	
		result.addToResults("CarbonFootPrint in tonnes of CO2", totalCarbonFootPrint);
	
	}

}
