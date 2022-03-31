package _02_CreatingClasses._06_ThisReferenceExamples;

public class ThisReference2 {
    private String color;
    private int height;
    private int length;

    public void setData(int length, int theheight){
        length = this.length; //backwards no good!
        height = theheight; //Fine because it is a different name
        this.color = "white";
    }

    public static void main(String[] args) {
        ThisReference2 thisReference2 = new ThisReference2();
        thisReference2.setData(1,2);
        System.out.println(thisReference2.length + " " + thisReference2.height + " " + thisReference2.color);
    }
}
