package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if (monthNumber >= 1 & monthNumber < 3 | monthNumber == 12) {
            System.out.println("Winter");
        } else if (monthNumber >= 3 & monthNumber < 6) {
            System.out.println("Spring");
        } else if (monthNumber >= 6 & monthNumber < 9) {
            System.out.println("Summer");
        } else if (monthNumber >= 9 & monthNumber < 12) {
            System.out.println("Autumn");
        } else {
            System.out.println("Wrong month number");
        }
    }
}
