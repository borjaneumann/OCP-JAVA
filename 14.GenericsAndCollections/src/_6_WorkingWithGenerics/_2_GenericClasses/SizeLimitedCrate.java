package _6_WorkingWithGenerics._2_GenericClasses;

public class SizeLimitedCrate<T, U> {
    private T contents;
    private U SizeLimit;

    public SizeLimitedCrate(T contents, U sizeLimit) {
        this.contents = contents;
        SizeLimit = sizeLimit;
    }
    //T represents the type that we are putting in the crate. U represents the unit
    //that we are using to measure the maximum size for the crate.

    Elephant elephant = new Elephant();
    Integer numPounds = 15_000;
    SizeLimitedCrate<Elephant,Integer> c1 = new SizeLimitedCrate<>(elephant, numPounds);
}
