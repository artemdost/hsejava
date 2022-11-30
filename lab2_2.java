import java.util.Scanner;
import java.util.regex.Pattern;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean cond = false;
        System.out.println("Придумайте надежный пароль: \n" +
                "* Он должен содержать больше 8 символов \n" +
                "* Cимволом может быть цифра, английская буква, знак подчеркивания \n" +
                "* Должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру \n" +
                "Введите пароль:  ");
        String s;
        while (cond == false) {
            s = in.nextLine();
            if (s.length() >= 8) {
                if ((Pattern.compile("[A-Z]+[a-z]+_+[0-9]").matcher(s).find()) == true) {
                    if ((Pattern.compile("[a-zA-Z0-9_]+").matcher(s).find()) == true) {
                        cond = true;
                    }
                }
            }
            if (cond == false) {
                System.out.println("Пароль ненадежен. Повторите ввод");
            }
        }
        System.out.println("Пароль надежный");
        in.close();
    }
}