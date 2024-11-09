import java.util.Scanner;
public class kalkulator {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); // Reading from System.in
        System.out.println("Enter a first number: ");
        float firstNumberZiolog = reader.nextInt();  // Scans the next token of the input as float
        System.out.println("Enter a second number: ");
        float secondNumberZiolog = reader.nextInt(); // Scans the next token of the input as float
        reader.close();

        float sumaZiolog = firstNumberZiolog + secondNumberZiolog;
                System.out.println("Suma podanych liczb to " + sumaZiolog);

        float roznicaZiolog = firstNumberZiolog - secondNumberZiolog;
                System.out.println("Roznica podanych liczb to " + roznicaZiolog);

        float iloczynZiolog = firstNumberZiolog * secondNumberZiolog;
            System.out.println("Iloczyn podanych liczb to " + iloczynZiolog);
        float ilorazZiolog = firstNumberZiolog / secondNumberZiolog;
            System.out.println("Iloraz podanych liczb to " + ilorazZiolog);
    }
}
