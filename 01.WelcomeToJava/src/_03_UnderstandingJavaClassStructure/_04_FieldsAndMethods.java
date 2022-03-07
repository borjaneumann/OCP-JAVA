package _03_UnderstandingJavaClassStructure;

public class _04_FieldsAndMethods {
    /*
    Classes are the basic building blocks. To use most classes, you have to create objects.

    An object is a runtime instance of a class in memory. An object is often referred to as an
    instance since it represents a single representation of the class. All the
    various objects of all the different classes represent the state of your
    program.

    A reference is a variable that points to an object.
     */
    /*
    Java classes have two primary elements:

    Methods.  often called functions or procedures in other languages.
    A method is an operation that can be called, they have a return type.
    The void keyword means that no value at all is returned.

    Fields, more generally known as variables.

    Together these are called the members of the class. Variables
    hold the state of the program, and methods operate on that state. If the
    change is important to remember, a variable stores that change.

    There are also interfaces and Enums
     */

    //Java classes have:
    //fields(variables)
    String name = "John";

    //Methods(functions)
    public void greeting(){
        System.out.println("My name is: " + name);
    }
    String getName(String name){
        return name;
    } //getter

    public void setName(String name){
        this.name = name;
    } //setter

    /*Method signature (name + parameters) => setName(String Name)

    Method declaration (Extra Info)
    More generally, method declarations have six components, in order:

    1) Modifiers—such as public, private, and others you will learn about later.
    2) The return type—the data type of the value returned by the method,
    or void if the method does not return a value.
    3) The method name—the rules for field names apply to method names as well,
    but the convention is a little  different.
    4) The parameter list in parenthesis—a comma-delimited list of input parameters,
    preceded by their data types, enclosed by parentheses, ().
    If there are no parameters, you must use empty parentheses.
    5) An exception list—to be discussed later.
    6) The method body, enclosed between braces—the method's code, including
    the declaration of local variables, goes here.
    */
    public static void main(String[] args) {
        _04_FieldsAndMethods fam = new _04_FieldsAndMethods();
        fam.greeting();
    }

}

