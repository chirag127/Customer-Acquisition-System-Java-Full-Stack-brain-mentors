import java.util.Scanner;
// import java.util.Date;


public class Customer {
    private static String name;
    private static int age;
    private static String city;
    private static String loanType;
    private static double amount;
    private static String mobile;
    private static String email;
    private static String dateOfBirth;
    private static double annualIncome;
    private static double liability;



    // Getters and setters for all attributes
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getCity() {
        return city;
    }

    void setCity(String city) {
        this.city = city;
    }

    String getLoanType() {
        return loanType;
    }

    void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    double getAmount() {
        return amount;
    }

    void setAmount(double amount) {
        this.amount = amount;
    }

    String getMobile() {
        return mobile;
    }

    void setMobile(String mobile) {
        this.mobile = mobile;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    String getDateOfBirth() {
        return dateOfBirth;
    }

    void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    double getAnnualIncome() {
        return annualIncome;
    }

    void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    double getLiability() {
        return liability;
    }

    void setLiability(double liability) {
        this.liability = liability;
    }
}
