package RunTimeExceptionClasses;

//Java protects you from impossible casts!!

public class ClassCastException {
    public static void main(String[] args) {
        String type = "Moose";
        Integer number = (Integer) type;

            //correctly done
//        int c = 22;
//        short letter = (short) c;
    }

}
