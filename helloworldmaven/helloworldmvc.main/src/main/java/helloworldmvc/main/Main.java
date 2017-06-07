package helloworldmvc.main;

import java.io.IOException;

import helloworldmvc.Contract.IModel;
import helloworldmvc.Contract.IView;
import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Main {

	public static void main(final String[] args) throws IOException {
		// TODO Auto-generated method stub
		final IModel model = new Model();
		final IView view = new View();
		final Controller controller = new Controller(view, model);

		controller.run();
	}

}
