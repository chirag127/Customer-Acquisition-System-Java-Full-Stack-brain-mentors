import java.util.HashMap;
import java.util.Map;

public class LoanDefaulterDatabase implements DefaulterDatabase {

    private Map<String, Double> defaulters;

    public LoanDefaulterDatabase() {
        defaulters = new HashMap<>();
    }

    @Override
    public void addDefaulter(String name, double amount) {
        defaulters.put(name, amount);
    }

    @Override
    public void removeDefaulter(String name) {
        defaulters.remove(name);
    }

    @Override
    public void printDefaulterDetails(String name) {
        if (defaulters.containsKey(name)) {
            System.out.println("Defaulter: " + name + ", Defaulted amount: " + defaulters.get(name));
        } else {
            System.out.println("Defaulter " + name + " not found.");
        }
    }

    @Override
    public double getTotalDefaultedAmount() {
        return defaulters.values().stream().mapToDouble(Double::doubleValue).sum();
    }
}
