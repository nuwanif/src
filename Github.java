
import java.time.*;  
import java.util.*;  


public class Github {
	

	public static void main(String args[])  

	{  
	  LocalDate dob= LocalDate.of(1986,9,13);  

	  LocalDate curDate= LocalDate.now();  

	  Period period= Period.between(dob, curDate); 

	  System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());


	}  
	}  


