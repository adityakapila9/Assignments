 
import java.util.Scanner;

class _2nd_Question {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double baseCm;
        double heightCm;

        System.out.print("Enter base in cm: ");
        baseCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        heightCm = input.nextDouble();

        double areaSquareCm = 0.5 * baseCm * heightCm;

        double cmToInch = 1 / 2.54;
        double baseInch = baseCm * cmToInch;
        double heightInch = heightCm * cmToInch;

        double areaSquareInch = 0.5 * baseInch * heightInch;

        System.out.println(
            "The Area of the triangle in sq in is " + areaSquareInch +
            " and sq cm is " + areaSquareCm
        );
    }
}

