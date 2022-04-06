package _03_HandlingExceptions;

public class _17_ApplyingAMultiCatchBlock {
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
    /*
    The exam might try to trick you with invalid syntax. Remember that the
    exceptions can be listed in any order within the catch clause. However,
    the variable name must appear only once and at the end. Do you see why
    these are valid or invalid?

    catch(Exception1 e | Exception2 e | Exception3 e) // DOES NOT COMPILE
    catch(Exception1 e1 | Exception2 e2 | Exception3 e3) // DOES NOT COMPILE
    catch(Exception1 | Exception2 | Exception3 e) // DOES COMPILE

    Do you see what is wrong here?
    try {
        throw new IOException();
    } catch (FileNotFoundException | IOException p) {} // DOES NOT COMPILE

    Specifying it in the multi-catch is redundant, and the compiler gives a
    message such as this:
    The exception FileNotFoundException is already caught by the
    alternative IOException

    The one difference between multi-catch blocks and chaining catch blocks
    is that order does not matter for a multi-catch block within a single catch expression.

    To review multi-catch, see how many errors you can find in this try statement:

    11: public void doesNotCompile() { // METHOD DOES NOT COMPILE
    12:     try {
    13:         mightThrow();
    14:     } catch (FileNotFoundException | IllegalStateException
    e) {
    15:     } catch (InputMismatchException e | MissingResourceException e) {
    16:     } catch (FileNotFoundException | IllegalArgumentException e) {
    17:     } catch (Exception e) {
    18:     } catch (IOException e) {
    19:     }
    20: }
    21: private void mightThrow() throws DateTimeParseException, IOException { }

     */
}
