import java.util.Scanner;

class CompoundInterestCalculator {

    double principal;
    double annualInterestRate;
    int numberOfCompounds;
    int years;
    double futureValue;
    double totalInterest;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment amount : ");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate : ");
        annualInterestRate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times the interest is compounded per year: ");
        numberOfCompounds = scanner.nextInt();

        System.out.print("Enter the duration of the investment (in years): ");
        years = scanner.nextInt();

        scanner.close();
    }

    public void calculateFutureValue() {
        futureValue = principal * Math.pow(1 + (annualInterestRate / numberOfCompounds), numberOfCompounds * years);
        totalInterest = futureValue - principal;
    }

    public void printRecord() {
        System.out.printf("Future Value of the investment: %.2f", futureValue);
        System.out.printf("Total Interest Earned: %.2f ", totalInterest);
    }
    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();

        calculator.acceptRecord();

        calculator.calculateFutureValue();

        calculator.printRecord();
    }
}

