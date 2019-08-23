package calculator_alm;

public class Calculate {
    

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1/num2;
        }
        return 0;
    }    
    
    public double multiply(double num1, double num2) {
        return num1 * num2;

    }

    public double add(double a, double b){
        double c = a + b;
        return c;
    }
    
    public double subtract(double a, double b) {
        double c = a - b;
        return c; 
    }
    
    public double powerOf(double a, double b) {
        double c = Math.pow(a, b);
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
    
    public String calculate(double firstNumber, String function, double secondNumber){
        //right now this method returns a String
        switch(function){
            case "/":
                return Double.toString(divide(firstNumber,secondNumber));
            case "*":
                return Double.toString(multiply(firstNumber,secondNumber));
            case "+":
                return Double.toString(add(firstNumber, secondNumber));
            case "-":
                return Double.toString(subtract(firstNumber, secondNumber));
                
        }
        return "ERROR!";
    }
        

   

}
