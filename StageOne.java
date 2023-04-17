import java.util.Scanner;

public class StageOne {

    Customer StageOne(Customer customer,TrackStages trackStages){

        // get the customer details


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        // make the name in Pascal Case

        String[] nameArray = name.split(" ");

        String namePascalCase = "";

        for (String s : nameArray) {

            namePascalCase += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() + " ";

        }


        customer.setName(namePascalCase);

        System.out.println("Enter your age: ");

        int age = scanner.nextInt();

        customer.setAge(age);

        scanner.nextLine();

        System.out.println("Enter your city: ");

        String city = scanner.nextLine();

        customer.setCity(city);

        System.out.println("Enter your loan type (1. Home Loan, 2. Auto Loan): ");

        int loanType = scanner.nextInt();

        scanner.nextLine();

        if (loanType == 1) {

            customer.setLoanType("HL");

        } else if (loanType == 2) {

            customer.setLoanType("AL");

        } else {

            System.out.println("Invalid choice");

        }

        System.out.println("Enter your loan amount: ");

        double amount = scanner.nextDouble();

        customer.setAmount(amount);

        scanner.nextLine();

        System.out.println("Enter your mobile number: ");

        String mobile = scanner.nextLine();

        // check if mobile is 10 digit number

        if (mobile.length() != 10) {

            System.out.println("Invalid mobile number");

        }

        try{

                Long.parseLong(mobile);

        }

        catch(NumberFormatException e){

            System.out.println("Invalid mobile number");

            // exit the program

            System.exit(0);

        }
        customer.setMobile(mobile);

        return customer;

    }

    trackStages.setCurrentStage(1);


}