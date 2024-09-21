import java.util.Scanner;

class BMITracker {

    double weight;
    double height;
    double bmi;
    String classification;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (in kilograms): ");
        weight = scanner.nextDouble();

        System.out.print("Enter height (in meters): ");
        height = scanner.nextDouble();

        scanner.close();
    }
    public void calculateBMI() {
        bmi = weight / (height * height);
    }

    public void classifyBMI() {
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            classification = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            classification = "Overweight";
        } else if (bmi >= 30) {
            classification = "Obese";
        }
    }

    public void printRecord() {
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("BMI Classification: " + classification);
    }
    public static void main(String[] args) {
        BMITracker tracker = new BMITracker();

        tracker.acceptRecord();
        tracker.calculateBMI();
        tracker.classifyBMI();
        tracker.printRecord();
    }
}

