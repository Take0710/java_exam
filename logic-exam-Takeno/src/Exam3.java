import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 1 && num <= 100) {
            System.out.println(num + "年は1世紀です");
        } else if (num >= 101 && num <= 200) {
            System.out.println(num + "年は2世紀です");
        } else if (num >= 201 && num <= 300) {
            System.out.println(num + "年は3世紀です");
        } else if (num >= 301 && num <= 400) {
            System.out.println(num + "年は4世紀です");
        } else if (num >= 401 && num <= 500) {
            System.out.println(num + "年は5世紀です");
        } else if (num >= 501 && num <= 600) {
            System.out.println(num + "年は6世紀です");
        } else if (num >= 601 && num <= 700) {
            System.out.println(num + "年は7世紀です");
        } else if (num >= 701 && num <= 800) {
            System.out.println(num + "年は8世紀です");
        } else if (num >= 801 && num <= 900) {
            System.out.println(num + "年は9世紀です");
        } else if (num >= 901 && num <= 1000) {
            System.out.println(num + "年は10世紀です");
        } else if (num >= 1001 && num <= 1100) {
            System.out.println(num + "年は11世紀です");
        } else if (num >= 1101 && num <= 1200) {
            System.out.println(num + "年は12世紀です");
        } else if (num >= 1201 && num <= 1300) {
            System.out.println(num + "年は13世紀です");
        } else if (num >= 1301 && num <= 1400) {
            System.out.println(num + "年は14世紀です");
        } else if (num >= 1401 && num <= 1500) {
            System.out.println(num + "年は15世紀です");
        } else if (num >= 1501 && num <= 1600) {
            System.out.println(num + "年は16世紀です");
        } else if (num >= 1601 && num <= 1700) {
            System.out.println(num + "年は17世紀です");
        } else if (num >= 1701 && num <= 1800) {
            System.out.println(num + "年は18世紀です");
        } else if (num >= 1801 && num <= 1900) {
            System.out.println(num + "年は19世紀です");
        } else if (num >= 1901 && num <= 2000) {
            System.out.println(num + "年は20世紀です");
        } else if (num >= 2001 && num <= 2101) {
            System.out.println(num + "年は21世紀です");
        } else {
            System.out.println("遠い未来です");
        }
    }
}
