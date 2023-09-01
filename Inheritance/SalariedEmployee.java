public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public SalariedEmployee(){
        this("", "", "", 0);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void retire(){
        isRetired = true;

    }

    public void setEndDate(String endDate){
        super.endDate = endDate;
        retire();
    }
    @Override
    public double collectPay() {
        if(isRetired){
            return (annualSalary * .75) / 52;
        }
        return (annualSalary / 12) / 2;
    }

    public static void printHello(){
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Annual Salary: $" + annualSalary + "\n" +
                "Retired: " + (isRetired() ? "Yes" : "No") + "\n";
    }
}
