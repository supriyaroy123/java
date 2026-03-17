class Calculator {
    void add(int a, int b) 
    { 
        System.out.println("Addition is: "+(a + b)); 

    }
    void sub(int a, int b) 
    { 
        System.out.println("Subtraction is:"+ (a - b)); 

    }
    void mul(int a, int b)
     { 
        System.out.println("Multiplication is:"+a * b); 

     }
    void div(int a, int b) 
    { 
        System.out.println("Divion is:"+a / b); 

    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(12345, 6789);
        c.sub(10, 20);
        c.mul(47, 36);
        c.div(999, 9);
    }
}