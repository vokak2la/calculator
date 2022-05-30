public class MathCalc {


        public Integer doCalc (String res0, String res1, String operation, Integer  num1, Integer num2) throws IndexOutOfBoundsException {
            Integer itog = 0;
            if (res0.matches("\\d") && res1.matches("\\d")) {
                if (operation.contains("+")) {
                    itog = num1 + num2;
                } else if (operation.contains("-")) {
                    itog =  num1 - num2;
                } else if (operation.contains("*")) {
                    itog = num1 * num2;
                } else if (operation.contains("/")) {
                    itog = num1 / num2;
                }

            }
            if (JavaClassTest.res0.matches("\\d") && JavaClassTest.res1.matches("[a-zA-Z]+") || (JavaClassTest.res1.matches("\\d") && JavaClassTest.res0.matches("[a-zA-Z]+") ))  {
                    throw new IndexOutOfBoundsException()  ;
            }
            if (JavaClassTest.res0.matches("[a-zA-Z]+") && JavaClassTest.res1.matches("[a-zA-Z]+")) {
                itog = 123456789;
            }
            return itog;

        }



    }
