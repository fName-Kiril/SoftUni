import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here


        String[] days = new String[]{
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
        };

        int day = Integer.parseInt(scanner.nextLine());

        if (day > 0 & day < 8){
            System.out.println(days[day-1]);
        }
        else {
            System.out.println("Invalid day!");
        }
    }
}
