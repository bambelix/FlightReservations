import java.util.Objects;
import java.util.Scanner;

public class NewUser {
    static String name;
    static String surname;
    static String sex;
    static  boolean sexAdded;
    static String birthDate;
    static int day;
    static int month;
    static int year;
    static int phoneNumber;

    

    public static void create(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imiê");
        name = scanner.nextLine();

        System.out.println("Podaj nazwisko");
        surname = scanner.nextLine();

        sexAdded = false;
        while (!sexAdded) {
            System.out.println("Podaj p³eæ M/K");
            sex = scanner.next();
            if (Objects.equals(sex, "M")) {
                sex = "Mê¿czyzna";
                sexAdded = true;
            } else if (Objects.equals(sex, "K")) {
                sex = "Kobieta";
                sexAdded = true;
            } else {
                System.out.println("B³êdna p³eæ");
            }
        }

        System.out.println("Podaj dzien urodzenia");
        day = scanner.nextInt();
        System.out.println("Podaj miesiac urodzenia");
        month = scanner.nextInt();
        System.out.println("Podaj rok urodzenia");
        year = scanner.nextInt();

        birthDate = Integer.toString(day) + "." + Integer.toString(month) + "." + Integer.toString(year);


        System.out.println("Podaj numer telefonu");
        phoneNumber = scanner.nextInt();
    }





}
