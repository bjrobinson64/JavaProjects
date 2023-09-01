public class Main {

    public static void main(String[] args) {

        SalariedEmployee bailey = new SalariedEmployee("Bailey", "12/24/1997", "2022",
                74000);
        HourlyEmployee talor = new HourlyEmployee("Talor", "05/27/1999", "2023",
                33);

        System.out.println(bailey);
        System.out.println(talor);

        System.out.println(bailey.getName() + " is " + bailey.getAge() + " years old");
        System.out.printf(bailey.getName() + " is getting paid $%.2f for this pay period\n", bailey.collectPay());
        bailey.setEndDate("2023");
        System.out.println(bailey.getName() + " is " + (bailey.isRetired() ? "retired, his end date was " + bailey.getEndDate() : "not retired") );
        System.out.println();
        System.out.println(talor.getName() + " is " + talor.getAge() + " years old");
        System.out.println(talor.getName() + " is getting paid $" + talor.collectPay() + " for this week");
        talor.getDoublePay();
        System.out.println(talor.getName() + " is now getting paid $" + talor.getHourlyPayRate() + " per hour");
        System.out.println();
        System.out.println(bailey);
        System.out.println(talor);


    }
}

