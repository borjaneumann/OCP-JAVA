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

        //intern()
//        String JapaneseCity = new String("Nagasaki");
//        String germanCity = "Frankfurt";
//        String s3=JapaneseCity.intern();//returns string from pool, now it will be same as s2
//        System.out.println(JapaneseCity==germanCity);//false because reference variables are pointing to different instance
//        System.out.println(germanCity==s3);//true because reference variables are pointing to same instance

        String s1=new String("hello");
        String s2="hello";
        String s3=s1.intern();//returns string from pool, now it will be same as s2
        System.out.println(s1==s2);//false because reference variables are pointing to different instance
        System.out.println(s2==s3);//true because reference variables are pointing to same instance

        //Method chaining
        String result = "AniMaL  ".trim().toLowerCase().replace('a','A');
        System.out.println(result);
        System.out.println(result.length());

        System.out.println("   ghj   ".length());
        System.out.println("   ghj   ".trim().length());

    }
}
