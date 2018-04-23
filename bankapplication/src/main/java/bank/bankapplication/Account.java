package bank.bankapplication;

import java.util.List;

/**
 * @author pooja jain
 * Project name: Bank application
 * Project description: created interface account
 *
 *
 */
public interface Account {

public List  withdraw(float amount); //to withdraw the amount
public List deposit(float amount); // to deposit some amount
public List<Account> getStatment(List list);//for getting statement
}
