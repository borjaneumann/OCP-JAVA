package _03_ConstructingForLoops;

public class  ForEachLoop {
    public static void main(String[] args) {
        final String [] names = new String[4];
        names[0] = "Tony";
        names[1] = "John";
        names[2] = "Pete";
        names[3] = "Julia";
        for ( String name: names){
            System.out.println(name);
        }
    }

}
