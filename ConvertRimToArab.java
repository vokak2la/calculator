public class ConvertRimToArab {

    public static Integer RimToArab1;
    public static Integer RimToArab2;

    public static Integer convertRimToArab1 (String res0) {
        switch (res0) {
            case "X":
                RimToArab1 = 10;
                break;
            case "IX":
                RimToArab1 = 9;
                break;
            case "VIII":
                RimToArab1 = 8;
                break;
            case "VII":
                RimToArab1 = 7;
                break;
            case "VI":
                RimToArab1 = 6;
                break;
            case "V":
                RimToArab1 = 5;
                break;
            case "IV":
                RimToArab1 = 4;
                break;
            case "III":
                RimToArab1 = 3;
                break;
            case "II":
                RimToArab1 = 2;
                break;
            case "I":
                RimToArab1 = 1;
                break;
        }
        return RimToArab1;
    }

    public static Integer convertRimToArab2 (String res1) {
        switch (res1) {
            case "X" :
                RimToArab2 = 10;
                break;
            case "IX" :
                RimToArab2 = 9;
                break;
            case "VIII" :
                RimToArab2 = 8;
                break;
            case "VII" :
                RimToArab2 = 7;
                break;
            case "VI" :
                RimToArab2 = 6;
                break;
            case "V" :
                RimToArab2 = 5;
                break;
            case "IV" :
                RimToArab2 = 4;
                break;
            case "III" :
                RimToArab2 = 3;
                break;
            case "II" :
                RimToArab2 = 8;
                break;
            case "I" :
                RimToArab2 = 1;
                break;
        }


        return RimToArab2;

    }
}
