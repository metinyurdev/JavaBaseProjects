//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try{
            //code that generate exception
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        } catch(ArithmeticException e){
            System.out.println("Arithmetic exception => " + e.getMessage());
            System.out.println(e.toString());
        }
        finally {
            System.out.println("This is the finally block.");
        }

        try{
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[4]);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        finally {
            System.out.println("I always run");
        }

        //or

//        try{
//            int a = 5;
//            int b = 0;
//            int divideResult = a / b;
//
//            int[] numberArray = new int[] {10,20,30};
//            System.out.println(numberArray[5]);
//        } catch (ArithmeticException e){
//            System.out.println(e.toString());
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.toString());
//        }
//        finally {
//            System.out.println("This is finally block");
//        }

    }
}