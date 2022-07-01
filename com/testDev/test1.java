package com.testDev;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number - ");
        int x  = sc.nextInt();
               int a, b = 0;
        String Rim1 = null, Rim2 = null;
        String Convert = null;
        switch (x % 10) {
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
        System.out.println("Rim2 = " + Rim2);

                    switch ((x/10)%10) {

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
                        System.out.println("Rim1 = " + Rim1);
Convert  = Rim1 + Rim2;
        System.out.println("Convert Arab to Rim = " + Convert);
    }


}

    /*
    public static int day, month, year;
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        System.out.println(day + "." + month + "." + year + ".");
        System.out.println(nextDay (day) + "." + nextMonth(month) + "." + nextYear(year) + ".");
    }

    public static int nextDay(int day) {
        ++day;
if (day > 31) {
    day = 31;
month++;
}
        return day;
    }
    public static int nextMonth(int month) {
        month += 1;
if (month > 12) {
    month = 12;
    year++;
}
        return month;
    }
    public static int nextYear(int year) {
        year += 1;

        return year;
    }

}
*/