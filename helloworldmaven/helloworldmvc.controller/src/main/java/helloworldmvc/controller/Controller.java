package helloworldmvc.controller;

import java.io.IOException;

import helloworldmvc.Contract.IModel;
import helloworldmvc.Contract.IView;

public class Controller {

	private final IView		view;
	private final IModel	model;

	public Controller(final IView view, final IModel model) {
		// TODO Auto-generated constructor stub
		this.view = view;
		this.model = model;
	}

	public void run() throws IOException {
		this.view.displayMessage(this.model.getHelloWorld());
	}
}
