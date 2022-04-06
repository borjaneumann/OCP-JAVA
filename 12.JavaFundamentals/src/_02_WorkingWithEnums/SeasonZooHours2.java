package enums;

//If we don't want each and every enum value to have a method, we can
//create a default implementation and override it only for the special cases.
public enum SeasonZooHours2 {
    WINTER {
        public String getHours() {
            return "10am-3pm";
        }
    },
    SUMMER {
        public String getHours() {
            return "9am-7pm";
        }
    },
    SPRING, FALL;
        public String getHours() {
            return "9am-5pm";
        }
}
