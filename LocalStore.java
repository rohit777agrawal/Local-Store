/*
Program for Local store sale.
Author: Rohit Agrawal
E-mail Address: ra2381@email.vccs.edu
Programming Project 4.
Last Changed: October 24, 2018.
*/

import java.util.Scanner;

public class LocalStore {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// array to keep data for the week
		double[] sale = new double[7];

		int countDays = 0;   //no. of inputs in array
		int option = 0;
		
		do{
			System.out.println("Press 1: To enter the day amount.\n" 
					+ "Press 2: To find the average of the week sales.\n"
					+ "Press 3: To find the highest amount of the week sales. \n"
					+ "Press 4: To find the lowest amount of the week sales. \n"
					+ "Press 5: To print all the information about the week sales. \n"
					+ "Press 6: To end the program");
			
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if (option == 1)  //sale starting with zero index
			{
				if(countDays >= 7)
				{
					System.out.println("You have filled all seven days sale!");
				}
				else
				{
					sale[countDays] = daySale();
					countDays++;
				}
				
			}
			else if (option ==2)  //find average
			{
				average(sale, countDays);
			}
			else if (option == 3)  //find highest amount
			{
				highestAmount(sale, countDays);
			}
			else if (option == 4)  //find lowest amount
			{
				lowestAmount(sale, countDays);
			}
			else if (option == 5)  // print all information
			{
				print(sale, countDays);
				average(sale, countDays);
				highestAmount(sale, countDays);
				lowestAmount(sale, countDays);
			}
			else if (option == 6) // end program
			{
				System.out.println("GoodBye!");
			}
			else  //Error! 
			{
				System.out.println("Invalid input! Please try again");
			}
			
		}while (option !=6);
		
		
		
		keyboard.close();
	}
	
	
	// method (static, return double, no parameter) ->-> adds value in array
	public static double daySale(){
		
		Scanner keyboard = new Scanner(System.in);
		
		do{
			System.out.println("Enter the next day amount");
			double amount = keyboard.nextDouble();
			
			if(amount <0){
				System.out.println("Invalid Input! Try again ->-> positive");
			}
			else{
				return amount;
			}
			
		}while (true);
	}
	
	// method (static, return statement, parameter -> array & countDays) ->-> finds average of array
	public static void average (double[] array, int countDays)
	{	
		double sum = 0;
		for (int i =0; i<countDays; i++)
		{
			sum += array[i];
		}
		double average = sum / countDays;
		
		System.out.println("The average sale of the week is: " + average );
		
	}
	
	// method (static, return statement, parameter -> array & countDays) ->-> finds highest amount of array
	public static void highestAmount (double[] array, int countDays){
		
		double highestAmount = array[0];
		for(int i =1; i<countDays; i++){
			if(highestAmount < array[i]){
				highestAmount = array[i];
			}
		
		}
		System.out.println("The highest sale of the week is: " + highestAmount);	
		
	}
	
	// method (static, return statement, parameter -> array & countDays) ->-> finds lowest amount of array
	public static void lowestAmount (double[] array, int countDays){
		
		double lowestAmount = array[0];
		for(int i =1; i<countDays; i++){
			if(lowestAmount > array[i]){
				lowestAmount = array[i];
			}
		
		}
		System.out.println("The lowest sale of the week is: " + lowestAmount);	
		
	}
	
	// method (static, return statement, parameter -> array & countDays) ->-> prints the values of array
	public static void print (double[] array, int countDays)
	{
		for (int i = 0; i<countDays; i++)
		{
			System.out.println("Sale Day " + (i+1) + " is: " + array[i] );
		}
	}
	
	
}
