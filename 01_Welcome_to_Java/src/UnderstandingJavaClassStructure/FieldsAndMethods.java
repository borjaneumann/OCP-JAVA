package UnderstandingJavaClassStructure;

public class FieldsAndMethods {
    //Java classes have:
    //fields(variables)
    String name = "John";
    //Methods(functions)
    public void greeting(){
        System.out.println("My name is: " + name);
    }
    String getName(String name){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //Method signature (name + parameters) => setName(String Name)
    //Method declaration
//    More generally, method declarations have six components, in order:
//
//    Modifiers—such as public, private, and others you will learn about later.
//            The return type—the data type of the value returned by the method, or void if the method does not return a value.
//    The method name—the rules for field names apply to method names as well, but the convention is a little different.
//    The parameter list in parenthesis—a comma-delimited list of input parameters, preceded by their data types, enclosed by parentheses, (). If there are no parameters, you must use empty parentheses.
//    An exception list—to be discussed later.
//    The method body, enclosed between braces—the method's code, including the declaration of local variables, goes here.

    public static void main(String[] args) {
        FieldsAndMethods fam = new FieldsAndMethods();
        fam.greeting();
    }

}

