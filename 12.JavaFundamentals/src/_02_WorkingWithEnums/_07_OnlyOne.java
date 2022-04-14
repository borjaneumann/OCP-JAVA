package _02_WorkingWithEnums;

public enum _07_OnlyOne {
    ONCE(true);
    private _07_OnlyOne(boolean b) {
        System.out.println("constructing,");
    }
}

