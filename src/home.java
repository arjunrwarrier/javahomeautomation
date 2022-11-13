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
                    System.out.println("Enter the temperature: ");
                    temperature = input.nextFloat();
                    System.out.println("Enter the humidity: ");
                    humidity = input.nextInt();
                    System.out.println("Enter the moisture: ");
                    moisture = input.nextInt();
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homeautomationdb","root","");
                        String sql = "INSERT INTO `sensorvalues`( `temperature`, `humidity`, `moisture`, `date`) VALUES (?,?,?,now())";
                        PreparedStatement stmt = con.prepareStatement(sql);
                        stmt.setFloat(1,temperature);
                        stmt.setInt(2,humidity);
                        stmt.setInt(3,moisture);
                        stmt.executeUpdate();
                    }
                    catch (Exception e ){
                        System.out.println(e);
                    }

                    break;
                case 2:
                    System.out.println("View all values");
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homeautomationdb","root","");
                        String sql = "SELECT  `temperature`, `humidity`, `moisture`, `date` FROM `sensorvalues` ";
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        while (rs.next()){
                            String fetchTemperature = rs.getString("temperature");
                            String fetchHumidity = rs.getString("humidity");
                            String fetchMoisture = rs.getString("moisture");
                            String fetchDate = rs.getString("date");

                            System.out.println("Temperature: "+fetchTemperature);
                            System.out.println("Humidity: "+fetchHumidity);
                            System.out.println("Moisture: "+fetchMoisture);
                            System.out.println("Date and Time: "+fetchDate+"\n");

                        }

                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Search values");
                    System.out.println("Enter the date to search: ");
                    String date = input.next();

                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homeautomationdb","root","");
                        String sql = "SELECT `temperature`, `humidity`, `moisture` FROM `sensorvalues` WHERE `date` ='"+date+"'";

                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                        while (rs.next()){
                            String fetchTemperature = rs.getString("temperature");
                            String fetchHumidity = rs.getString("humidity");
                            String fetchMoisture = rs.getString("moisture");


                            System.out.println("Temperature: "+fetchTemperature);
                            System.out.println("Humidity: "+fetchHumidity);
                            System.out.println("Moisture: "+fetchMoisture);

                        }



                    }
                    catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
            }


        }




    }
}
