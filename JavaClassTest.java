import java.util.Scanner;

public class JavaClassTest {
    public static String input;

    public static String newInput;

    public static String [] res;
    public static String res0;
   public static String res1;
    public static Integer num1;
    public static Integer num2;
   public static Integer indexx;
    public static String operation;
  public static   String resOperation;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input string - ");
        // newInput = sc.nextLine();
        input = sc.nextLine();


        // input = calc();

        resOperation = calc(input);
        System.out.println("Result = " + resOperation);





    }
    public static String calc (String input) throws Exception {


        // return newInput;
        StrokaCalc strokaCalc = new StrokaCalc();

        operation = strokaCalc.CheckOperation(input);

        res = strokaCalc.Separation(input);

        res0 = StrokaCalc.DeleteSpaces(res, 0);
        res1 = StrokaCalc.DeleteSpaces(res, 1);


        num1 = StrokaCalc.Validation(res, 0);
        num2 = StrokaCalc.Validation(res, 1);


        MathCalc mathCalc = new MathCalc();

        String resOperation = mathCalc.doCalc(res, indexx, operation, num1, num2);
        return  resOperation;
    }

}













