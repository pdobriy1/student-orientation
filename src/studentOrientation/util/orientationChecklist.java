/**
 * 
 */
package studentOrientation.util;

/**
 * @author sriramkrishnan,prateek dobriyal
 *
 */
public class orientationChecklist {

	public static enum checklist {
		UNIVERSITYBOOKSTORE, MANDOBOOKS,BUSRIDE,ONFOOT,STANDINGQUEUE,ONLINEGAME,
		PAYMENTVIASYSTEM,PAYMENTVIACHECK 
	};
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "orientationChecklist [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
