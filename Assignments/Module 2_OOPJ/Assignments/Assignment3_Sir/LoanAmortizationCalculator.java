import java.util.Scanner;

public class LoanAmortizationCalculator {

    double principal;
    double annualInterestRate;
    int loanTerm;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the loan principal amount : ");
        principal = scanner.nextDouble();
        
        System.out.print("Enter the annual interest rate : ");
        annualInterestRate = scanner.nextDouble();
        
        System.out.print("Enter the loan term (in years): ");
        loanTerm = scanner.nextInt();
        
        scanner.close();
    }

    public double calculateMonthlyPayment() {
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numberOfMonths = loanTerm * 12;
        
        double monthlyPayment = principal * 
                                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / 
                                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
        
        return monthlyPayment;
    }

    public void printRecord(double monthlyPayment) {
        int numberOfMonths = loanTerm * 12;
        double totalPayment = monthlyPayment * numberOfMonths;
        
        System.out.println("Monthly Payment : " + monthlyPayment);
        System.out.println("Total Payment over the life of the loan: "+ totalPayment);
    }
    public static void main(String[] args) {
        LoanAmortizationCalculator calculator = new LoanAmortizationCalculator();
    
        calculator.acceptRecord();

        double monthlyPayment = calculator.calculateMonthlyPayment();
        
        calculator.printRecord(monthlyPayment);
    }
}
