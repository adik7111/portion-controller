package controller;

import model.PortionControllerModel;
import view.PortionControllerView;

public class PortionControllerController {

	private PortionControllerModel model;
	private PortionControllerView view;
	
	public PortionControllerController(PortionControllerModel model, PortionControllerView view) {
		this.model = model;
		this.view = view;
	}
}
