package helloworldmvc.model;

public class DAOHelloWorld {

	private static String			FileName			= "HW.txt";
	private static DAOHelloWorld	instance			= null;
	private String					helloWorldMessage	= null;

	private DAOHelloWorld() {
		// TODO Auto-generated constructor stub
	}

	public static DAOHelloWorld getInstance() {
		return instance;
	}

	private static void setInstance(final DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}

	private void readFile() {

	}

	public String getHelloWorldMessage() {
		return this.helloWorldMessage;
	}

	public void setHelloWorldMessage(final String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

}
