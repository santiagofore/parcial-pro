import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        int number = scanner.nextInt();
        scanner.close();

        int digitCount = countDigits(number);

        System.out.println("El número de dígitos es: " + digitCount);
    }

    
    public static int countDigits(int number) {
        
        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}