import java.util.Scanner;
class stretch{
    static int factorial(int n){
        int m = 1;
        for (int i = 1; i <=n; i ++){
            m = m*i;
        }
        return m;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
}