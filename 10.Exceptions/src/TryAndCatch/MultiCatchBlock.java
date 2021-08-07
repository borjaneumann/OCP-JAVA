package TryAndCatch;

public class MultiCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing or invalid input");
        } catch (NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }
        try{
            System.out.println(Integer.parseInt(args[1]));
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException e){//multi catch block
            System.out.println("Missing or invalid input");
        }
    }
}
