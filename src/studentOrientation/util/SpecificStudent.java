package studentOrientation.util;

import java.util.ArrayList;
import java.util.List;

import studentOrientation.Activity.Books;
import studentOrientation.Activity.CampusTour;
import studentOrientation.Activity.Course;
import studentOrientation.Activity.Dorm;
import studentOrientation.ActivityI.BooksI;
import studentOrientation.ActivityI.CampusTourI;
import studentOrientation.ActivityI.CourseI;
import studentOrientation.ActivityI.DormI;
import studentOrientation.util.Logger.DebugLevel;
import studentOrientation.util.orientationChecklist.checklist;

public class SpecificStudent extends Student {
	private static List<String> desc;
	private CampusTourI campus;
	private BooksI books;
	private DormI dorm;
	private CourseI course;
	private static List<String> checklistselected=new ArrayList<String>();
	private String enumType="";
	
	
	public SpecificStudent() {
		Logger.writeMessage("Default Constructor of SpecificStudent called.",DebugLevel.CONSTRUCTOR);
	}
	/**
	 * @param studentchecklist1
	 * @param studentchecklist2
	 * @param studentchecklist3
	 * @param studentchecklist4
	 */
	public SpecificStudent(checklist studentchecklist1,checklist studentchecklist2,checklist studentchecklist3,checklist studentchecklist4)
	{
		Logger.writeMessage("Explicit value constructor of SpecificStudent called.",DebugLevel.CONSTRUCTOR);
		for(int i=1;i<=4;i++)
		{
			if(i==1)
			{
				enumType=studentchecklist1.name();
			}
			else if(i==2)
			{
				enumType=studentchecklist2.name();	
			}
			else if(i==3)
			{
				enumType=studentchecklist3.name();
			}
			else
			{
				enumType=studentchecklist4.name();
			}
			switch(enumType)
			{
			case "UNIVERSITYBOOKSTORE":
				checklistselected.add(checklist.UNIVERSITYBOOKSTORE.name());
				break;

			case "MANDOBOOKS":
				checklistselected.add(checklist.MANDOBOOKS.name());
				break;

			case "BUSRIDE":
				checklistselected.add(checklist.BUSRIDE.name());
				break;

			case "ONFOOT":
				checklistselected.add(checklist.ONFOOT.name());
				break;

			case "STANDINGQUEUE":
				checklistselected.add(checklist.STANDINGQUEUE.name());
				break;
			
			case "ONLINEGAME":
				checklistselected.add(checklist.ONLINEGAME.name());
				break;
			
			case "PAYMENTVIASYSTEM":
				checklistselected.add(checklist.PAYMENTVIASYSTEM.name());
				break;
				
			case "PAYMENTVIACHECK":
				checklistselected.add(checklist.PAYMENTVIACHECK.name());
				break;
				
			}
			
		}
		setDescription(checklistselected);
	}
	
	@Override
	public void setDescription(List<String> description) {
		// TODO Auto-generated method stub
		desc=description;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpecificStudent [campus=" + campus + ", books=" + books + ", dorm=" + dorm + ", course=" + course
				+ ", enumType=" + enumType + "]";
	}
	
	
	/**
	 * This method calculates the cost,duration,carbonfootprint,effort for the activity of campus tour
	 * @param nothing.
	 * @return nothing.
	 */

	@Override
	public void takeCampusTour() {
		// TODO Auto-generated method stub
		campus=new CampusTour();
		
		if(desc.contains("BUSRIDE"))
		{
			campus.busRide();
		}
		else
		{
			campus.onFoot();
		}
		
	}

	/**
	 * This method calculates the cost,duration,carbonfootprint,effort for the activity of buying books
	 * @param nothing.
	 * @return nothing.
	 */

	@Override
	public void takeBooks() {
		books=new Books();
		// TODO Auto-generated method stub
		if(desc.contains("MANDOBOOKS"))
		{
			books.mandoBooks();
		}
		else
		{
			books.universityBookStore();
		}
	}

	
	/**
	 * This method calculates the cost,duration,carbonfootprint,effort for the activity of dorm selection
	 * @param nothing.
	 * @return nothing.
	 */

	@Override
	public void takeDorm() {
		// TODO Auto-generated method stub
		dorm=new Dorm();
		if(desc.contains("STANDINGQUEUE"))
		{
			dorm.adminOffice();
		}
		else
		{
			dorm.onlineGaming();
		}
		
	}
	
	/**
	 * This method calculates the cost,duration,carbonfootprint,effort for the activity of registration system
	 * @param nothing.
	 * @return nothing.
	 */

	@Override
	public void takeModeOfPayment() {
		// TODO Auto-generated method stub
		course=new Course();
		if(desc.contains("PAYMENTVIACHECK"))
		{
			course.checkPayment();
			
		}
		else
		{
			course.registerationSystem();
		}
		
	}

	

}
