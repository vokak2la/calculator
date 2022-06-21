
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

        public static Integer valid1(String res0) throws Exception {
            if (res0.matches("\\d")) {
                number1 = Integer.parseInt(res0);

            }
           if (res0.matches("[xivXVI]+")) {

                number1 = ConvertRimToArab.convertRimToArab1(res0.toUpperCase());
            }
            return number1;
        }

        public static Integer valid2(String res1) throws Exception {
            if (res1.matches("\\d")) {
                number2 = Integer.parseInt(res1);
            }
            if (res1.matches("[xivXVI]+")) {
                number2 = ConvertRimToArab.convertRimToArab2(res1.toUpperCase());
            }
            return number2;
        }
    }








