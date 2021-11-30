package ThisReference;

public class ThisReference {
    private String reference;
    public void setReference(String reference){
        reference = reference; // it can be solved with the magic word "this"
        //this.reference = reference;
        //reference = this.reference // this doesn't work
    }

    public static void main(String[] args) {
        ThisReference tR = new ThisReference();
        tR.setReference("Pink");
        System.out.println(tR.reference);
    }

}