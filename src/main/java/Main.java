public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("1 + 2 = " + calculator.add(1, 2));
        System.out.println("300 - 3 = " + calculator.subtract(300, 3));
        System.out.println("3 * 4 = " + calculator.multiply(3, 4));
        System.out.println("6 / 2 = " + calculator.subtract(6, 2));
        System.out.println("Fib of 10 = " + calculator.fibonacciNumberFinder(10));
        System.out.println("Binary of 3 = " + calculator.intToBinaryNumber(3));
    }

}
