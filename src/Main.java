import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean start = true;

        while(start) {


            System.out.println("\n");
            System.out.println("1 - Dodaj pasa¿era");
            System.out.println("2 - wyœwietl pasa¿erów");
            System.out.println("3 - wyjdŸ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                   NewUser.create();
                   DbConnector.connect_to_db();

                    break;
                case 2:

                    // odczyt z bazy danych
                    break;
                case 3:
                    start = false;
                    break;
                default:
                    //taktyczna zjebka
                    System.out.println("1, 2 lub 3 a nie "+choice+" idioto");
            }
        }

        }
    }
