package _3_ApplyingAnnotations.PassingAnArrayOfValues;

public class Giraffe {
    //both syntax are correct. The second one is a shorthand.
    //This notation can be used only if the array is composed of a single
    //element.
    @Music(genres = {"Rock and roll"}) String mostDisliked;
    @Music(genres= "Classical") String favorite;
}
