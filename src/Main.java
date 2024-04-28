import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Tam sayı giriniz : ");
        int tamSayi = input.nextInt();
        System.out.print("Ondalıklı sayı giriniz : ");
        double ondalikliSayi = input.nextDouble();

        // Convert the double number to an integer
        int ondaliklidonusen = (int) ondalikliSayi;
        // Convert the integer to a double number
        double tamdonusen = tamSayi;

        // Print the entered integer and double numbers
        System.out.println("Girilen Tam sayı : " + tamSayi);
        System.out.println("Girilen Ondalıklı Sayı : " + ondalikliSayi);

        // Print the converted numbers to the screen
        System.out.println("Tam sayıya dönüşen ondalıklı sayı : " + ondaliklidonusen);
        System.out.println("Ondalıklı sayıya dönüşen tam sayı : " + tamdonusen);

    }
}