package enums;

import static enums.Season.WINTER;
import static enums.Season.SUMMER;

public class EnumsInSwitchStatements {

    Season summer = Season.SUMMER;
        switch (summer) {
        case WINTER:
            System.out.println("Get out the sled!");
            break;
        case SUMMER:
            System.out.println("Time for the pool!");
            break;
        default:
            System.out.println("Is it summer yet?");
    }


}
