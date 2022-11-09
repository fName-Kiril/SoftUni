package box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double l = scanner.nextDouble();
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();


        Box box = new Box(l, w, h);

        System.out.printf("Surface Area - %.2f\n",box.calculateSurfaceArea(l, w, h));
    }
}