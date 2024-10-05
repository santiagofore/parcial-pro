import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto:");
        String input = scanner.nextLine();
        scanner.close();

        int wordCount = countWords(input);

        System.out.println("El número de palabras es: " + wordCount);
    }

    public static int countWords(String str) {
        
        str = str.trim();

        if (str.isEmpty()) {
            return 0;
        }

        String[] words = str.split("\\s+");

        return words.length;
    }
}


