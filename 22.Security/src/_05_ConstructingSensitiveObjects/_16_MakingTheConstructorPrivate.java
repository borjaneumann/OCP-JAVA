package _05_ConstructingSensitiveObjects;

public class _16_MakingTheConstructorPrivate {
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
