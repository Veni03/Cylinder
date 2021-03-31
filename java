package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextInt();
        double h = scanner.nextInt();
        double V = 0;
        double B = 0;
        V = Math.PI * Math.sqrt(r) * h;
        B = 2 * Math.PI * r * h;
        System.out.println("V = " + V);
        System.out.println("B = " + B);
    }
}
