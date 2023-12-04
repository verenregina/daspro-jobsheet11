import java.util.Scanner;

public class NestedLoop29ModifikasiNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        // Menampilkan array dan nilai rata-rata setiap kota
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            double total = 0;

            // Menampilkan nilai suhu harian dan menghitung total
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
                total += temps[i][j];
            }

            // Menghitung dan menampilkan nilai rata-rata
            double average = total / temps[0].length;
            System.out.println("\nRata-rata: " + average);
            System.out.println();
        }
    }
}
