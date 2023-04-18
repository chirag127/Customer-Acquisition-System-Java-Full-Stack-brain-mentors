import java.util.Scanner;

public class StageTwo {
    // Email - @ .com/.in
    // DOB
    // Income Annual
    // Liability
    // HL - 85%
    // AL - 55-60%
    // Duration Max 30 Y
    // Auto Loan Max 7-10Y

    /**
     * @param customer
     * @return
     */
    Customer main(Customer customer)

    {
        Scanner scanner = new Scanner(System.in);

        // email

        System.out.println("Enter your email: ");

        String email = scanner.nextLine();

        // check the email format

        if (email.contains("@") && (email.endsWith(".com") || email.endsWith(".in"))) {

            customer.setEmail(email);

        } else {

            scanner.close();

            System.out.println("Invalid email format");

            customer = main(customer);

            return customer;

        }

        // dob

        System.out.println("Enter your date of birth: in the format dd-mm-yyyy");

        String dob = scanner.nextLine();

        // check the dob format

        if (dob.matches("\\d{2}-\\d{2}-\\d{4}")) {

            customer.setDateOfBirth(dob);

        } else {

            System.out.println("Invalid date format");

            scanner.close();

            customer = main(customer);

            return customer;

        }

        // income

        System.out.println("Enter your annual income: ");

        int income = scanner.nextInt();

        // check the income format

        if (income > 0) {

            customer.setAnnualIncome(income);

        } else {

            System.out.println("Invalid income format");

            customer = main(customer);

            scanner.close();

            return customer;

        }

        // liability

        System.out.println("Enter your annual liability: ");

        String liability = scanner.nextLine();

        // covert the liability to double

        double liabilityDouble = Double.parseDouble(liability);

        customer.setLiability(liabilityDouble);

        // ask for the duration

        System.out.println("Enter the duration of the loan: ");

        int duration = scanner.nextInt();

        scanner.nextLine();

        // max duration is 65 - age

        int age = 2023 - Integer.parseInt(dob.split("-")[2]);

        if (duration > (65 - age)) {

            System.out.println("The duration of the loan cannot be more than " + (65 - age) + " years");

            System.exit(0);

        } else {

            customer.setDuration(duration);

        }

        // check the eligibility

        if (customer.getLoanType().equals("HL")) {

            // HL - 85% (the max amount that can be borrowed is 85% of the amount of the
            // property)

            // ask for hte property value

            System.out.println("Enter the value of the property: ");

            int propertyValue = scanner.nextInt();

            scanner.nextLine();

            // check the property value

            if (propertyValue < 100000) {

                System.out.println("The property value cannot be less than 100000");

                System.exit(0);

            } else {

                // print the max amount that can be borrowed

                System.out.println("The max amount that can be borrowed is " + (propertyValue * 0.85));

                customer.setAmount(propertyValue * 0.85);

            }

        }

        if (customer.getLoanType().equals("AL")) {

            // AL - 55-60%

            // ask for the car value

            System.out.println("Enter the value of the automobile: ");

            int carValue = scanner.nextInt();

            scanner.nextLine();

            // check the car value

            if (carValue < 100000) {

                System.out.println("The car value cannot be less than 100000");

                System.exit(0);

            } else {

                // print the max amount that can be borrowed

                System.out.println("The max amount that can be borrowed is " + (carValue * 0.55));

                customer.setAmount(carValue * 0.55);

            }

        }

        // close the scanner

        scanner.close();
        return customer;

    }

}
