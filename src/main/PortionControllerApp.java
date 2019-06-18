package main;

import controller.PortionControllerController;
import model.PortionControllerModel;
import view.PortionControllerView;

public class PortionControllerApp {
	
	public static void main(String args[]) {

		PortionControllerModel model = new PortionControllerModel();
		PortionControllerView view = new PortionControllerView();
		PortionControllerController controller = new PortionControllerController(model, view);
	}
}
