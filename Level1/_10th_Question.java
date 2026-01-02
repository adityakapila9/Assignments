import java.util.Scanner;

class _10th_Question {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double heightCm;
        double inchesPerCm = 1 / 2.54;

        System.out.print("Enter height in cm: ");
        heightCm = input.nextDouble();

        double totalInches = heightCm * inchesPerCm;
        int feet = (int) totalInches / 12;
        double inches = totalInches % 12;

        System.out.println(
            "Your Height in cm is " + heightCm +
            " while in feet is " + feet +
            " and inches is " + inches
        );
    }
}
