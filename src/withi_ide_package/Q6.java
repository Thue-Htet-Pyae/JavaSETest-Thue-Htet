package withi_ide_package;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Day");
        String day = sc.nextLine();

        switch (day){
            case "Monday":
                System.out.println("Workday");break;
            case "Tuesday":
                System.out.println("Workday");break;
            case "Wednesday":
                System.out.println("Workday");break;
            case "Thursday":
                System.out.println("Workday");break;
            case "Friday":
                System.out.println("Workday");break;
            case "Saturday":
                System.out.println("Holiday");break;
            case "Sunday":
                System.out.println("Holiday");break;
            default:
                System.out.println("Input error");break;
        }
    }
}
