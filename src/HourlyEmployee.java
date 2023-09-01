public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(){
        this("", "", "", 0);
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void getDoublePay(){
        hourlyPayRate *= 2;
    }

    @Override
    public double collectPay() {
        return hourlyPayRate * 40;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Hourly Pay: $" + hourlyPayRate + "\n";
    }
}
