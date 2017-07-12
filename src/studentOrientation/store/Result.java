package studentOrientation.store;



import java.util.HashMap;
import java.util.Map;

import studentOrientation.util.Logger;
import studentOrientation.util.Logger.DebugLevel;

public class Result implements StdoutDisplayInterface{

	private static Map<String,Double> result = new HashMap<String,Double>();
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "Result []";
	}
	public Result() {
		Logger.writeMessage("Default Constructor of Result called.",DebugLevel.CONSTRUCTOR);
	}
	
	/**
	 * This method writes the cost,effort,duration and carbon foot print values to the screen
	 * @param nothing.
	 * @return nothing.
	 */
	@Override
	public void writeSumToScreen() {
		// TODO Auto-generated method stub
		for(Map.Entry<String, Double> entry:result.entrySet())
		{
			Logger.writeMessage(entry.getKey()+":"+Math.round(entry.getValue()),DebugLevel.RESULTSUM);

		}
		
		Logger.writeMessage("Contents of the Result's data structure : "+result,DebugLevel.DATASTRUCTURECONTENTS);
	}
	/**
	 * This method adds the cost,effort,duration and carbon foot print values to the result data structure
	 * 
	 * @param String,double.
	 * @return Nothing.
	 */

	@Override
	public void addToResults(String name,double val) {
		// TODO Auto-generated method stub
		if(name!=null)
		{
			result.put(name, val);
		}
		
	}

	
}
