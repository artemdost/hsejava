import java.util.Scanner;
import java.util.regex.Pattern;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "", pattern1 = "^([0-3][0-9][/][0-1][0-9][/][2-9][0-9][0-9][0-9])";
        String pattern2 = "^([0-3][0-9][/][0-1][0-9][/][1][9][0-9][0-9])";
        String pattern3 = "^([0-3][0-9][^/][0-1][0-9][^/][0-9][0-9][0-9][0-9])";
        Boolean condmain = false, condmain2 = false, condnonedate = false;
        System.out.println("Введите дату в формате: 'dd/mm/yyyy', год от 1900 до 9999: ");
        s = in.nextLine();
        condmain = Pattern.compile(pattern1).matcher(s).find();
        condmain2 = Pattern.compile(pattern2).matcher(s).find();
        condnonedate = Pattern.compile(pattern3).matcher(s).find();
        if ((condmain == true) || (condmain2 == true)) {
            System.out.println("Введенное выражение является датой");
        } else if (condnonedate == true) {
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
        } else {
            System.out.println("Введенное выражение не является датой или выходит за рамки значений");
        }
        in.close();
    }
}
