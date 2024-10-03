// Q4) Sum of First N Natural numbers 

class SumOfFirstNatural {
    public static void main(String[] args) {
        int Sum = 0;
        int N = 100;

        for(int i = 1; i <= N; i++ ){
            Sum = Sum + i;
        }
        System.out.println("Sum of "+ N + " Natural Number is "+ Sum);
    }
}
