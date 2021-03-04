package Exercise_02_Encapsulation.P01_ClassBox;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(reader.readLine());
        int w = Integer.parseInt(reader.readLine());
        int h = Integer.parseInt(reader.readLine());

        Box box = new Box(l, w, h);

        System.out.printf("Surface Area - %.2f%n", box.calculateSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f%n", box.calculateLateralSurfaceArea());
        System.out.printf("Volume - %.2f%n", box.calculateVolume());
    }
}
