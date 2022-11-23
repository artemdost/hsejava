import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, x, k, n = -16;
        float xn;
        /* _____________________for_______________________________*/
        System.out.print("Введите целое число x: ");
        x = in.nextInt();
        xn = x;
        while ((n < -15) | (n > 15)) {
            System.out.print("Введите целую степень n: ");
            n = in.nextInt();
        }
        if (n == 0) {
            System.out.println(1);
        } else if (n > 0) {
            for (i = 1; i < n; i++) {
                xn = xn * x;
            }
            System.out.println(xn + " for");
        } else if (n < 0) {
            xn = 1 / xn;
            n = n * (-1);
            for (i = 1; i < n; i++) {
                xn = xn / x;
            }
            n = n * (-1);
            System.out.println(xn + " for");
        }

        /* _____________________while_______________________________*/

        System.out.print("Введите целое число x: ");
        x = in.nextInt();
        xn = x;
        n = -16;
        while ((n < -15) | (n > 15)) {
            System.out.print("Введите целую степень n: ");
            n = in.nextInt();
        }
        if (n < 0) {
            xn = 1 / xn;
            n = n + 1;
        } else {
            n = n - 1;
        }
        while (n != 0) {
            if (n > 0) {
                n = n - 1;
                xn = xn * x;
            } else if (n < 0) {
                n = n + 1;
                xn = xn / x;
            }
        }
        System.out.print(xn + " while");
        in.close();
    }
}