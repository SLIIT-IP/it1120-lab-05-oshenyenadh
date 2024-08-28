import java.util.Scanner;
    public class IT24101268Lab5Q2{
        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
         System.out.println("enter the number of new members");
         int newmembers= input.nextInt();
         if (newmembers<0){
            System.out.println("invalid number of members");
           String prize = null;
           switch (newmembers){
            case 0:
                prize=("pen");
                break;
            case 1:
                prize=("umberlla");
                break;
            case 2:
                prize=("bag");
                break;
            case 3:
                prize=("traveling chair");
                break;
            case 4:
                prize=("headphone");
                break;    
           } 
           System.out.println("the prize"+newmembers+"The new member"+prize);
         } 
        }
    }