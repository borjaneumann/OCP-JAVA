package _01_creating_And_Manipulating_Strings;

public class _04_Method_Chaining {
    public static void main(String[] args) {

        //Method chaining
        String result = "AniMaL  ".trim().toLowerCase().replace('a','A');
        System.out.println(result);//AnimAl
        System.out.println(result.length()); //6
        System.out.println("   ghj   ".length());//9
        System.out.println("   ghj   ".trim().length());//3
    }
}
