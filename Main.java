public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Create instances of necessary classes
        Customer customer = new Customer();

        TrackStages trackStages = new TrackStages();

        // run stage one

        StageOne stageOne = new StageOne();

        customer = stageOne.main(customer);

        // set the current stage to 2

        trackStages.setCurrentStage(2);

        StageTwo stageTwo = new StageTwo();

        customer = stageTwo.main(customer);

        // set the current stage to 3

        trackStages.setCurrentStage(3);

        StageThree stageThree = new StageThree();

        // run stage two

        boolean isDefaulter = stageThree.main(customer);

        // set the current stage to 4

        trackStages.setCurrentStage(4);

        if (isDefaulter)

        {

            System.out.println("The customer is a defaulter");

        }

        else

        {

            System.out.println("The customer is not a defaulter");

        }

        StageFour stageFour = new StageFour();

        boolean isLoanApproved = stageFour.main(isDefaulter);

        // set the current stage to 5

        trackStages.setCurrentStage(5);

        if (isLoanApproved)

        {

            System.out.println("The loan is approved");

        }

        else

        {

            System.out.println("The loan is rejected");

            // System.exit(0);

        }

        StageFive stageFive = new StageFive();

        stageFive.main(isLoanApproved);

        // set the current stage to 6

        trackStages.setCurrentStage(6);

        // run stage six

        StageSix stageSix = new StageSix();

        stageSix.main(customer);

    }
}