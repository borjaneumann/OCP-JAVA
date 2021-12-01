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
}
