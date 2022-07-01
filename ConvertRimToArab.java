public class ConvertRimToArab {
    public static Integer RimToArab;

    public static Integer convertRimToArab (String [] res, Integer indexx) {
        if ((res[indexx].toUpperCase()).equals("X")) {
            RimToArab = 10;
        }  else if ((res[indexx].toUpperCase()).equals("IX")) {
                RimToArab = 9;
        }      else if ((res[indexx].toUpperCase()).equals("VIII")) {
                    RimToArab = 8;
        } else if ((res[indexx].toUpperCase()).equals("VII")) {
                        RimToArab = 7;
        } else    if ((res[indexx].toUpperCase()).equals("VI")) {
                            RimToArab = 6;
        } else              if ((res[indexx].toUpperCase()).equals("V")) {
                                RimToArab = 5;
        } else                  if ((res[indexx].toUpperCase()).equals("IV")) {
                                    RimToArab = 4;
        } else                      if ((res[indexx].toUpperCase()).equals("III")) {
                                        RimToArab = 3;
        } else                          if ((res[indexx].toUpperCase()).equals("II")) {
                                            RimToArab = 2;
        } else                              if ((res[indexx].toUpperCase()).equals("I")) {
                                                 RimToArab = 1;

        }


        return RimToArab;
    }}
