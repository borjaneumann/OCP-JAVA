import java.util.ArrayList;

public class _23_WorkingWithAdvancedStreamPipelineConcepts {
    public static void main(String[] args) {
        //LINKING STREAMS TO THE UNDERLYING DATA
        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream = cats.stream(); //Remember that
        //streams are lazily evaluated. This means that the stream isn't actually
        //created on  this line. An object is created that knows where to look for the
        //data when it is needed
        cats.add("KC");
        System.out.println(stream.count()); // 3

    }

}
