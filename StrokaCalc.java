    public class StrokaCalc {

        public static String[] w;

        public String[] Separation(String input) {
            w = input.split("[*+\\-/]");
            return w;
        }
        public static String DeleteSpaces(String [] res, Integer index) {
            res [index] = w[index].replaceAll("\\s+", "");
            return res [index];
        }
        public static Integer number;

        public static Integer Validation(String [] res, Integer indexx) throws Exception {
            if (res[indexx].matches("\\d+")) {
                number = Integer.parseInt(res[indexx]);
                if (res[indexx].matches("\\d+") && ((Integer.parseInt(res[indexx])<0) || (Integer.parseInt(res[indexx])>10))){
                    throw new Exception("wrong number");
                }
            }

                if (res[indexx].matches("[xivXVI]+")) {
                    number = ConvertRimToArab.convertRimToArab(res, indexx);
                }

                return number;
            }

        }








