/*

Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".


alarmClock(1, false) → "7:00"
alarmClock(5, false) → "7:00"
alarmClock(0, false) → "10:00"

 */

package Boolean1;

public class alarmClock {
    public static void main(String[] args) {
        int day = 1;
        boolean vacation = false;
        System.out.println(alarmClock(day, vacation));
    }

    public static String alarmClock(int day, boolean vacation) {
        String str1 = "";
        String off = "off";

        if ((day == 6 || day == 0) && vacation) {
            return off;
        }
        if (day == 6 || day == 0 && !vacation) {
            return "10:00";
        }

        if (vacation) {
            str1 = str1 + "10:00";
        } else {
            str1 = str1 + "7:00";
        }
        if (day >= 1 && day <= 5) {
            return str1;
        }

        return str1;


/* Solution using switch expression*/
//        String str1 = "";
//        String off = "off";
//
//        switch (day) {
//            case 0:
//                if (vacation) {
//                    str1 = str1 + "off";
//                } else {
//                    str1 = str1 + "10:00";
//                }
//                break;
//            case 1:
//                if(vacation){
//                    return "10:00";
//                }
//                str1 = str1 + "7:00";
//                break;
//            case 2:
//                if(vacation){
//                    return "10:00";
//                }
//                str1 = str1 + "7:00";
//                break;
//            case 3:
//                if(vacation){
//                    return "10:00";
//                }
//                str1 = str1 + "7:00";
//                break;
//            case 4:
//                if(vacation){
//                    return "10:00";
//                }
//                str1 = str1 + "7:00";
//                break;
//            case 5:
//                if(vacation){
//                    return "10:00";
//                }
//                str1 = str1 + "7:00";
//                break;
//            case 6:
//                if (vacation) {
//                    str1 = str1 + "off";
//                } else {
//                    str1 = str1 + "10:00";
//                }
//                break;
//            default:
//                str1+="Invalid number";
//
//        }

    }
}
