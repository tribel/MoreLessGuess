package model;

/**
 * 
 * @author Tribel
 *
 */
public class Model {

	private static int START_LOWER_RANGE = 0;
	private static int START_UPPER_RANGE = 100;
	
	private int number;
	private int minRange;
	private int maxRange;
	private int attemptAmount;

	public Model() {
		this.maxRange = START_LOWER_RANGE;
		this.maxRange = START_UPPER_RANGE;
		this.number = rand(minRange, maxRange);
	}

	/**
	 * 
	 * @param min lower bound of random value
	 * @param max upper bound of random value
	 * @return random {@code int} generate number.
	 */
	
	protected final int rand(final int min, final int max) {
		return min + (int) (Math.random() * (max - min + 1));
	}

	/**
	 * 
	 * @return random {@code int} generate number from 0 to max Integer value.
	 * @see Integer.MAX_VALUE
 	 */
	
	protected final int rand() {
		return (int) (Math.random() * Integer.MAX_VALUE);
	}

	public final void addOneAttempt() {
		this.attemptAmount++;
	}
	
	public final int getNumber() {
		return number;
	}

	public final void setNumber(final int number) {
		this.number = number;
	}

	public final int getMinRange() {
		return minRange;
	}

	public final void setMinRange(final int minRange) {
		this.minRange = minRange;
	}

	public final int getMaxRange() {
		return maxRange;
	}

	public final void setMaxRange(final int maxRange) {
		this.maxRange = maxRange;
	}

	public final int getAttemptAmount() {
		return attemptAmount;
	}

	@Override
	public final String toString() {
		return "Model [number=" + number + ", minRange=" + minRange
				+ ", maxRange=" + maxRange + "]";
	}

}
