public class StepCounter {
    private static int totalStepsAllUsers = 0;
    private int individualSteps = 0;
    public void walk(int steps) {
        individualSteps += steps;
        totalStepsAllUsers += steps;
    }
    public static void resetGlobalSteps() {
        totalStepsAllUsers = 0;
    }
    public int getIndividualSteps() {
        return individualSteps;
    }

    public static int getTotalStepsAllUsers() {
        return totalStepsAllUsers;
    }
}
