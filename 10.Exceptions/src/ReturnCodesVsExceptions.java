public class ReturnCodesVsExceptions {
    public int indexOf(String[] names, String name){
        for (int i = 0; i < names.length; i++){
            if (names[i] == name){
                return i;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        ReturnCodesVsExceptions rcve = new ReturnCodesVsExceptions();
        String[] names = {"John", "Alex", "Robert"};
        String name = "John";
        System.out.println(rcve.indexOf(names, name));
    }
}
