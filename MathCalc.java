

public class MathCalc {
    public static String  Rimitog;
    public String doCalc(String res0, String res1, String operation, Integer num1, Integer num2) throws Exception {
        String itog = null;

        if (res0.matches("\\d") && res1.matches("[a-zA-Z]") || (res1.matches("\\d") && res0.matches("[a-zA-Z]+"))) {
            throw new Exception("1 number + 1 word = wrong");
        }
        //------------------------------------------------------------
        if (operation.contains("/") && num2 == 0) {
            throw new Exception("Div 0 - wrong!!!");
        }
        // -----------------------------------------------------

        if (num1 < 0 | num1 > 10) {
            throw new Exception("wrong number1");
        }
        if (num2 < 0 | num2 > 10) {
            throw new Exception("wrong number2");
        }

        if (res0.matches("\\d") && res1.matches("\\d" )) {
            if (operation.contains("+")) {
                itog = Integer.toString(num1 + num2);

            } else if (operation.contains("-")) {
                itog = Integer.toString(num1 - num2);
            } else if (operation.contains("*")) {
                itog = Integer.toString( num1 * num2);
            } else if (operation.contains("/")) {

                itog = Integer.toString(num1 / num2);
            }
                }
         if   (res0.matches("[xivXVI]+") && res1.matches("[xivXVI]+")) {
            //  num1 = ConvertRimToArab.convertRimToArab1(res0.toUpperCase());
            //  num2 = ConvertRimToArab.convertRimToArab2(res1.toUpperCase());
             if (operation.contains("+")) {
               Rimitog = Integer.toString ( num1 + num2);

             } else if (operation.contains("-")) {
               Rimitog = Integer.toString (num2 - num1);
                            if ( Integer.parseInt(Rimitog) <=0 ) {
                               throw new Exception("Wrong expression with Rim numbers!!");
                            }
             } else if (operation.contains("*")) {
                 Rimitog = Integer.toString (num1 * num2);
             } else if (operation.contains("/")) {
                 Rimitog = Integer.toString(num1 / num2);
             }


             return Rimitog;
         }
        if   (res0.matches("[xivXVI]+") && res1.matches("[xivXVI]+")) {
            itog = ConvertArabToRim.convertArabtoRim(Rimitog);

        }
        return itog;

    }


}

