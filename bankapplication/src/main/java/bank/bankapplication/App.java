package bank.bankapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.hamcrest.core.IsInstanceOf;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner  scan=  new Scanner(System.in);
     //  final String []bank1= {"Axis","Standard Charted","HDFC","SBI"};
        Map<Customer,String> map=new HashMap();
        map.put(new Customer("Pooja","jain"),"Axis");
        map.put(new Customer("Sonam","Pandey"),"HDFC");
        map.put(new Customer("Aiswariya","sawant"),"SBI");
        map.put(new Customer("Anjali","panwar"),"Standared Charted");
        map.put(new Customer("Sushmitha","holla"),"Axis");
        System.out.println(map);
        Account account=null;
         //account=new SavingAccount();
        SavingAccount savingAccount=new SavingAccount();
        FlexibleSavingAccount flexibleSavingAccount= new FlexibleSavingAccount();
        CheckingAccount checkingAccount=new CheckingAccount();
       // saving.setBalance(500);
       if(account instanceof SavingAccount)
       {
        System.out.println("Enter the amount to deposit");
        float depositAmount=scan.nextFloat();
        account.deposit(depositAmount);
        System.out.println("Enter the amount to withdraw");
        float withdrawlAmount=scan.nextFloat();
        if(((SavingAccount) account).getBalance()<500)
        
        {
        	System.out.println("Minimum balance should be 500!!!");
        }
        else
        {
        	  account.withdraw(withdrawlAmount);
        }
       }
       
       //account=new FlexibleSavingAccount();
       if(account instanceof FlexibleSavingAccount)
       {
        System.out.println("Enter the amount to deposit");
        float depositAmount=scan.nextFloat();
        account.deposit(depositAmount);
        System.out.println("Enter the amount to withdraw");
        float withdrawlAmount=scan.nextFloat();
        if(((FlexibleSavingAccount) account).getBalance()<500)
            
        {
        	System.out.println("Minimum balance should be 500!!!");
        }
        else
        {
        	  account.withdraw(withdrawlAmount);
        }
       }
       account=new CheckingAccount();
       if(account instanceof CheckingAccount)
       {
        System.out.println("Enter the amount to deposit");
        float depositAmount=scan.nextFloat();
        account.deposit(depositAmount);
        System.out.println("Enter the amount to withdraw");
        float withdrawlAmount=scan.nextFloat();
        if(((CheckingAccount) account).getBalance()<500)
            
        {
        	System.out.println("Minimum balance should be 500!!!");
        }
        else
        {
        	  account.withdraw(withdrawlAmount);
        }
       }  
    }
}
