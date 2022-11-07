import java.sql.*;
import java.util.Scanner;
public class home {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, humidity, moisture;
        float temperature;

        while (true){
            System.out.println("Select an option: ");
            System.out.println("1. Add values");
            System.out.println("2. View all values");
            System.out.println("3. Search values");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Add values");
                    break;
                case 2:
                    System.out.println("View all values");
                    break;
                case 3:
                    System.out.println("Search values");
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
            }


        }




    }
}
