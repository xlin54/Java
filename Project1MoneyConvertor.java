package allProject;
/**
 * Convert a monetary amount into fewest number of each bill and coin needed 
 * to represent that amount, starting with the highest bill $10.
 * @author Xiao Yi Lin
 * @version 1.0
 */
import java.util.Scanner;
/**
 * bring in Scanner class into our program to create a Scanner object
 * get input from the user through the scanner
 */

public class Project1MoneyConvertor {
/**
 * Converts monetary amount into fewest number of $10, $5, &1, $.25, $.05, &.01 
 * @param args A reference to a string array containing command-line arguments 
 */
	public static void main(String[] args) {
		// 2.Declare variables:
		double orignalAmount;
		int amountInPennies;
		int remainBalance = 0;
		int tenDollarsBills = 0;
		int fiveDollarBills = 0;
		int oneDollarBills = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;

		/**
		 * system.in allows users to type in the amount in the console
		 * get input from the user with a Scanner object called scan
		 */
		// 3.Get an input from the user, store the user input as originalAmount.
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter monetary amount: ");
		        orignalAmount = scan.nextDouble();
// important!, 	orignalAmount entered will be in pennies by multiplying by 100, 5 dollars equals 500 pennies		        
		        // 4.Calculate the originalAmount into pennies:(orignalAmount * 100);
		        // 5.(int) cast is used to convert ( orignalAmount * 100) into a integer 
		        // 6.Store the result of (int)( orignalAmount * 100) as amountInPennies
		        amountInPennies = (int)( orignalAmount * 100);
		        
		        // 7.Calculate the number of $10 bills in amountInPennies: 
		        // (amountInPennies / 1000), store the result as tenDollarsBills. 
		        // 8.Calculate the remainder: amountInPennies module 1000, 
		        // and store the remainder as remainBalance
// may, both amountInPennies and 1000 is in pennies.
		        if(amountInPennies >= 1000)
		        {  
		        	tenDollarsBills = amountInPennies / 1000;
		        	remainBalance = amountInPennies % 1000;
		        }  
		        
		        // 9.Calculate the number of $5 bills in remainBalance, 
		        // divide remainBalance by 500, and store the result as fiveDollarBills.
		        // 10.Calculate the remainder: remainBalance module 500, 
		        // and store the remainder as remainBalance 
// important!!	maybe	        // 5015 the 5 dollar is in pennies,so 500 divide by 500?  4.Calculate the originalAmount into pennies:
		        if(remainBalance >= 500)
		        {
		        	fiveDollarBills = remainBalance / 500;
		        	remainBalance = remainBalance % 500;
		        } 
		        
		        // 11.Calculate the number of $1 bills in remainBalance,
		        // divide remainBalance by 100, and store the result as oneDollarBills.
		        // 12.Calculate the remainder: remainBalance module 100, 
		        // and store the remainder as remainBalance
		        if(remainBalance >= 100)
		        {
		        	oneDollarBills = remainBalance / 100;
		        	remainBalance = remainBalance % 100;
		        } 
		        
		        // 13.Calculate the number of $0.25 quarters in remainBalance, 
		        // divide remainBalance by 25, and store the result as quarters.
		        // 14.Calculate the remainder: remainBalance module 25, 
		        // and store the remainder as remainBalance 
		        if(remainBalance >= 25)
		        {
		        	quarters = remainBalance / 25;
		        	remainBalance = remainBalance % 25;
		        } 
		        
		        // 15.Calculate the number of $0.10 coins in remainBalance, 
		        // divide remainBalance by 10, and store the result as dimes.
		        // 16.Calculate the remainder: remainBalance module 10, 
		        // and store the remainder as remainBalance 
		        if(remainBalance >= 10)
		        {
		        	dimes = remainBalance / 10;
		        	remainBalance = remainBalance % 10;
		        } 
		        
		        // 17.Calculate the number of $0.05 coin bills in remainBalance, 
		        // divide remainBalance by 5, and store the result as nickels.
		        // 18.Calculate the remainder: remainBalance module 5, 
		        // and store the remainder as remainBalance 
// One nickel can be written 5¢ or $0.05.
// in dollars:  100 / 0.05 = 2000
// in cents :   There are 10,000 pennies in 100 dollars.
// maybe, nickels integer cuts decimal?
// why amountInPennies integer?		when it is already integer? what happens if in float?        
		        if(remainBalance >= 5)
		        {
		        	nickels = remainBalance / 5;
		        	amountInPennies = remainBalance % 5;
		        } 
		        
		        // 19.Assign pennies to remainBalance 
		        // because remainBalance is the remainder of remainBalance module 5. 
//maybe, is pennies = remainBalance; 0.05 goes in 100.01, 0.05 goes in 100 wholly but remainder of 0.01?
//[[and (0.01, 0.02, 0.03, 0.04, ) 0.05 does not go in,]] but 0.06 has 0.05 and remain 0.01
		        pennies = remainBalance;
		        
		        System.out.println("That's equivalent to");
		        //20.Output the number of $10
		        System.out.println(tenDollarsBills+" ten dollar bills");
		        //21.Output the number of $5
		        System.out.println(fiveDollarBills+" five dollar bills");
		        //22.Output the number of $1
		        System.out.println(oneDollarBills+" one dollar bills");
		        //23.Output the number of $0.25
		        System.out.println(quarters+" quaters");
		        //24.Output the number of $0.10
		        System.out.println(dimes+" dimes");
		        //25.Output the number of $0.5
		        System.out.println(nickels+" nickels");
		        //26.Output the number of $0.1
		        System.out.println(pennies+" pennies");
		        
		        scan.close();
		}
		 
		}

