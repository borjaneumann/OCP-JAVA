package _4_UsingListSetsMapsAndQueues;

public class _15_ComparingCollectionTypes {
    /*
     Behavior of the merge() method
     ---------------------------------------------------------------------------
    If the              And mapping                 Then:
    requested           function returns
    key ________        ________
    ==============================================================================
    Has a null          N/A (mapping                Update key's value in map with
    value in            function not                value parameter.
    map                 called)
    -------------------------------------------------------------------------------
    Has a non‐
    null value          null                        Remove key from map.
    in map
    ------------------------------------------------------------------------------
    Has a non‐          A non‐                      Set key to mapping function result.
    null value          null value
    in map
    ================================================================================
    Is not in           N/A (mapping                Add key with value parameter to
    map                 function not                map directly without calling
                        called)                     mapping function.



    Java Collections Framework types
                Can contain         Elements        Has keys        Must add/remove
    Type        duplicate           always          and             in specific order?
                elements?           ordered?        values?
    ----------------------------------------------------------------------------------
    List        Yes                 Yes (by index)  No              No
    ----------------------------------------------------------------------------------
    Map         Yes (for values)    No              Yes             No
    ----------------------------------------------------------------------------------
    Queue       Yes                 Yes (retrieved  No              Yes
                                    in defined
                                    order)
    ----------------------------------------------------------------------------------
    Set         No                  No              No              No


    Collection attributes
    Type        Java Collections Framework interface    Sorted? Calls hashCode? Calls compareTo?
    ========================================================================================
    ArrayList               List                        No      No              No
    HashMap                 Map                         No      Yes             No
    HashSet                 Set                         No      Yes             No
    LinkedList          List, Queue                     No      No              No
    TreeMap                 Map                         Yes     No              Yes
    TreeSet                 Set                         Yes     No              Yes
     */
}
