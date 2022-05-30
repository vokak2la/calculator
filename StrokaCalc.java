
    public class StrokaCalc {
        public static String[] w;

        public String [] Razdelenie (String input) {
            w = JavaClassTest.input.split("[*+\\-/]");
        return w;
        }
            public static String UbratProbeliPervogoSlova(String res[]) {
                res[0] = w[0].replaceAll("\\s+", "");
                return res[0];
            }
            public static String UbratProbeliVtorogoSlova (String [] res) {
                res[1] = w[1].replaceAll("\\s+", "");
                return res[1];
            }
        public  Integer number1;
        public  Integer number2;
        public static String rim1;
        public static String rim2;



        public  Integer numbers1(String res0) throws IndexOutOfBoundsException {
            if (res0.matches("\\d")) {
                number1 = Integer.parseInt(res0);
                if (number1 < 0 | number1 > 10) {
                    System.out.println("Something wrong!!!");
                    throw new IndexOutOfBoundsException();

                }
            }

            return number1;
        }
        public  Integer numbers2(String res1) throws IndexOutOfBoundsException {
            if (res1.matches("\\d")) {
                number2 = Integer.parseInt(res1);
                if (number2 < 0 | number2 > 10)
                { System.out.println("Something wrong!!!");
                    throw new IndexOutOfBoundsException();

                }
                //-------------------------------------------------------------------------------------------

            }
            return number2;
        }

  /*      public static String rimskie1 (String [] res) throws testException {
            if (res[0].matches("[a-zA-Z]+")) {
                rim1 = "555";
            }
            return rim1;
        }
        public static String rimskie2 (String [] res) throws testException {
            if (res[1].matches("[a-zA-Z]+")) {
                rim2 = "55555";
            }
            return rim2;
        }*/

        public static class testException extends Exception {
            public testException(String s) {
            }
        }






    /*  public  String UbratProbeliPervogoSlova (String[] w) {
            w0 = w[0].replaceAll("\\s+", "");
            return w0;
    }
        public String UbratProbeliVtorogoSlova (String[] w) {
            w1 = w[1].replaceAll("\\s+", "");
            return w1;
        }*/

    }




