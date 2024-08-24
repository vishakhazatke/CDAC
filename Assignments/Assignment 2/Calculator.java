class Calculator {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 20;
        int result = 0;
        char oper = '*';

        switch(oper) {
             
            case '+':
            result = num1 + num2;
            System.out.println(result);
            break;

            case '-':
            result = num1 - num2;
            System.out.println(result);
            break;

            case '*':
            result = num1 * num2;
            System.out.println(result);
            break;

            case '/':
            if(num1 == 0){
                System.out.println("Error");
            }
            else{
                result = num1 / num2;
                System.out.println(result);
            }
            break;


        }
    }
}
