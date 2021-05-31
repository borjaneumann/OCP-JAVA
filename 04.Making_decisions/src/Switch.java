public class Switch {
    public static void main(String[] args) {
        int daysOfTheWeek = 6;
        switch(daysOfTheWeek){
            case 1:
                System.out.println("Sunday, it is the first day of the week");
                break;
            case 2:
                System.out.println("Monday, it is the second day of the week");
                break;
            case 3:
                System.out.println("Tuesday, it is the third day of the week");
                break;
            case 4:
                System.out.println("Wednesday, it is the fourth day of the week");
                break;
            case 5:
                System.out.println("Thursday, it is the fifth day of the week");
                break;
            case 6:
                System.out.println("Sunday, it is the sixth day of the week");
                break;
            case 7:
                System.out.println("Sunday, it is the seventh day of the week");
                break;
            default:
                System.out.println("Please enter a number between 1 and 7");
        }
    }
}
