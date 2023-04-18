public class StageThree {

    /**
     * check for the customer to be defaulter
     */
    boolean main(Customer customer) {

        // check if the customer is defaulter by checking the sibil score

        if (customer.getSibilScore() > 700) {

            return true;

        } else {

            return false;

        }

    }

}

