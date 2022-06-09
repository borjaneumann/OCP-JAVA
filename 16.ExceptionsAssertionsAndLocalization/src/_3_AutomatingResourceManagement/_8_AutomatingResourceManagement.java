package _3_AutomatingResourceManagement;

public class _8_AutomatingResourceManagement {
    /*
    As previously described, a try‐with‐resources statement ensures that any
    resources declared in the try clause are automatically closed at the
    conclusion of the try block. This feature is also known as automatic
    resource management, because Java automatically takes care of closing
    the resources for you.
    For the exam, a resource is typically a file or a database that requires some
    kind of stream or connection to read or write data.

    RESOURCE MANAGEMENT VS. GARBAGE COLLECTION
    ==========================================
    Java has great built‐in support for garbage collection. When you are
    finished with an object, it will automatically (over time) reclaim the
    memory associated with it.
    The same is not true for resource management without a try‐with‐
    resources statement. If an object connected to a resource is not
    closed, then the connection could remain open. In fact, it may
    interfere with Java's ability to garbage collect the object.
    To eliminate this problem, it is recommended that you close
    resources in the same block of code that opens them. By using a try‐
    with‐resources statement to open all your resources, this happens
    automatically.
     */
}
