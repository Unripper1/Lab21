import java.util.Scanner;

class Exception1 {
    public void exceptionDemo(){
        try {
            System.out.println(2/0);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("2/0");
        }
    }
}

class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try {
            System.out.println(2 / i);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("2/0");
        }
    }
}



public class Test {
    public static void main(String[] args) {
        Exception1 exc = new Exception1();
        exc.exceptionDemo();
        Exception2 exc2 = new Exception2();
        exc2.exceptionDemo();
    }
}