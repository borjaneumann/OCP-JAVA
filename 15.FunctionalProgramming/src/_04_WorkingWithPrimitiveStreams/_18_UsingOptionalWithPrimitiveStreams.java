package _04_WorkingWithPrimitiveStreams;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class _18_UsingOptionalWithPrimitiveStreams {

    public static void main(String[] args) {
        var stream = IntStream.rangeClosed(1,10);
        OptionalDouble optional = stream.average();
        /*The return type is not the Optional you have become accustomed to
        using. It is a new type called OptionalDouble. Why do we have a separate
        type, you might wonder? Why not just use Optional<Double>? The
        difference is that OptionalDouble is for a primitive and
        Optional<Double> is for the Double wrapper class. Working with the
        primitive optional class looks similar to working with the Optional class
        itself.*/
        optional.ifPresent(System.out::println); //5.5
        System.out.println(optional.getAsDouble()); //5.5
        System.out.println(optional.orElseGet(() -> Double.NaN)); //5.5

        // Optional types for primitives
        /*
                                            OptionalDouble      OptionalInt     OptionalLong
        =====================================================================================
        - Getting as a primitive            getAsDouble()       getAsInt()      getAsLong()
        - orElseGet() parameter type        DoubleSupplier      IntSupplier     LongSupplier
        - Return type of max() and min()    OptionalDouble      OptionalInt     OptionalLong
        - Return type of sum()              double              int             long
        - Return type of average()          OptionalDouble      OptionalDouble  OptionalDouble
         */
        LongStream longs = LongStream.of(5, 10);
        long sum = longs.sum();
        System.out.println("longs.sum: " + sum);
        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        OptionalDouble min = doubles.min(); // runs infinitely. This also can appear in the exam.

    }





}
