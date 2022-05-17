package _03_UsingStreams;

public class _10_UnderstandingThePipelineFlow {
    /*
    Think of a stream pipeline as an assembly line in a factory. Suppose that
    we were running an assembly line to make signs for the animal exhibits at
    the zoo. We have a number of jobs. It is one person's job to take signs out
    of a box. It is a second person's job to paint the sign. It is a third person's
    job to stencil the name of the animal on the sign. It's the last person's job
    to put the completed sign in a box to be carried to the proper exhibit.
    Notice that the second person can't do anything until one sign has been
    taken out of the box by the first person. Similarly, the third person can't do
    anything until one sign has been painted, and the last person can't do
    anything until it is stenciled.

    The assembly line for making signs is finite. Once we process the contents
    of our box of signs, we are finished. Finite streams have a limit. Other
    assembly lines essentially run forever, like one for food production. Of
    course, they do stop at some point when the factory closes down, but
    pretend that doesn't happen. Or think of a sunrise/sunset cycle as infinite,
    since it doesn't end for an inordinately large period of time.

    Another important feature of an assembly line is that each person touches
    each element to do their operation and then that piece of data is gone. It
    doesn't come back. The next person deals with it at that point. This is
    different than the lists and queues that you saw in the previous chapter.
    With a list, you can access any element at any time. With a queue, you are
    limited in which elements you can access, but all of the elements are there.
    With streams, the data isn't generated up front—it is created when needed.
    This is an example of lazy evaluation, which delays execution until
    necessary.

    Many things can happen in the assembly line stations along the way. In
    functional programming, these are called stream operations. Just like with
    the assembly line, operations occur in a pipeline. Someone has to start and
    end the work, and there can be any number of stations in between. After
    all, a job with one person isn't an assembly line! There are three parts to a
    stream pipeline.

    1) Source: Where the stream comes from
    2) Intermediate operations: Transforms the stream into another one. There
    can be as few or as many intermediate operations as you'd like. Since
    streams use lazy evaluation, the intermediate operations do not run until
    the terminal operation runs.
    3) Terminal operation: Actually produces a result. Since streams can be
    used only once, the stream is no longer valid after a terminal operation
    completes.


    Notice that the operations are unknown to us. When viewing the assembly
    line from the outside, you care only about what comes in and goes out.
    What happens in between is an implementation detail.

    You will need to know the differences between intermediate and terminal
    operations well.

    TABLE 15.4 Intermediate vs. terminal operations
    Scenario                        Intermediate operation  Terminal operation
    ==========================================================================
    Required part of a useful       No                      Yes
    pipeline?
    --------------------------------------------------------------------------
    Can exist multiple times in a   Yes                     No
    pipeline?
    --------------------------------------------------------------------------
    Return type is a stream type?   Yes                     No
    --------------------------------------------------------------------------
    Executed upon method call?      No                      Yes
    --------------------------------------------------------------------------
    Stream valid after call?        Yes                     No

    A factory typically has a foreman who oversees the work. Java serves as
    the foreman when working with stream pipelines. This is a really
    important role, especially when dealing with lazy evaluation and infinite
    streams. Think of declaring the stream as giving instructions to the
    foreman. As the foreman finds out what needs to be done, he sets up the
    stations and tells the workers what their duties will be. However, the
    workers do not start until the foreman tells them to begin. The foreman
    waits until he sees the terminal operation to actually kick off the work. He
    also watches the work and stops the line as soon as work is complete.
    Let's look at a few examples of this. We aren't using code in these
    examples because it is really important to understand the stream pipeline
    concept before starting to write the code.

    Let's take a look at what happens from the point of the view of the
    foreman. First, he sees that the source is taking signs out of the box. The
    foreman sets up a worker at the table to unpack the box and says to await a
    signal to start. Then the foreman sees the intermediate operation to paint
    the sign. He sets up a worker with paint and says to await a signal to start.
    Finally, the foreman sees the terminal operation to put the signs into a pile.
    He sets up a worker to do this and yells out that all three workers should
    start.
    Suppose that there are two signs in the box. Step 1 is the first worker
    taking one sign out of the box and handing it to the second worker. Step 2
    is the second worker painting it and handing it to the third worker. Step 3
    is the third worker putting it in the pile. Steps 4–6 are this same process
    for the other sign. Then the foreman sees that there are no more signs left
    and shuts down the entire enterprise.
    The foreman is smart. He can make decisions about how to best do the
    work based on what is needed.

    The foreman still sees a source of taking signs out of the box and assigns a
    worker to do that on command. He still sees an intermediate operation to
    paint and sets up another worker with instructions to wait and then paint.
    Then he sees an intermediate step that we need only two signs. He sets up
    a worker to count the signs that go by and notify him when the worker has
    seen two. Finally, he sets up a worker for the terminal operation to put the
    signs in a pile.

    This time, suppose that there are 10 signs in the box. We start out like last
    time. The first sign makes its way down the pipeline. The second sign also
    makes its way down the pipeline. When the worker in charge of counting
    sees the second sign, she tells the foreman. The foreman lets the terminal
    operation worker finish her task and then yells out “stop the line.” It
    doesn't matter that there are eight more signs in the box. We don't need
    them, so it would be unnecessary work to paint them. And we all want to
    avoid unnecessary work!
    Similarly, the foreman would have stopped the line after the first sign if
    the terminal operation was to find the first sign that gets created.
    In the following sections, we will cover the three parts of the pipeline. We
    will also discuss special types of streams for primitives and how to print a
    stream.
     */
}
