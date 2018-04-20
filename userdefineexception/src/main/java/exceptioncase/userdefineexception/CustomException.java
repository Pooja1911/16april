
package exceptioncase.userdefineexception;

import java.util.Scanner;
import java.util.logging.Logger;

public class CustomException {
	final static Logger LOGGER = Logger.getLogger(CustomException.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Scanner scan = new Scanner(System.in);
		final int num1;
		final int num2;
		LOGGER.info("Enter value1");
		num1 = scan.nextInt();
		LOGGER.info("Enter value2");
		num2 = scan.nextInt();

		try {
			LOGGER.info("" + power(num1, num2));
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			LOGGER.info("java.lang.Exception:" + e.getMessage());
		}

	}

	public static int power(final int value, final int pow) throws InvalidInputException {

		if (value == 0 && pow == 0) {
			throw new InvalidInputException("number and power cannot be zero");

		} else if (value < 0 || pow < 0) {
			throw new InvalidInputException("number or power cannot be negative");
		} else if (pow > 0 && value > 0) {
			return value * power(value, pow - 1);
		} else {
			return 1;
		}

	}
}
