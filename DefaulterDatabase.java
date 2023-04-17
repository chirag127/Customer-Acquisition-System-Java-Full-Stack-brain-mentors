public interface DefaulterDatabase {

    void addDefaulter(String name, double amount);

    void removeDefaulter(String name);

    default void printDefaulterDetails(String name) {
        System.out.println("Defaulter details for " + name + " are not available.");
    }

    default double getTotalDefaultedAmount() {
        return 0.0;
    }
}
