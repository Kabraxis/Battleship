import java.util.*;

public class Main {

    public static String getDayOfWeekName(int number) {
        // modifier is used to get the actual day of the week
        final int modifier = 1;
        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        try {
            return daysOfWeek[number - modifier];
        } catch (ArrayIndexOutOfBoundsException e) {
          throw new IllegalArgumentException();
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}