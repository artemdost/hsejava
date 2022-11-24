import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int i;
        double x, y;
        int k = 0;
        double r;
        System.out.print("Введите кол-во точек: ");
        n = in.nextInt();
        System.out.print("Введите радиус окружности: ");
        r = in.nextDouble();
        for (i = 1; i <= n; i++) {
            System.out.print("Введите X" + i + " точку: ");
            x = in.nextDouble();
            System.out.print("Введите Y" + i + " точку: ");
            y = in.nextDouble();
            if ((x * x + y * y) <= (r * r))
                k = k + 1;
        }
        System.out.print(k + " точек попали в окружность");
        in.close();
    }
}
