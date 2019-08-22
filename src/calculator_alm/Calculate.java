package calculator_alm;

public class Calculate {
    

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1/num2;
        }
        return 0;
    }    

    public double add(double a, double b){
        double c = a + b;
        return c;
    }
    
    public double subtract(int a, int b) {
        int c = a - b;
        return c; 
    }

    public String returnFunctionFromString(String theString){
        String[] numbersAndFunction = theString.split(" ");
        return numbersAndFunction[1];
    }
    
    public double[] getNumbersFromString(String theString){
        String[] numbersAndFunction = theString.split(" ");
        double firstNumber= Double.parseDouble(numbersAndFunction[0]);
        double secondNumber= Double.parseDouble(numbersAndFunction[2]);
        double[] doublesToReturn = {firstNumber, secondNumber};
        return doublesToReturn;
    }
    
    public double calculate(double firstNumber, String function, double secondNumber){
        
        switch(function){
            case "/":
                return divide(firstNumber,secondNumber);
            case "*":
                return multiply(firstNumber,secondNumber);
                
        }
        
    }

}
