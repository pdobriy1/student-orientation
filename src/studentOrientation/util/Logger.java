package studentOrientation.util;

public class Logger {
	
	public static enum DebugLevel {
		RESULTSUM, DATASTRUCTURECONTENTS, NEWENTRY, THREADRUN, CONSTRUCTOR 
	};

	private static DebugLevel debugLevel;

	/**
	 * This static method sets the debug level
	 * 
	 * @param int level.
	 * @return Nothing.
	 */
	
	public static void setDebugValue(int levelIn) {
		switch (levelIn) {
		case 0:
			debugLevel = DebugLevel.RESULTSUM;
			break;

		case 1:
			debugLevel = DebugLevel.DATASTRUCTURECONTENTS;
			break;

		case 2:
			debugLevel = DebugLevel.NEWENTRY;
			break;

		case 3:
			debugLevel = DebugLevel.THREADRUN;
			break;

		case 4:
			debugLevel = DebugLevel.CONSTRUCTOR;
			break;
		}
	}

	public static void setDebugValue(DebugLevel levelIn) {
		debugLevel = levelIn;
	}

	/**
	 * This method wrties the message to the stdout
	 * 
	 * @param String message and int debuglevel.
	 * @return Nothing.
	 */
	public static void writeMessage(String message, DebugLevel levelIn) {
		if (levelIn == debugLevel)
			System.out.println(message);
	}

	public String toString() {
		return "Debug Level is " + debugLevel;
	}
}
