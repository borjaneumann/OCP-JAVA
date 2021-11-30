package _3_SortingData;

public class Animal implements Comparable<Animal>{
    private int id;

    @Override
    public int compareTo(Animal a) {
        return id - a.id;
    }

    public static void main(String[] args) {
        var a1 = new Animal();
        var a2 = new Animal();
        a1.id = 5;
        a2.id = 7;

        System.out.println(a1.compareTo(a2)); // 5 -7 = -2
        System.out.println(a1.compareTo(a1)); // 5 -5 = 0
        System.out.println(a2.compareTo(a1)); // 7 -5 = 2

        //Lines 3‐5 show one way to compare two int values. We could have used
        //Integer.compare(id, a.id) instead. Be sure to be able to recognize both
        //approaches.
    }
}
