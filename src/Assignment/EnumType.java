package Assignment;

public class EnumType {
    enum Days{MON, TUE, WED, THUS, FRI, SAT, SUN}
    public static void main(String[] args){
        Days d = Days.SUN;
        switch (d){
            case MON:
                System.out.println("Monday");
                break;
            case TUE:
                System.out.println("Tuesday");
                break;
            case WED:
                System.out.println("Wednesday");
                break;
            case THUS:
                System.out.println("Thursday");
                break;
            case FRI:
                System.out.println("Friday");
                break;
            case SAT:
                System.out.println("Saturday");
                break;
            case SUN:
                System.out.println("Sunday");
                break;
             default:
                 System.out.println("Not a day");
        }
    }
}