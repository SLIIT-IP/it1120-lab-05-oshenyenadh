import java.util.Scanner;
	public class IT24101268Lab5Q3{
 	public static void main (String[]args){
	Scanner input = new Scanner (System.in);
	 

       final double costperday = 48000;
	   final int daythreetofour = 10/100;
	   final int morefive= 20/100;
           
 	   System.out.print("Enter the starting day(1-31):");
           int startdate = input.nextInt();

           System.out.print("Enter the leaving date");
           int enddate = input.nextInt();
           
			if(startdate<1){
			System.out.println("startdate isn't valid.terminate program");
			}
			if(enddate>31){
			System.out.println("leaving date isn't valid.terminate program");
			}
			if(startdate>enddate){
			System.out.println("starting date and ending date aren't valid.terminate program");
		   }
		   int daysresevered = (enddate - startdate);
		   double totalamounnt= (daysresevered*costperday);
		   if (daysresevered >= 3 || daysresevered>=4){
			 totalamounnt-=(totalamounnt * daythreetofour);
		    } else if (daysresevered>5){
			totalamounnt-=(totalamounnt*morefive);
			}
			System.out.println("Numer of days resevered:"+daysresevered);
			System.out.println("total amount to be paid:"+totalamounnt);
			}
	}