public class StrokaCalc {

        public static String[] w;
        public static String oper;





   /* public static String CheckInput () {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input string - ");
            newInput = sc.nextLine();

        return newInput;
    }
*/
        public String[] Separation(String input) throws Exception {

            w = input.split("[*+\\-/]");

            return w;
        }

        public static String CheckOperation (String input) throws Exception

        {
            oper = input.replaceAll("[^+-/*]", "");
            if ((oper.matches("[*+\\-/]{2,}"))) {
                throw new Exception ("Wrong input!");
            }

            return oper;
        }
        public static String DeleteSpaces(String [] res, Integer index)  throws Exception {

            res [index] = w[index].replaceAll("\\s+", "");

            return res [index];
        }
        public static Integer number;

        public static Integer Validation(String [] res, Integer indexx) throws Exception {

            if (res[indexx].matches("\\d+")) {
                number = Integer.parseInt(res[indexx]);
                if (res[indexx].matches("\\d+") && ((Integer.parseInt(res[indexx])<0) || (Integer.parseInt(res[indexx])>10) )){
                    throw new Exception("wrong number");
                }
            }

                if (res[indexx].matches("[xivXVI]+")) {
                    number = ConvertRimToArab.convertRimToArab(res, indexx);
                }

                return number;
            }

        }








