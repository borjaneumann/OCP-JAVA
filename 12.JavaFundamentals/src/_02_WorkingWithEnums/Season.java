package enums;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    FALL;

    public static void main(String[] args) {
        Season s = Season.FALL;
        Season t = Season.valueOf("SUMMER");
        Season e = Season.valueOf("summer"); // Throws an exception at runtime

        System.out.println(Season.SUMMER);
        System.out.println(s== Season.SUMMER);
        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }
    }
//    public enum ExtendedSeason extends Season {} //Enums cannot be extended
}

