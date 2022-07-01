import java.util.Scanner;

public class JavaClassTest {
    public static String input;
    public static String [] res;
    public static String res0;
   public static String res1;
    public static Integer num1;
    public static Integer num2;
   public static Integer indexx;
    public static String operation;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StrokaCalc strokaCalc = new StrokaCalc();
        System.out.print("Input string - ");
        input = sc.nextLine();

        operation = input.replaceAll("[^+-/*]", "");

        res = strokaCalc.Separation (input);

        res0 = StrokaCalc.DeleteSpaces(res, 0);
        res1 = StrokaCalc.DeleteSpaces(res, 1);


        num1 = StrokaCalc.Validation(res, 0);
      //  System.out.println("num1 = " + num1);
        num2 = StrokaCalc.Validation(res, 1);
      //  System.out.println("num2 = " + num2);

        MathCalc mathCalc = new MathCalc();

        String resOperation = mathCalc.doCalc(res, indexx, operation, num1, num2);
        System.out.println("Result = " + resOperation);

    }}














