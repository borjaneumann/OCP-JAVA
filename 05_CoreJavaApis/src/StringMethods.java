public class StringMethods {
    public static void main(String[] args) {
        String word = "animals";

        //length
        System.out.println(word.length());
        //chartAt(index 0)
        System.out.println(word.charAt(5));
        //indexOf()
        System.out.println("IndexOf: " + word.indexOf("a"));
        System.out.println("IndexOf: " + word.indexOf("al"));
        System.out.println("IndexOf: " + word.indexOf("a", 4));
        System.out.println("IndexOf: " + word.indexOf("al", 5));

        //Substring()
        System.out.println("Substring of animals: " + word.substring(3));
//        System.out.println(word.substring(-3));//does not compile
        System.out.println("Substring of animals: " + word.substring(2,5));

        //ToLowerCase() and toUpperCase()
        System.out.println("ToUpperCase:" + word.toLowerCase());
        System.out.println("ToLowerCase:" +word.toUpperCase());

        //Equals
        System.out.println("Equals (aminals) :" + word.equals("aminals"));
        System.out.println("Equals (animals) :" + word.equals("aminals"));
        //EqualsIgnoreCase
        System.out.println("EqualsIgnoreCase (ANIMALS) :" + word.equalsIgnoreCase("ANIMALS"));


    }
}
