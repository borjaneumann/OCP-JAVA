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

        //startsWith() and endsWith()
        System.out.println("startsWith a: " + word.startsWith("a"));
        System.out.println("endsWith a: " + word.endsWith("a"));

        //replace()
        System.out.println("replace: " + word.replace('a','c'));
        System.out.println(word );

        //contains (boolean)
        System.out.println("Contains ani: " + word.contains("ani"));

        //trim, strip, stripLeading, StripTrailing
        String text = " abc\t ";
        System.out.println("Length :" + text.length());
        System.out.println(text.strip().length());
        System.out.println(text.strip());
        System.out.println(text.trim().length());
        System.out.println(text.trim());
        System.out.println(text.stripLeading().length());
        System.out.println(text.stripLeading());
        System.out.println(text.stripTrailing().length());
        System.out.println(text.stripTrailing());

        String spaces = "   ";
        System.out.println("Empty spaces: " + spaces.length());



    }
}
