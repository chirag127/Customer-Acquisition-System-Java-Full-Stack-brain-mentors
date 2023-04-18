public class StageSix {

    void main(Customer customer) {
        // this is the last stage of the loan approval process and it tells details like
        // what isthe loan amount and the interest rate
        // and what is the emi that the customer has to pay
        // we need to calculate the emi and the interest rate

        double loanAmount = customer.getAmount();

        double interestRate = 0;

        if (customer.getLoanType().equals("HL")) {

            interestRate = 8.5;

        } else if (customer.getLoanType().equals("AL")) {

            interestRate = 10.5;

        }

        // calculate the emi

        double duration = customer.getDuration();

        double emi = loanAmount * interestRate * duration / (100 * duration);

        System.out.println("Loan amount: " + loanAmount);

        System.out.println("Interest rate: " + interestRate);

        System.out.println("EMI: " + emi);

    }

}
