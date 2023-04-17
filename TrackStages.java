public class TrackStages {

    // there are 6 stages in the loan application process
    // 1. Apply for loan
    // 2. Quick data entry
    // 3. Check defaulter
    // 4. Decide loan application
    // 5. if Reject, then give the reason
    // 6. if Approve, then give the loan amount that can be given and the interest
    // rate

    // we need to store the current stage of the loan application process

    private int currentStage = 1;

    public int getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(int currentStage) {
        this.currentStage = currentStage;
    }

    public void nextStage() {
        currentStage++;
    }

    public void previousStage() {
        currentStage--;
    }

    public void resetStage() {
        currentStage = 1;
    }

    public void printCurrentStage() {
        System.out.println("Current stage: " + currentStage);
    }

}
