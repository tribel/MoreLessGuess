package view;

/**
 * 
 * @author Tribel
 *
 */
public class View {

	public static final String FIRST_MSG = "Hello! You should guess number from 0-100 range";
	public static final String RANGE = "Input value from this range: ";
	public static final String WRONG_INPUT = "Invalid input data , please try again!";
	public static final String LOW_GUESS = "Your guess was low than secret number. Try again";
	public static final String UPPER_GUESS = "Your guess was upper than secret number. Try again";
	public static final String INVALID_RANGE = "Try again , your have range: ";
	public static final String SECCESS = "Congratulations! It is right number!!";
	public static final String LEAVE_MSG = "Goodbye, in next time will be better !";
	public static final String ATTEMPTS_AMOUNT = "Attempts amount = ";
	public static final String SECRET_NUMBER = "Secret number : ";
	
	public View() {
	}
	
	
	/**
	 * Print info message
	 * @param msg output message
	 */
	public void printMessage(String msg) {
		System.out.println(msg);
	}
	
	
	/**
	 * Print info message about range  
	 * @param msg output message
	 * @param min lower range bound
	 * @param max upper range bound
	 */
	public void printRangeMessage(String msg ,int min, int max) {
		System.out.println(msg + "from " + min + " to " + max);
	} 
	
	/**
	 * Print statistic message
	 * @param msg output message
	 * @param number output number.
	 */
	public void printStatisticData(String msg, int number) {
		System.out.println(msg + number);
	}
}
