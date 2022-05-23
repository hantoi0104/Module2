public class NextDayCalculator {

    public static String findNextDay(int ngay, int thang, int nam) {
        boolean is31day = ( thang ==1 || thang ==3 ||thang ==5 || thang ==7||thang ==8 || thang ==10);
        boolean is30day = ( thang ==4 || thang ==6 ||thang ==9 || thang ==11);
        boolean is28day = thang == 2 && isNanNhuan(nam);

//        boolean monthOfDay31 =(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10);
        if (monthOfDay31)
//        boolean monthOfDay30 = month == 4 || month == 6 || month == 9 || month == 11;
//        boolean monthFebOfLeapYear = month == 2 && isLeapYear(year);
//        boolean monthFebNotOfLeapYear = month == 2 && !isLeapYear(year);
//        boolean dayThirtyOne = day == 31 && monthOfDay31;
//        boolean dayThirty = day == 30 && monthOfDay30;
//        boolean validateInput = day < 1 || (day > 30 && monthOfDay30) || (day > 31 && monthOfDay31 || month < 1 || month > 12);



        return "";
    }

    public static boolean isNanNhuan(int nam) {
        if (nam % 4 == 0) {
            if (nam % 100 == 0) {
                if (nam % 400 == 0)
                    return true;
                else
                    return false;
            } else
                return true;
        }
        return false;
    }
}
