package _05_WorkingWithAdvancedStreamPipelineConcepts;

import java.util.ArrayList;
import java.util.Optional;

import static _05_WorkingWithAdvancedStreamPipelineConcepts._22_ChainingOptionals.threeDigit;

public class _21_LinkingStreamsToTheUnderlyingData {

        public static void main(String[] args) {

        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream = cats.stream();

        /*Remember that streams are lazily evaluated.
        This means that the stream isn't actually created on  this line.
        An object is created that knows where to look for the
        data when it is needed
         */
        cats.add("KC");
        System.out.println(stream.count()); // 3

        threeDigit(Optional.of(234456));//doesn't print anything
        threeDigit(Optional.of(123));
        threeDigit(Optional.of(4));
        threeDigit(Optional.of(null));
    }
}


