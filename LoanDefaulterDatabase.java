import java.util.HashMap;
import java.util.Map;

public class LoanDefaulterDatabase implements DefaulterDatabase {

    private Map<String, Double> defaulters;

    public LoanDefaulterDatabase() {
        // defaulters =  add some dummy data during initialization

        defaulters = new HashMap<>( );

        defaulters.put("John Doe", 10000.0);


        defaulters.put("John Smith", 30000.0);




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

    public boolean isDefaulter(String name) {
        return defaulters.containsKey(name);
    }
}
