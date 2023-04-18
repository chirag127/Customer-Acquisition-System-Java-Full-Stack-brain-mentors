

public class Customer {
    private String name;
    private int age;
    private String city;
    private String loanType;
    private double amount;
    private String mobile;
    private String email;
    private String dateOfBirth;
    private double annualIncome;
    private double liability;
    private double duration;

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

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

    public void setDuration(int duration) {
    }

    public int getSibilScore() {

        int sibilScore = 0;

        // check the age

        if (age < 18) {

            sibilScore += 100;

        } else if (age >= 18 && age <= 25) {

            sibilScore += 50;

        } else if (age > 25 && age <= 35) {

            sibilScore += 25;

        } else {

            sibilScore += 0;

        }

        // check the income

        if (annualIncome < 100000) {

            sibilScore += 100;

        } else if (annualIncome >= 100000 && annualIncome <= 200000) {

            sibilScore += 50;

        } else if (annualIncome > 200000 && annualIncome <= 300000) {

            sibilScore += 25;

        } else {

            sibilScore += 0;

        }

        // check the liability vs amount

        if (liability > amount) {

            sibilScore = sibilScore - 100;

        } else if (liability > 0.5 * amount) {

            sibilScore += 50;

        } else if (liability > 0.25 * amount) {

            sibilScore += 25;

        } else {

            sibilScore += 0;

        }

        // check the duration

        if (duration < 1) {

            sibilScore += 100;

        } else if (duration >= 1 && duration <= 3) {

            sibilScore += 50;

        } else if (duration > 3 && duration <= 5) {

            sibilScore += 25;

        } else {

            sibilScore += 0;

        }

        return sibilScore;

    }

}
