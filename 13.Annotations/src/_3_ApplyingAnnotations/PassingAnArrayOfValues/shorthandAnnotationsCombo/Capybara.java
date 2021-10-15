package _3_ApplyingAnnotations.PassingAnArrayOfValues.shorthandAnnotationsCombo;

public class Capybara {
    @Rhythm(value={"Swing"}) String favorite;
    @Rhythm(value = "R&B") String secondFavorite;
    @Rhythm({"classical"}) String mostDisliked;
    @Rhythm("Country") String lastDisliked;
}
