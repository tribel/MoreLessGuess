package controller;

import java.util.Scanner;

import view.View;
import model.Model;

/**
 * 
 * @author Артем
 *
 */
public class Controller {

	private Model model;
	private View view;

	public Controller(Model m, View v) {
		this.model = m;
		this.view = v;
	}

	
	/**
	 * The game starting method.
	 */
	public void startGame() {
		view.printMessage(View.FIRST_MSG);
		Scanner sc = new Scanner(System.in);
		int tmpUserNumber = -1;

		while (tmpUserNumber != model.getNumber()) {
			tmpUserNumber = inputValidIntValueWithScanner(sc);
			
			if(tmpUserNumber < model.getNumber()) {
				view.printMessage(View.LOW_GUESS);
				model.setMinRange(tmpUserNumber);
			
			} else if(tmpUserNumber > model.getNumber()) {
				view.printMessage(View.UPPER_GUESS);
				model.setMaxRange(tmpUserNumber);
			}
			model.addOneAttempt();
		}

		view.printMessage(View.SECCESS);
		view.printStatisticData(View.ATTEMPTS_AMOUNT, model.getAttemptAmount());
		view.printStatisticData(View.SECRET_NUMBER, model.getNumber());
	}

	
	/**
	 * Checks input value from {@code Scanner}
	 * @param sc input value
	 * @return properly {@code int} number that falls in range 
	 */
	protected int inputValidIntValueWithScanner(Scanner sc) {
		view.printRangeMessage(View.RANGE, model.getMinRange(), model.getMaxRange());
		
		while (!sc.hasNextInt()) {

			view.printMessage(View.WRONG_INPUT);
			view.printRangeMessage(View.RANGE, model.getMinRange(), model.getMaxRange());
			sc.next();
		}
		
		int userValue = sc.nextInt();
		
		if(userValue < model.getMinRange() || userValue > model.getMaxRange()) {
			view.printRangeMessage(View.INVALID_RANGE, model.getMinRange(), model.getMaxRange());
			return inputValidIntValueWithScanner(sc);
		}
		
		return userValue;
	}
}
