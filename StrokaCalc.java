
    public class StrokaCalc {
        public static String[] w;

        public String[] Razdelenie(String input) {
            w = JavaClassTest.input.split("[*+\\-/]");
            return w;
        }

        public static String UbratProbeliPervogoSlova(String res[]) {
            res[0] = w[0].replaceAll("\\s+", "");
            return res[0];
        }
        public static String UbratProbeliVtorogoSlova(String[] res) {
            res[1] = w[1].replaceAll("\\s+", "");
            return res[1];
        }

        public static Integer number1;
        public static Integer number2;
    //    public static String rim1;
    //    public static String rim2;

        public static Integer numbers1(String res0) throws IndexOutOfBoundsException {
            if (res0.matches("\\d")) {
                number1 = Integer.parseInt(res0);
                if (number1 < 0 | number1 > 10) {
                    System.out.println("Something wrong!!!");
                    throw new IndexOutOfBoundsException();
                }
            }
            if (res0.matches("[a-zA-Z]+")) {
                System.out.println("WTF!!!!!");
                throw new IndexOutOfBoundsException();
            }
            return number1;
        }

        public static Integer numbers2(String res1) throws IndexOutOfBoundsException {
            if (res1.matches("\\d")) {
                number2 = Integer.parseInt(res1);
                if (number2 < 0 | number2 > 10) {
                    System.out.println("Something wrong!!!");
                    throw new IndexOutOfBoundsException();
                }
            }
            if (res1.matches("[a-zA-Z]+")) {
                System.out.println("WTF!!!!!");
                throw new IndexOutOfBoundsException();

            }
            return number2;
        }
    }








