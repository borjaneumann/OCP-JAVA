package _3_SortingData;

public class CheckingForNull implements Comparable<CheckingForNull>{

    private String name;

    public int compareTo(CheckingForNull cfn) {
        if (cfn ==null)
            throw new IllegalArgumentException("Poorly formed duck!");
        if (this.name == null && cfn.name == null)
            return 0;
        else if (this.name == null) return -1;
        else if (cfn.name == null) return 1;
        else return name.compareTo(cfn.name);

    }
    //This method throws an exception if it is passed a null MissingDuck
    //object. What about the ordering? If the name of a duck is null, then it's
    //sorted first.
}
