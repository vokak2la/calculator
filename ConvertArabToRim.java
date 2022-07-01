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
    /*    switch (Integer.parseInt(itog)) {

            case 100:
                ArabToRim = "C";
                break;
            case 99:
                ArabToRim = "XCIX";
                break;
            case 98:
                ArabToRim = "XCVIII";
                break;
            case 97:
                ArabToRim = "XCVII";
                break;
            case 96:
                ArabToRim = "XCVI";
                break;
            case 95:
                ArabToRim = "XCV";
                break;
            case 94:
                ArabToRim = "XCIV";
                break;
            case 93:
                ArabToRim = "XCIII";
                break;
            case 92:
                ArabToRim = "XCII";
                break;
            case 91:
                ArabToRim = "XCI";
                break;
            case 90:
                ArabToRim = "XC";
                break;

            case 89:
                ArabToRim = "LXXXIX";
                break;
            case 88:
                ArabToRim = "LXXXVIII";
                break;
            case 87:
                ArabToRim = "LXXXVII";
                break;
            case 86:
                ArabToRim = "LXXXVI";
                break;
            case 85:
                ArabToRim = "LXXXV";
                break;
            case 84:
                ArabToRim = "LXXXIV";
                break;
            case 83:
                ArabToRim = "LXXXIII";
                break;
            case 82:
                ArabToRim = "LXXXII";
                break;
            case 81:
                ArabToRim = "LXXXI";
                break;
            case 80:
                ArabToRim = "LXXX";
                break;

            case 79:
                ArabToRim = "LXXIX";
                break;
            case 78:
                ArabToRim = "LXXVIII";
                break;
            case 77:
                ArabToRim = "LXXVII";
                break;
            case 76:
                ArabToRim = "LXXVI";
                break;
            case 75:
                ArabToRim = "LXXV";
                break;
            case 74:
                ArabToRim = "LXXIV";
                break;
            case 73:
                ArabToRim = "LXXIII";
                break;
            case 72:
                ArabToRim = "LXXII";
                break;
            case 71:
                ArabToRim = "LXXI";
                break;
            case 70:
                ArabToRim = "LXX";
                break;

            case 69:
                ArabToRim = "LXIX";
                break;
            case 68:
                ArabToRim = "LXVIII";
                break;
            case 67:
                ArabToRim = "LXVII";
                break;
            case 66:
                ArabToRim = "LXVI";
                break;
            case 65:
                ArabToRim = "LXV";
                break;
            case 64:
                ArabToRim = "LXIV";
                break;
            case 63:
                ArabToRim = "LXIII";
                break;
            case 62:
                ArabToRim = "LXII";
                break;
            case 61:
                ArabToRim = "LXI";
                break;
            case 60:
                ArabToRim = "LX";
                break;

            case 59:
                ArabToRim = "LIX";
                break;
            case 58:
                ArabToRim = "LVIII";
                break;
            case 57:
                ArabToRim = "LVII";
                break;
            case 56:
                ArabToRim = "LVI";
                break;
            case 55:
                ArabToRim = "LV";
                break;
            case 54:
                ArabToRim = "LIV";
                break;
            case 53:
                ArabToRim = "LIII";
                break;
            case 52:
                ArabToRim = "LII";
                break;
            case 51:
                ArabToRim = "LI";
                break;
            case 50:
                ArabToRim = "L";
                break;

            case 49:
                ArabToRim = "XLIX";
                break;
            case 48:
                ArabToRim = "XLVIII";
                break;
            case 47:
                ArabToRim = "XLVII";
                break;
            case 46:
                ArabToRim = "XLVI";
                break;
            case 45:
                ArabToRim = "XLV";
                break;
            case 44:
                ArabToRim = "XLIV";
                break;
            case 43:
                ArabToRim = "XLIII";
                break;
            case 42:
                ArabToRim = "XLII";
                break;
            case 41:
                ArabToRim = "XLI";
                break;
            case 40:
                ArabToRim = "XL";
                break;

            case 39:
                ArabToRim = "XXXIX";
                break;
            case 38:
                ArabToRim = "XXXVIII";
                break;
            case 37:
                ArabToRim = "XXXVII";
                break;
            case 36:
                ArabToRim = "XXXVI";
                break;
            case 35:
                ArabToRim = "XXXV";
                break;
            case 34:
                ArabToRim = "XXXIV";
                break;
            case 33:
                ArabToRim = "XXXIII";
                break;
            case 32:
                ArabToRim = "XXXII";
                break;
            case 31:
                ArabToRim = "XXXI";
                break;
            case 30:
                ArabToRim = "XXX";
                break;

            case 29:
                ArabToRim = "XXIX";
                break;
            case 28:
                ArabToRim = "XXVIII";
                break;
            case 27:
                ArabToRim = "XXVII";
                break;
            case 26:
                ArabToRim = "XXVI";
                break;
            case 25:
                ArabToRim = "XXV";
                break;
            case 24:
                ArabToRim = "XXIV";
                break;
            case 23:
                ArabToRim = "XXIII";
                break;
            case 22:
                ArabToRim = "XXII";
                break;
            case 21:
                ArabToRim = "XXI";
                break;
                case 20:
                ArabToRim = "XX";
                break;
            case 19:
                ArabToRim = "XIX";
                break;
            case 18:
                ArabToRim = "XVIII";
                break;
            case 17:
                ArabToRim = "XVII";
                break;
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
            case 0:
                ArabToRim = "NULL";
                break;
            default:
                throw new Exception("Wrong math with Rim numbers");
        } */
        return ArabToRim;
    }
}