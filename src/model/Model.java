package model;

/**
 * 
 * @author Артем
 *
 */
public class Model {

	private int number;
	private int minRange;
	private int maxRange;
	private int attemptAmount;

	public Model() {
		this.maxRange = 0;
		this.maxRange = 100;
		this.number = rand(minRange, maxRange);
	}

	/**
	 * 
	 * @param min lower bound of random value
	 * @param max upper bound of random value
	 * @return random {@code int} generate number.
	 */
	
	protected int rand(int min, int max) {
		return min + (int) (Math.random() * (max - min + 1));
	}

	/**
	 * 
	 * @return random {@code int} generate number from 0 to max Integer value.
	 * @see Integer.MAX_VALUE
 	 */
	
	protected int rand() {
		return (int) (Math.random() * Integer.MAX_VALUE);
	}

	public void addOneAttempt() {
		this.attemptAmount++;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getMinRange() {
		return minRange;
	}

	public void setMinRange(int minRange) {
		this.minRange = minRange;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public int getAttemptAmount() {
		return attemptAmount;
	}

	@Override
	public String toString() {
		return "Model [number=" + number + ", minRange=" + minRange
				+ ", maxRange=" + maxRange + "]";
	}

}
