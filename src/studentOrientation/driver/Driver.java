package studentOrientation.driver;

import studentOrientation.store.Result;
import studentOrientation.store.StdoutDisplayInterface;
import studentOrientation.util.Logger;
import studentOrientation.util.SpecificStudent;
import studentOrientation.util.Student;
import studentOrientation.util.Workshop;
import studentOrientation.util.WorkshopI;
import studentOrientation.util.orientationChecklist.checklist;
/**
 * The program implements an application that calculates effort,carbon footprint,durtion,cost 
 * based on the activicty performed by student for his orientation
 * @author Sriram Krishnan,Prateek Dobriyal
 * @version 1.0
 * @since 10-27-2016
 */
public class Driver {

	/**
	 * This is the main method which calls the concrete student class to calculate the activicty based values
	 * @param args
	 */
	public static void main(String args[])
	{
		int DEBUG_VALUE = 0;
		Logger.setDebugValue(DEBUG_VALUE);
		StdoutDisplayInterface results = new Result();
		Student stud=new SpecificStudent(checklist.BUSRIDE,checklist.UNIVERSITYBOOKSTORE,checklist.STANDINGQUEUE,checklist.PAYMENTVIASYSTEM);
		WorkshopI shop=new Workshop();
		shop.construct(stud);
		results.writeSumToScreen();
		
	}
}
