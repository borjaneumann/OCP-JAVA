package ThisReference;

public class ThisReference {
    private String reference;
    public void setReference(String reference){
        reference = reference; // it can be solved with the magic word "this"
        //this.reference = reference;
    }

    public static void main(String[] args) {
        ThisReference tR = new ThisReference();
        tR.setReference("PInk");
        System.out.println(tR.reference);
    }

}
