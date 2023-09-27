package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if(year < 0 || month < 0 || month > 12) {
            System.out.println("invalid date");
            return;
        }
        boolean isLeap = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        if(month == 6) {
            System.out.println(30);
        } else if(month == 2) {
            if(isLeap) {
                System.out.println(29);
            } else {
                System.out.println(28);
            }
        }
    }
}
