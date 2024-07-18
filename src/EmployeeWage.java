public class EmployeeWage {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {

        int empHours = 0;
        int empWage  = 0;

        double empCheck = Math.floor(Math.random() * 10) % 2;

        switch (empWage){
            case IS_PART_TIME:
                empHours = 4;
                break;
            case IS_FULL_TIME:
                empHours = 8;
                break;
            default:
                empHours = 0;
        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("EmpWage: " + empWage);
    }

}
