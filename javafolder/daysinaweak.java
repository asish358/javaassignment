import java.util.Scanner;

public class daysinaweak {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number (1-7) to represent the day of the week: ");
    int daynumber = sc.nextInt();

    String dayname;

    switch (daynumber) {

        case 1:

            dayname = "Sunday";

            break;

        case 2:

            dayname = "Monday";

            break;

        case 3:

            dayname = "Tuesday";

            break;

        case 4:

            dayname = "Wednesday";

            break;

        case 5:

            dayname = "Thursday";

            break;

        case 6:

            dayname = "Friday";

            break;

        case 7:

            dayname = "Saturday";

            break;

        default:

            dayname = "Invalid day number. Please enter a value between 1 and 7.";

            break;

    }

    System.out.println("The day is: " + dayname);

    sc.close();

 }

}

    

