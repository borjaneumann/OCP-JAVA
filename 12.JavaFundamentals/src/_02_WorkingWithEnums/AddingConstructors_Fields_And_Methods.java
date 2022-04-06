package _02_WorkingWithEnums;

public enum AddingConstructors_Fields_And_Methods {
        WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

        private  final String expectedVisitors;
        AddingConstructors_Fields_And_Methods(String expectedVisitors) {
            this.expectedVisitors = expectedVisitors;
        }
        public void printExpectedVisitors() {
            System.out.println(expectedVisitors);
    }
}
