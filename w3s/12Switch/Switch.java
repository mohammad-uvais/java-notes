public class Switch {
    public static void main(String[] args) {
        // Use switch to execute one block of code among many, based on the value of a
        // variable
        // Use case to specify a block of code to be executed, if the variable matches
        // the case value
        // Use default to specify a block of code to be executed, if no case matches

        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);
    }
}
