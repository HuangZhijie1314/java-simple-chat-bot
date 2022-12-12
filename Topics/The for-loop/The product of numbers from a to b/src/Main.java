import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int m=1;
        int i=scanner.nextInt();
        int j=scanner.nextInt();
        for(;i<j;i++){

            m=m*i;
        }
        System.out.println(m);
    }
}