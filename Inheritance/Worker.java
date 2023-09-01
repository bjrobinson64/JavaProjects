public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;


    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker(){
        this("", "");
    }

    public int getAge(){
        int currentMonth = 8;
        int currentDay = 9;
        int currentYear = 2023;

        int birthMonth = Integer.parseInt(birthDate.substring(0,2));
        int birthDay = Integer.parseInt(birthDate.substring(3,5));
        int birthYear = Integer.parseInt(birthDate.substring(6));

        if(birthMonth > currentMonth){
            return currentYear - birthYear - 1;
        }else if(currentMonth > birthMonth){
            return currentYear - birthYear;
        }else{
            if(birthDay < currentDay){
                return currentYear - birthYear;
            }else if(currentDay == birthDay){
                System.out.println("Happy Birthday!");
                return currentYear - birthYear;
            }else{
                return currentYear - birthYear - 1;
            }
        }
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker: \n" +
                "Name: " + name + "\n" +
                "Birth Year: " + birthDate + "\n";
    }
}
