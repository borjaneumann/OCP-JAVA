public class ElseifStatement {
    public static void main(String[] args) {
        int hourOfTheDay = -1;

        if (hourOfTheDay == 0 && hourOfTheDay <= 12){
            System.out.println("Good morning");
        } else if (hourOfTheDay == 12 && hourOfTheDay <= 18) {
            System.out.println("Good afternoon");
        } else if (hourOfTheDay < 0 || hourOfTheDay > 24) {
                System.out.println("The day has only 24 hours!");
        } else
            System.out.println("Good night!");
    }
}
