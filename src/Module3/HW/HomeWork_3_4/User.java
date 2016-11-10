package Module3.HW.HomeWork_3_4;

public class User {
    private String name;
    private int balance;
    private int monthOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public int paySalary(){
        return balance +=salary;
    }
    public long withdraw (int summ){
        Double comision;
        if (summ <= 100) comision = summ * 0.05;
        else comision = summ * 0.1;
        return Math.round(comision);
    }
    public int companyNameLength(){
        return companyName.toCharArray().length ;
    }
    public int monthIncreaser(int addMonth){
        return monthOfEmployment += addMonth;
    }

    public User(String name, int balance, int monthOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthOfEmployment() {
        return monthOfEmployment;
    }

    public void setMonthOfEmployment(int monthOfEmployment) {
        this.monthOfEmployment = monthOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
