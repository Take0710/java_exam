import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();

        LocalTime localTime = LocalTime.of(hour, minute, second);

        System.out.print(localTime.getHour() + "時" + localTime.getMinute() + "分" + localTime.getSecond() + "秒の1秒後は  ");
        localTime = localTime.plusSeconds(1);
        System.out.println(localTime.getHour() + "時" + localTime.getMinute() + "分" + localTime.getSecond() + "秒です");

    }
}
