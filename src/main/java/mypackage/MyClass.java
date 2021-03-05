package mypackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class MyClass {

	public static void main(String[] args) throws Exception {
		System.out.println("Hi!");

		System.out.println();

		// receive arguments
		System.out.printf("Received %d arguments%n", args.length);
		// print input arguments
		for (int i=0; i < args.length; i++) {
			System.out.printf("arg[%d] = %s%n", i, args[i]);
		}

		System.out.println();

		// load configuration properties
		try {
			InputStream inputStream = MyClass.class.getClassLoader().getResourceAsStream("config.properties");
			// variant for non-static methods:
			// InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");

			Properties properties = new Properties();
			properties.load(inputStream);

			System.out.printf("Loaded %d properties%n", properties.size());

			String minValue = properties.getProperty("min");
			System.out.printf("min: %s%n", minValue);

			String maxValue = properties.getProperty("max");
			System.out.printf("max: %s%n", maxValue);

			String workDirValue = properties.getProperty("workDir");
			System.out.printf("workDir: %s%n", workDirValue);

		} catch (IOException e) {
			System.out.printf("Failed to load configuration: %s%n", e);
		}

		System.out.println();

		System.out.println("Bye!");
	}

}
