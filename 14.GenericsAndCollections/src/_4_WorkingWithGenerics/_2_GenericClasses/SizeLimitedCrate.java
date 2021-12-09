package _4_WorkingWithGenerics._2_GenericClasses;

public class SizeLimitedCrate<T, U> {
    private T contents;
    private U SizeLimit;

    public SizeLimitedCrate(T contents, U sizeLimit) {
        this.contents = contents;
        SizeLimit = sizeLimit;
    }
}
