package main;

import view.View;
import model.Model;
import controller.Controller;

/**
 * 
 * @author Артем
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		Model model = new Model();
		View view = new View();
		
		Controller controller = new Controller(model, view);
		controller.startGame();
	}
}
