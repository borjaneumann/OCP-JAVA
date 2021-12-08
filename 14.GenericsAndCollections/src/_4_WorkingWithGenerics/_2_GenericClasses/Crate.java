package _4_WorkingWithGenerics._2_GenericClasses;

//You can introduce generics into your own classes. The syntax for
//introducing a generic is to declare a formal type parameter in angle
//brackets. For example, the following class named Crate has a generic type
//variable declared after the name of the class
public class Crate<T> {
    private T contents;

    public T emptyCrate() {
        return contents;
    }
    public void packCrate (T contents) {
        this.contents = contents;
    }

    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.emptyCrate();
    }

}
