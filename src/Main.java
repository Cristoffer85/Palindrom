//Textpalindrom
//Termer för övningen:
//    Palimdome är ett ord som är samma framifrån och bakifrån. Exempel på palindrom är "anna", "kajak" och "radar".
//    charAt() är en metod som tar en sträng som argument och returnerar ett tecken på den angivna positionen. Exempel:
//    "anna".charAt(0) returnerar "a".
//
//    length() är en metod som returnerar längden på en sträng. Exempel: "anna".length() returnerar 4.
//
//Instruktioner
//Skapa en metod som tar en sträng som argument och returnerar true om strängen är ett palindrom, annars false.
//I main-metoden, ska du fråga användaren om ett ord och sedan skriva ut om det är ett palindrom eller inte.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Hämta information ifrån användaren, scanner 1 - Fråga användaren om ett ord
        Scanner Palindrom1 = new Scanner(System.in);
        System.out.println("Skriv ord här för kontrollera om Palindrom eller ej: "); // Fråga användaren
        String word = Palindrom1.nextLine();

        // 2 - Skriv ut om det är ett palindrom eller inte
        if (isPalindromeWord(word)) {
            System.out.println(word + " är en palindrom");}

        else { System.out.println(word + " är inte en palindrom");
        }
    }

    public static boolean isPalindromeWord(String word) {
        for (int i = 0;
             i < word.length() / 2;
             i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
    // Skriv din metod här
    // 1 - Skapa en metod som tar en sträng som argument och returnerar true om strängen är ett palindrom, annars false.
