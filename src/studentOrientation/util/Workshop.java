package studentOrientation.util;

import studentOrientation.util.Logger.DebugLevel;

public class Workshop implements WorkshopI{

	
	
	
	public Workshop() {
		Logger.writeMessage("Default Constructor of Workshop called.",DebugLevel.CONSTRUCTOR);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Workshop []";
	}

	/* (non-Javadoc)
	 * @see studentOrientation.util.WorkshopI#construct(studentOrientation.util.Student)
	 */
	/**
	 * This method constructs the student checklist and calculates various values based on the student activity
	 * @param Student
	 * @return nothing
	 */
	@Override
	public void construct(Student stud) {
		// TODO Auto-generated method stub
		stud.takeCampusTour();
		stud.takeBooks();
		stud.takeDorm();
		stud.takeModeOfPayment();
	}

	
}
