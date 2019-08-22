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

    public String returnFunction(String args){
        String[] numbersAndFunction = args.split(" ");
        return numbersAndFunction[1];
    }

}
