package helloworldmvc.model;

import java.io.IOException;

import helloworldmvc.Contract.IModel;

public class Model implements IModel {

	public String getHelloWorld() throws IOException {

		return DAOHelloWorld.getInstance().getHelloWorldMessage();
	}

}
