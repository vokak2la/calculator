

public class MathCalc {

    public static String itog;
    public String doCalc(String res[], Integer indexx, String operation, Integer num1, Integer num2) throws Exception {
    //    if (res[0].matches("\\d+"))<

        if (res[0].matches("\\d+") && res[1].matches("[a-zA-Z]") || (res[1].matches("\\d+") && res[0].matches("[a-zA-Z]+"))) {
            throw new Exception("1 number + 1 word = wrong");
        }
        //------------------------------------------------------------
        if (operation.contains("/") && num2 == 0) {
            throw new Exception("Div 0 - wrong!!!");
        }

        if (operation.contains("+")) {
            itog = Integer.toString(num1 + num2);
        } else if (operation.contains("-")) {
            itog = Integer.toString(num1 - num2);
        } else if (operation.contains("*")) {
            itog = Integer.toString(num1 * num2);
        } else if (operation.contains("/")) {
            itog = Integer.toString(num1 / num2);
        }

        if (res[0].matches("[xivXVI]+") && res[1].matches("[xivXVI]+") && operation.contains("-") && num2 > num1) {
throw  new Exception("wrong math with Rim numbers");
        }

            if (res[0].matches("[xivXVI]+") && res[1].matches("[xivXVI]+")) {
            itog = ConvertArabToRim.convertArabtoRim(itog);

        }

        return itog;
    }

}

