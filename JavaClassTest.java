import java.util.Scanner;

public class JavaClassTest {
    public static String input;
    public static String res0;
    public static String res1;
    public static Integer num1;
    public static Integer num2;

    public static void main(String[] args) throws IndexOutOfBoundsException{
        Scanner sc = new Scanner(System.in);
        StrokaCalc strokaCalc = new StrokaCalc();
        System.out.print(" vvedi stroku - ");
        input = sc.nextLine();
        String operation = input.replaceAll("[^+-/*]", "");
        String res[] = strokaCalc.Razdelenie(input);
        for (String j : res) {
            System.out.println("masssiv stroki = " + j);

        }
        System.out.println("operation " + operation);
        res0 = StrokaCalc.UbratProbeliPervogoSlova(res);
        res1 = StrokaCalc.UbratProbeliVtorogoSlova(res);
        System.out.println("1 number = " + res0 + ";   " + "2 number = " + res1);

        num1 = StrokaCalc.numbers1(res0);
        num2 = StrokaCalc.numbers2(res1);

        MathCalc mathCalc = new MathCalc();
        Integer resOperation = mathCalc.doCalc(res0, res1, operation, num1, num2);
        System.out.println("Result = " + resOperation);
// todo определить тип операции при помощи регулярного выражения - вернуть строку с операцией

    }}














