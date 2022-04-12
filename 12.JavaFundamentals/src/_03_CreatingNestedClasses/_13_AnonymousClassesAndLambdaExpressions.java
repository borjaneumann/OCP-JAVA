package _03_CreatingNestedClasses;

public class _13_AnonymousClassesAndLambdaExpressions {
    /*
    ANONYMOUS CLASSES AND LAMBDA EXPRESSIONS
    ========================================
    Prior to Java 8, anonymous classes were frequently used for
    asynchronous tasks and event handlers. For example, the following
    shows an anonymous class used as an event handler in a JavaFX application:

    Button redButton = new Button();
    redButton.setOnAction(new EventHandler<ActionEvent>()
    {
    public void handle(ActionEvent e) {
    System.out.println("Red button pressed!");
    }
    });

    Since Java 8, though, lambda expressions are a much more concise
    way of expressing the same thing.

    Button redButton = new Button();
    redButton.setOnAction(e -> System.out.println("Red
    button pressed!"));

    The only restriction is that the variable type must be a functional
    interface. If you haven't worked with functional interfaces and
    lambda expressions before, don't worry. We'll be reviewing them in
    this chapter.
     */
}
