import java.util.Scanner;

public class LoanApplication {

// printTableHeader
// printScheduleItem
    public static void printAmortizationSchedule(Customer customer) {
        System.out.println("Amortization Schedule");
        System.out.println("Principal: " + customer.getAmount());
        System.out.println("Interest Rate: " + customer.getInterestRate());
        System.out.println("Term: " + customer.getTerm());
        System.out.println();
        System.out.println("Month\tBalance\tInterest\tPrincipal\tPayment");
        System.out.println("0\t" + customer.getLoanAmount() + "\t0\t0\t0");
        for (int i = 1; i <= customer.getTerm(); i++) {
            double interest = customer.getLoanAmount() * customer.getInterestRate();
            double principal = customer.getMonthlyPayment() - interest;
            double balance = customer.getLoanAmount() - principal;
            System.out.println(i + "\t" + balance + "\t" + interest + "\t" + principal + "\t" + customer.getMonthlyPayment());
            customer.setLoanAmount(balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the customer's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the customer's annual interest rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Enter the term of the loan in years: ");
        int term = scanner.nextInt();
        scanner.close();

        Customer customer = new Customer(name, interestRate, loanAmount, term);
        customer.calculateMonthlyPayment();
        printAmortizationSchedule(customer);
    }

}

// Path: Customer.java
public class Customer {

    private String name;
    private double interestRate;
    private double loanAmount;
    private int term;

    public Customer(String name, double interestRate, double loanAmount, int term) {
        this.name = name;
        this.interestRate = interestRate;
        this.loanAmount = loanAmount;
        this.term = term;
    }

    public void calculateMonthlyPayment() {
        double monthlyInterestRate = interestRate / 12;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, term * 12));
        setMonthlyPayment(monthlyPayment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name)