import java.util.Scanner;

public class LoanApplication {

    void LoanApplication() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Number of Years: ");
        int numYears = sc.nextInt();

        System.out.print("Annual Interest Rate (in %): ");
        double annualInterestRate = sc.nextDouble();

        System.out.println(); // Insert a new line

        // Create a Loan object
        Loan loan = new Loan(annualInterestRate, numYears, loanAmount);

        // Print the amortization schedule
        printAmortizationSchedule(loan);
    }

    public static void printAmortizationSchedule(Loan loan) {
        double interestPaid, principalPaid, newBalance;
        double monthlyPayment, totalPayment;
        int month;
        int numMonths = loan.getNumberOfYears() * 12;

        // Output monthly payment and total payment
        monthlyPayment = loan.getMonthlyPayment();
        totalPayment = loan.getTotalPayment();
        System.out.format("Monthly Payment: %8.2f%n", monthlyPayment);
        System.out.format("Total Payment:   %8.2f%n", totalPayment);

        // Print the table header
        printTableHeader();

        double principal = loan.getLoanAmount();
        for (month = 1; month <= numMonths; month++) {
            // Compute amount paid and new balance for each payment period
            interestPaid = principal * (loan.getAnnualInterestRate() / 1200);
            principalPaid = monthlyPayment - interestPaid;
            newBalance = principal - principalPaid;

            // Output the data item
            printScheduleItem(month, interestPaid, principalPaid, newBalance);

            // Update the balance
            principal = newBalance;
        }
    }

    private static void printScheduleItem(int month, double interestPaid,
            double principalPaid, double newBalance) {
        System.out.format("%8d%10.2f%10.2f%12.2f\n",
                month, interestPaid, principalPaid, newBalance);
    }

    private static void printTableHeader() {
        System.out.println("\nAmortization schedule");
        for (int i = 0; i < 40; i++) { // Draw a line
            System.out.print("-");
        }
        System.out.format("\n%8s%10s%10s%12s\n",
                "Payment#", "Interest", "Principal", "Balance");
        System.out.format("%8s%10s%10s%12s\n\n",
                "", "paid", "paid", "");
    }
}
