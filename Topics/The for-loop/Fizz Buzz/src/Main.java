import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int i=scanner.nextInt();
        int j=scanner.nextInt();
        for (int a=i;i<=j;i++){
            if (i%3==0&&i%5==0){
                System.out.println("FizzBuzz");continue;
            }
            if (i%3==0){
                System.out.println("Fizz");continue;
            }
            if (i%5==0){
                System.out.println("Buzz");continue;
            }
            else System.out.println(i);
        }
    }
}