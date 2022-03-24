package _07_EncapsulatingData;

public class _26_EncapsulatingData {
    /*
    Encapsulation means only methods in the class with the variables
    can refer to the instance variables.
    Callers are required to use these methods.
     */
    private int numberEggs; // private
    public int getNumberEggs() { // getter
        return numberEggs;
    }
    public void setNumberEggs(int newNumber) { // setter ot mutator method
        if (newNumber >= 0) // guard condition
            numberEggs = newNumber;
    }
    /*
    For encapsulation, remember that data (an instance variable) is private and
    getters/setters are public. Java defines a naming convention for getters and
    setters listed in the table below.

    TABLE 7.5 Naming conventions for getters and setters
    Rule                                                    Example
    ============================================================================================
    Getter methods most frequently begin with               public boolean isHappy() {
    is if the property is a boolean.                        return happy;}
    --------------------------------------------------------------------------------------------
    Getter methods begin with get if the                    public int getNumberEggs() {
    property is not a boolean.                              return numberEggs;}
    --------------------------------------------------------------------------------------------
    Setter methods begin with set.                          public void setHappy(boolean_happy) {
                                                            happy = _happy;}
    ---------------------------------------------------------------------------------------------

    Are they valid?
    private boolean playing;
    private String name;
    public boolean isPlaying() { return playing; }
    public String name() { return name; }
    public void updateName(String n) { name = n; }
    public void setName(String n) { name = n; }

    For data to be encapsulated, you don’t have to provide getters and setters.
    As long as the instance variables are private, you are good. For example,
    this is a well-encapsulated class:
    public class Swan {
        private int numEggs;
        public void layEgg() {
            numEggs++;
        }
    public void printEggCount() {
        System.out.println(numEggs);
        }
    }
     */
}
