import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int d = -1, m = -1, y = -1, dt = 17, mt = 11, yt = 2022;
        while ((d < 1) | (d > 31)) {
            System.out.print("Введите день рождения (1-31): ");
            d = in.nextInt();
        }
        while ((m < 1) | (m > 12)) {
            System.out.print("Введите месяц рождения (1-12): ");
            m = in.nextInt();
        }
        while ((y < 0) | (y > 2022)) {
            System.out.print("Введите год рождения (0-2022): ");
            y = in.nextInt();
        }
        d = dt - d;
        m = mt - m;
        y = yt - y;
        if (d < 0) {
            d = 31 + d;
            m = m - 1;
        }
        if (m < 0) {
            m = 12 + m;
            y = y - 1;
        }
        System.out.print(y + " лет, ");
        System.out.print(m + " месяцев и ");
        System.out.print(d + " дней");
        in.close();
    }
}
