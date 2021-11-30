package understandingJavaArrays;

public class CastingArrays {
    public static void main(String[] args) {
        String [] strings = {"StringValue"};
        Object [] objects = strings;
        String[] againsStrings = (String[]) objects;
//        againsStrings[0] = new StringBuilder(); //doesn't compile StringBuild is not a String
        objects[0] = new StringBuilder(); // it throws ArraysStoreException
    }
}
