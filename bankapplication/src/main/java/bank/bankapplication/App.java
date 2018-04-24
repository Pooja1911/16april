package bank.bankapplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

import org.hamcrest.core.IsInstanceOf;

/**
 * author : pooja jain 
 * project Name:  bank application
 * project description: executing all functions for bank application
 *
 */
public class App {
	final static Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {

		final Scanner scan = new Scanner(System.in);
		List list = null;

		final Set<String> bankname = new HashSet();
		bankname.add("Axis");// adding bank using set
		final Address address = new Address("newsheep", "12", "2012", "Delhi");// adding address details of bank
		final Contact contactbank = new Contact(900787865, 234782, "axis@gmail.com", address);// adding contact
																								// detailsof bank
		LOGGER.info("Bank Address is" + contactbank);

		final Contact contact = new Contact(900121234, 230616, "pooja@gmail.com", address);
		final Customer customer = new Customer("Pooja", "jain", bankname);
		LOGGER.info("Customer Details are" + customer);
		LOGGER.info(" Customer Details are" + contact);
		Account account = null;
		while (true) {

			LOGGER.info("1. Saving Account");
			LOGGER.info("2 . Flexible SavingAccount");
			LOGGER.info("3. CheckingAccount");
			LOGGER.info("4. Exit");
			LOGGER.info("Enter your choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				account = new SavingAccount();// saving accounts object
				list = new ArrayList();
				if (account instanceof SavingAccount) {
					LOGGER.info("Enter the amount to deposit");
					float depositAmount = scan.nextFloat();
					if(depositAmount<0)
					{
						LOGGER.info("Please Enter valid amount");
						break;
					}else
					{
					list=account.deposit(depositAmount);//deposit account
					
					List list1 = account.getStatment(list);
					String content = "deposit";
					list1.add(content);
					list1.add(customer.getAccountNumber());
					list1.add(((SavingAccount) account).getBalance());
					LOGGER.info("Statement List" + list1);
					}
					LOGGER.info("Enter the amount to withdraw");
					
					float withdrawlAmount = scan.nextFloat();
					if (((SavingAccount) account).getBalance() < 500)

					{
						LOGGER.info("Minimum balance should be 500!!!");// check for minimum balance
					} else {
						list = account.withdraw(withdrawlAmount);//withrawing method
						List list2 = account.getStatment(list);
						String  content = "withraw";
						list2.add(content);
						list2.add(customer.getAccountNumber());
						list2.add(((SavingAccount) account).getBalance());
					
						LOGGER.info("Statement List" + list2);
					}
				}
				break;

			case 2:
				account = new FlexibleSavingAccount();// fexible saving account object
				if (account instanceof FlexibleSavingAccount) {
					LOGGER.info("Enter the amount to deposit");
					float depositAmount = scan.nextFloat();
					list=account.deposit(depositAmount);//deposit for flexible account
					if(depositAmount<0)
					{
						LOGGER.info("Please Enter valid amount");
						break;
					}else
					{
					List list1 = account.getStatment(list);
					String content = "withraw";
					list1.add(content);
					list1.add(customer.getAccountNumber());
					list1.add(((FlexibleSavingAccount) account).getBalance());
					LOGGER.info("List is"+list1);
					}
					LOGGER.info("Enter the amount to withdraw");
					float withdrawlAmount = scan.nextFloat();//withdraw for flexible account
					if (((FlexibleSavingAccount) account).getBalance() < 500)// check for minimum balance

					{
						LOGGER.info("Minimum balance should be 500!!!");
					} else {
						list = account.withdraw(withdrawlAmount);
						List list2 = account.getStatment(list);
					    String content = "withraw";
						list2.add(content);
						list2.add(customer.getAccountNumber());
						list2.add(((FlexibleSavingAccount) account).getBalance());
						LOGGER.info("List is"+list2);
				}
				}
				break;
			case 3:
				account = new CheckingAccount();
				if (account instanceof CheckingAccount)// checking account object
				{
					LOGGER.info("Enter the amount to deposit");
					float depositAmount = scan.nextFloat();
					if(depositAmount<0)
					{
						LOGGER.info("Please Enter valid amount");
						break;
					}else
					{
					list=account.deposit(depositAmount);
					List list1 = account.getStatment(list);
					String content = "withraw";
					list1.add(content);
					list1.add(customer.getAccountNumber());
					list1.add(((CheckingAccount) account).getBalance());
					LOGGER.info("Today's list" + list1);
					}
					LOGGER.info("Enter the amount to withdraw");
					float withdrawlAmount = scan.nextFloat();
					if (((CheckingAccount) account).getBalance() < 500)// check for minimum balance

					{
						LOGGER.info("Minimum balance should be 500!!!");
					} else {
						list = account.withdraw(withdrawlAmount);
						List list2 = account.getStatment(list);
						 String content = "withraw";
						list2.add(content);
						list2.add(customer.getAccountNumber());
						list2.add(((CheckingAccount) account).getBalance());
						LOGGER.info("Today's list" + list2);
					}
				}
				break;
			case 4:
				LOGGER.info("BYE");
				System.exit(0);

				break;

			}
		}

		// saving.setBalance(500);
		}
	}

