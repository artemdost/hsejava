import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = -1, m = -1;
        while ((d < 1) | (d > 31)) {
            System.out.print("Введите день (1-31): ");
            d = in.nextInt();
        }
        while ((m < 1) | (m > 12)) {
            System.out.print("Введите месяц (1-12): ");
            m = in.nextInt();
        }
        if (m >= 1 && m <= 2 | m == 12) {
            System.out.println("Зима");
        }
        if (m >= 3 && m <= 5) {
            System.out.println("Весна");
        }
        if (m >= 6 && m <= 8) {
            System.out.println("Лето");
        }
        if (m >= 9 && m <= 11) {
            System.out.println("Осень");
        }
        in.close();
    }
}
