package _3_SortingData;

public class KeepingcompareToAndequalsConsistent implements Comparable<KeepingcompareToAndequalsConsistent> {

    private int id;
    private String name;

    @Override
    public int hashCode() {
        return id;
    }
    public boolean equals(Object obj) {
        if(!(obj instanceof KeepingcompareToAndequalsConsistent)) return false;
        var other = (KeepingcompareToAndequalsConsistent) obj;
        return this.id == other.id;
    }

    @Override
    public int compareTo(KeepingcompareToAndequalsConsistent o) {
        return this.name.compareTo(o.name);
    }
    //You might be sorting Product objects by name, but names are not unique.
    //Therefore, the return value of compareTo() might not be 0 when
    //comparing two equal Product objects, so this compareTo() method is not
    //consistent with equals. One way to fix that is to use a Comparator to
    //define the sort elsewhere.
}
