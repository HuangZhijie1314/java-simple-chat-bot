import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int i=scanner.nextInt();
        int j=scanner.nextInt();
        int k=scanner.nextInt();
        int nu=0;
        int b=j;
        for(int a=i;a<=b;a++){
            if(a%k==0){
                nu++;
            }

        };
        System.out.println(nu);
    }
}