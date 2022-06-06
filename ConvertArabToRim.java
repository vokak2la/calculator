public class ConvertArabToRim {

    public static String ArabToRim;



    public static String convertArabtoRim (Integer Rimitog) {
        switch (Rimitog) {
            case 10:
                ArabToRim = "X";
                break;
            case 9:
                ArabToRim = "IX";
                break;
            case 8:
                ArabToRim = "VIII";
                break;
            case 7:
                ArabToRim = "VII";
                break;
            case 6:
                ArabToRim = "VI";
                break;
            case 5:
                ArabToRim = "V";
                break;
            case 4:
                ArabToRim = "IV";
                break;
            case 3:
                ArabToRim = "III";
                break;
            case 2:
                ArabToRim = "II";
                break;
            case 1:
                ArabToRim = "I";
                break;
        }
        return ArabToRim;
    }
}