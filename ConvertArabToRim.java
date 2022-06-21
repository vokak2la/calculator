public class ConvertArabToRim {

    public static String ArabToRim;



    public static String convertArabtoRim (String Rimitog) {
        switch (Integer.parseInt(Rimitog)) {
            case 16:
                ArabToRim = "XVI";
                break;
            case 15:
                ArabToRim = "XV";
                break;
            case 14:
                ArabToRim = "XIV";
                break;
            case 13:
                ArabToRim = "XIII";
                break;
            case 12:
                ArabToRim = "XII";
                break;
            case 11:
                ArabToRim = "XI";
                break;
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