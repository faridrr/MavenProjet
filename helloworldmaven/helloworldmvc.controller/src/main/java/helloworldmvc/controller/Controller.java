package helloworldmvc.controller;

import hellowordmvc.Contract.IModel;
import hellowordmvc.Contract.IView;

public class Controller {
	
	private IModel model;
	private IView view;


	public Controller(IView view , IModel model) {
		this.view = view;
		this.model = model ; 
	}
	
	
	public void run() {
		
		this.view.displayMessage(this.model.getHelloWorld());
	}

}
