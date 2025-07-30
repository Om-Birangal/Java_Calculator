import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean continueCalculation = true;
        System.out.println("<===Welcome to Java Calculator===>");
        while (continueCalculation) {
            
            try{
                System.out.print("Enter 1st no. : ");
                double num1 = Double.parseDouble(sc.nextLine());

                System.out.print("Select a operator (+,-,*,/,%,^)  : ");
                char operator = sc.nextLine().charAt(0);
                
                System.out.print("Enter 2nd no. : ");
                double num2 = Double.parseDouble(sc.nextLine());

                double result;

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("Result : " +result);
                        
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("Result : " +result);
                        
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("Result : " +result);
                        
                        break;
                    case '/':
                        if (num2==0) {
                            System.out.println("Error: Division by 0 is not allowed");
                        }
                        result = num1 / num2;
                        System.out.println("Result : " +result);
                        
                        break;
                    case '%':
                        if (num2==0) {
                            System.out.println("Error: Modulus by 0 is not allowed");
                        }
                        result = num1 % num2;
                        System.out.println("Result : " +result);
                        
                        break;
                    case '^':
                        result = Math.pow(num1 , num2);
                        System.out.println("Result : " +result);
                        
                        break;
                
                    default:
                        System.out.println("Error :Invalid operator");
                        break;
                }

            }
            catch(NumberFormatException e){
                System.out.println("Invalid numeric input ");
            }
            catch(Exception e){
                System.out.println("Unexpected Error"+ e.getMessage());
            }
        System.out.print("Do you want to perform another operation (y/n) : ");
        String choice = sc.nextLine().trim().toLowerCase();
        if(!choice.equals ("y")){
            continueCalculation = false;
            System.out.println("Thanks for using Java calculator.");
        }
        }
        sc.close();
    }
}
