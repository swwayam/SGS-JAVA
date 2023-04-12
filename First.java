import java.util.function.DoubleBinaryOperator;

// Method Overloading
class Calculator{
    int addition(int num1,int num2){
        System.out.println("The answer is from int addition method");
        return num1 + num2;
    }

    Double addition(Double num1, Double num2){
        System.out.println("The answer is from double addition method");
        return num1 + num2;
    }

    Double addition(int num1,Double num2){
        System.out.println("The answer is from line 15 method");
        return num1 + num2;
    }
    

    Double addition(Double num1,int num2){
        System.out.println("The answer is from line 20 method");
        return num1 + num2;
    }


    int subtraction(int num1 ,int num2){
        return num1 - num2;
    }

    // multiplication(){

    // }

    // division(){

    // }

    // modulus(){

    // }
}


// Filename should be same as the class name

class First{



    // there should be a main method present 
    public static void main(String[] args) {
        System.out.println("First Java Class");
        System.out.println("Hello World");
        Calculator first = new Calculator();
        System.out.println(first.addition(10, 20) );
        System.out.println(first.addition(10.2, 20.6));
        System.out.println(first.addition(10, 20.6));
        System.out.println(first.addition(10.2, 20));
    }
    
}

