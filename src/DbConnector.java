import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

    public class DbConnector extends NewUser{

        private static String jdbcURL = "jdbc:postgresql://localhost:5432/FlightReservations?useSSL=false";
        private static String username = "postgres";
        private static String password = "Bartekpuma1";
        static Connection connection;

        public static void connect_to_db(){
            try{
                connection = DriverManager.getConnection(jdbcURL, username, password);

                addData(name, surname, sex, birthDate, phoneNumber);


            }catch(SQLException e){
                System.out.println("Error in connecting to Db");
                e.printStackTrace();
            }
        }

        private static  void addData (String name, String surname, String sex, String birthDate, int phoneNumber)throws SQLException{

            String query = "INSERT INTO members VALUES (DEFAULT, '"+name+"', '"+surname+"', '"+sex+"', '"+birthDate+"', '"+phoneNumber+"');";
            Statement stmt = null;
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            connection.close();

        }
    }


