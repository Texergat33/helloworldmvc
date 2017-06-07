package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {

	private static String			FileName			= "HW.txt";
	private static DAOHelloWorld	instance			= null;
	private String					helloWorldMessage	= null;

	private DAOHelloWorld() throws IOException {
		// TODO Auto-generated constructor stub
		this.readFile();
	}

	public static DAOHelloWorld getInstance() throws IOException {
		if (instance == null) {
			setInstance(new DAOHelloWorld());
		}
		return instance;
	}

	private static void setInstance(final DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}

	public void readFile() throws IOException {
		final File f = new File(FileName);
		final FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		br = new BufferedReader(new FileReader(f));

		this.helloWorldMessage = br.readLine();
	}

	public String getHelloWorldMessage() {
		return this.helloWorldMessage;
	}

	public void setHelloWorldMessage(final String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

}
