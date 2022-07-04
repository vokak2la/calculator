public class ConvertArabToRim {
    public static String ArabToRim;
    public static String convertArabtoRim (String itog) throws Exception {
        String Rim1 = null, Rim2 = null;
       // String Convert = null;
        switch (Integer.parseInt( itog) % 10) {
            case 1: Rim2 = "I";
                break;
            case 2: Rim2 = "II";
                break;
            case 3: Rim2 = "III";
                break;
            case 4: Rim2 = "IV";
                break;
            case 5: Rim2 = "V";
                break;
            case 6: Rim2 = "VI";
                break;
            case 7: Rim2 = "VII";
                break;
            case 8: Rim2 = "VIII";
                break;
            case 9: Rim2 = "IX";
                break;

        }

        switch ((Integer.parseInt(itog)/10)%10) {
            case 1:
                Rim1 = "X";
                break;
            case 2:
                Rim1 = "XX";
                break;
            case 3:
                Rim1 = "XXX";
                break;
            case 4:
                Rim1 = "XL";
                break;
            case 5:
                Rim1 = "L";
                break;
            case 6:
                Rim1 = "LX";
                break;
            case 7:
                Rim1 = "LXX";
                break;
            case 8:
                Rim1 = "LXXX";
                break;
            case 9:
                Rim1 = "XC";
                break;
        }
   //     System.out.println("Rim1 = " + Rim1);
       if (((Integer.parseInt(itog)/10)%10 > 0)) {
            ArabToRim = Rim1 + Rim2;
        }
        if (((Integer.parseInt(itog)/10)%10 == 0)) {
            ArabToRim = Rim2;
        }
        if (itog.equals("100")) {
            ArabToRim = "C";
        }
          return ArabToRim;
    }
}