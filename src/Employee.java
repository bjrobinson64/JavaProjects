public class Employee extends Worker{

    private long employeeId;
    private String hireDate;

    private static int employeeNum = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = employeeNum++;
        this.hireDate = hireDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public Employee(){
        this("", "", "");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Employee ID: " + employeeId + "\n" +
                "Hire Date: " + hireDate + "\n" +
                "End Date: " + endDate + "\n";
    }
}
