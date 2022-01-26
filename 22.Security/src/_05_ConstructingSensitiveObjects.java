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
}
