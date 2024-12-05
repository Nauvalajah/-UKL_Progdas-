import java.util.Scanner;

public class Bola {

    // fungsi rumus luas permukaan bola
    public static double hitungLuasPermukaanBola(double r) {
        return 4 * Math.PI * r * r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari bola (r): ");
        double r = scanner.nextDouble();
        double luasPermukaan = hitungLuasPermukaanBola(r);
        System.out.printf("Luas permukaan bola dengan jari-jari %.0f adalah %.2f%n", r, luasPermukaan);
        scanner.close();
    }
}