import java.util.Scanner;

class Calculator{
    private int firstNumber;
    private int secondNumber;

    public Calculator(int firstNumber, int secondNumber) { //Constructor to
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int multiply() { //Para ma multiply
        return firstNumber * secondNumber;
    }

    public int add() { //Addition
        return firstNumber + secondNumber;
    }   
    public int sub() { //Substraction
        return firstNumber - secondNumber;

    }       
public class MDASCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your First Number: ");
        int a = sc.nextInt();

        System.out.print("Input your Second Number: ");
        int b = sc.nextInt();

        System.out.println();
        
        System.out.println("Choose the Operation:");
        System.out.println("1. Multiplication");
        System.out.println("2. Division");
        System.out.println("3. Addition");
        System.out.println("4. Multiplication");
        System.out.println();

        System.out.print("Choice: ");
        int choice = sc.nextInt();

        Calculator calculate = new Calculator(a, b);

        switch(choice) {
            case 1:
                System.out.println("Result: " + calculate.multiply());
                break;
            case 3:
                System.out.println("Result: " + calculate.add());
                break;
            case 4:
                System.out.println("Result: " + calculate.sub());
                break;
            default:
                System.out.println("!!!Invalid Option for the Opertion!!! \nPlease Choose from the given above.");
                break;
        }

        sc.close();
    }
}
