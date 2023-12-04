import java.util.Scanner;
import java.util.Random;

public class ModifikasiNo3Quiz29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            int attempts = 0;

            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();

                attempts++;

                if (answer == number) {
                    success = true;
                    System.out.println("Selamat! Anda berhasil menebak angka " + number + " dengan " + attempts + " percobaan.");
                } else if (answer < number) {
                    System.out.println("Tebakan terlalu kecil. Coba lagi!");
                } else {
                    System.out.println("Tebakan terlalu besar. Coba lagi!");
                }
            } while (!success);

            System.out.print("Apakah Anda ingin mengulang permainan (Y/T)? ");
            menu = input.next().charAt(0);
            input.nextLine();
        } while (menu == 'Y' || menu == 'y');
    }
}
