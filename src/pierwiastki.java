import java.util.Scanner;
import static java.lang.Math.*;

public class pierwiastki {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Reading from System.in
        System.out.println("Podaj a: ");
        int a = reader.nextInt();

        switch ((int) Math.signum(a)) {

            case 0    -> System.out.println("a musi być różne od 0");

            default   -> System.out.println("Super, przejdźmy dalej");
        }
        System.out.println("Podaj b: ");
        int b = reader.nextInt();
        System.out.println("Podaj c: ");
        int c = reader.nextInt();

        int delta = b^2 + 4*a*c;

       switch ((int) Math.signum(delta)) {
           case -1 -> System.out.println("Równanie nie ma rozwiązań");
           case 0 ->
              // int x = -b / 2*a;
                   System.out.println("Równanie ma jedno rozwiązanie:");
           case 1  -> System.out.println("Równanie ma dwa rozwiązania");
       }


    }
}
