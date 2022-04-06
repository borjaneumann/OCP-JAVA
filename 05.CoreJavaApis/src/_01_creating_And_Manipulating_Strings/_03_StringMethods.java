package _01_creating_And_Manipulating_Strings;

public class _03_StringMethods {
    public static void main(String[] args) {

        String word = "animals";

        //length
        System.out.println("Word length: " + word.length()); //7

        //charAt(index 0)
        System.out.println("Word charAt: " + word.charAt(5)); // l

        //indexOf()
        System.out.println("IndexOf: " + word.indexOf("a")); // 0
        System.out.println("IndexOf: " + word.indexOf("al")); // 4
        System.out.println("IndexOf: " + word.indexOf("a", 4)); // 4
        System.out.println("IndexOf: " + word.indexOf("al", 5)); // -1

        //Substring()
        System.out.println("Substring of animals: " + word.substring(3)); // mals
        //System.out.println(word.substring(-3));//does not compile
        System.out.println("Substring of animals: " + word.substring(2,5)); // ima

        //ToLowerCase() and toUpperCase()
        System.out.println("ToUpperCase:" + word.toLowerCase()); // animals
        System.out.println("ToLowerCase:" +word.toUpperCase()); //ANIMALS

        //Equals
        System.out.println("Equals (aminals) :" + word.equals("aminals")); // false

        //EqualsIgnoreCase
        System.out.println("EqualsIgnoreCase (ANIMALS) :" + word.equalsIgnoreCase("ANIMALS")); // true

        //startsWith() and endsWith()
        System.out.println("startsWith a: " + word.startsWith("a")); // true
        System.out.println("endsWith a: " + word.endsWith("a")); // false

        //replace()
        System.out.println("replace word(before): " + word); // animals
        System.out.println("replace: " + word.replace('a','c')); //cnimcls
        System.out.println("replace with target: " + word.replace("ani","c"));//cmals

        System.out.println("Word: " + word ); // The original did not change

        //contains (boolean)
        System.out.println("Contains ani: " + word.contains("ani")); // true

        //trim, strip, stripLeading, StripTrailing
        String text = " abc\t ";
        System.out.println("text: " + text); //  abc
        System.out.println("text.length(): " + text.length()); // 6
        System.out.println("text.strip().length(): " + text.strip().length());//3 remove all blank spaces at the
        // beginning and at the end.
        System.out.println("text.strip(): " + text.strip()); //abc
        System.out.println("text.trim().length(): " + text.trim().length()); //3 same as trim
        System.out.println("text.trim(): " + text.trim()); //abc
        System.out.println("text.stripLeading().length(): " + text.stripLeading().length()); //5 the blacn space at
        // the beginning is removed
        System.out.println("text.stripLeading(): " + text.stripLeading()); // abc
        System.out.println("text.stripTrailing().length(): " + text.stripTrailing().length()); //4 the two black spaces
        //at the back are removed.
        System.out.println("text.stripTrailing(): " + text.stripTrailing());//  abc

        String spaces = "   ";
        System.out.println("Empty spaces: " + spaces.length());//3

        /*intern()
        The intern() method returns the value from the string pool if it is there.
        Otherwise, it adds the value to the string pool. We will explain about the
        string pool and give examples for intern() later in the chapter.

        The method signature is as follows:
        String intern()
*/
        String JapaneseCity = new String("Nagasaki");
        String germanCity = "Frankfurt";
        String s3 = JapaneseCity.intern();//returns string from pool, now it will be same as s2
        System.out.println(JapaneseCity==germanCity);//false because reference variables are pointing to different instance
        System.out.println(germanCity==s3);//true because reference variables are pointing to same instance


        String s1=new String("hello");
        String s2="hello";
        String s4 = s1.intern();//returns string from pool, now it will be same as s2
        System.out.println(s1==s2);//false because reference variables are pointing to different instance
        System.out.println(s2==s4);//true because reference variables are pointing to same instance


    }
}
