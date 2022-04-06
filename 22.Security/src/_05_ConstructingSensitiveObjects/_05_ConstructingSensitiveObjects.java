import java.util.List;

public class _05_ConstructingSensitiveObjects {
    //We can even write a method that count how many items are in our order.
    public static int total(List<FoodOrder> orders) {
        return orders.stream()
                .mapToInt(FoodOrder::getCount)
                .sum();
    }

    /*
    When constructing sensitive objects, you need to ensure that subclasses
    can't change the behavior. Suppose we have a FoodOrder class.
    */
    public class FoodOrder {
        private String item;
        private int count;

        public FoodOrder(String item, int count) {
            setItem(item);
            setCount(count);
        }

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    /*
    This method signature pleases Hacker Harry because he can pass in his
    malicious subclass of FoodOrder. He overrides the getCount() and
    setCount() methods so that count is always zero.
    */
    public class HarryFoodOrder extends FoodOrder {
        public HarryFoodOrder(String item, int count) {
            super(item, count);
        }

        public int getCount() {
            return 0;
        }

        public void setCount(int count) {
            super.setCount(0);
            /*
             */
        }
    }
    //Luckily, there are three techniques to foil Hacker Harry.

    /*
    1. MAKING METHODS FINAL
    =======================
    If we make the methods final, the subclass can't change the behavior on us.
     */
    public class FoodOrder1 {
        private String item;
        private int count;

        public FoodOrder1(String item, int count) {
            setItem(item);
            setCount(count);
        }

        public final String getItem() {
            return item;
        }

        public final void setItem(String item) {
            this.item = item;
        }

        public final int getCount() {
            return count;
        }

        public final void setCount(int count) {
            this.count = count;
        }
    }
    /*
    Now the subclass can't provide different behavior for the get and set
    methods. In general, you should avoid allowing your constructors to call
    any methods that a subclass can provide its own implementation for.
    */

    /*
    2. MAKING CLASSES FINAL
    ====================
    Remembering to make methods final is extra work. Security Sienna
    points out that we don't need to allow subclasses at all since everything we
    need is in FoodOrder.
    */
    public final class FoodOrder2 {
        private String item;
        private int count;

        public FoodOrder2(String item, int count) {
            setItem(item);
            setCount(count);
        }

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    /*
    Now Hacker Harry can't create his malicious subclass to begin with!
     */
    /*
    3. MAKING THE CONSTRUCTOR PRIVATE
    ==============================
    Security Sienna notes that another way of preventing or controlling
    subclasses is to make the constructor private. This technique requires
    static factory methods to obtain the object.
    */
    public class FoodOrder3 {
        private String item;
        private int count;

        private FoodOrder3(String item, int count) {
            setItem(item);
            setCount(count);
        }

        public FoodOrder3 getOrder(String item, int count) {
            return new FoodOrder3(item, count);
        }

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
    /*
    The factory method technique gives you more control over the process of
    object creation.
     */
    /*
    HOW TO PROTECT THE SOURCE CODE
    ==============================
    Since this chapter is about Java SE applications, the person running
    your program will have access to the code. More specifically, they
    will have the bytecode ( .class) files, typically bundled in a JAR
    file.
    With the bytecode, Hacker Harry can decompile your code and
    get source code. It's not as well written as the code you wrote, but it
    has equivalent information.

    Obfuscation
    ----------
    Some people compile their projects with obfuscation tools to try to
    hide implementation details. Obfuscation is the automated process
    of rewriting source code that purposely makes it more difficult to
    read. For example, if you try to view JavaScript on a website, entire
    methods or classes may be on a single line with variable names like
    aaa, bbb, ccc, and so on. It's harder to know what a method does if
    it's named gpiomjrqw().

    While using an obfuscator makes the decompiled bytecode harder to
    read and therefore harder to reverse engineer, it doesn't actually
    provide any security. Remember that security by obscurity will slow
    down Hacker Harry, but it won't stop him!
     */
}
