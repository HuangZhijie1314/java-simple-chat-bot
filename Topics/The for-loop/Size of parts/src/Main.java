import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int i=0;
        int j= scanner.nextInt();
        int k=0;
        int m=0;
        int n=0;
        int b=j;
        for(;i<b;i++){
            int a=scanner.nextInt();
            if (a==1){
                k=k+1;
            }
            if (a==-1){
                m+=1;
            }
            if(a==0){
                n+=1;
            }
        }
        System.out.println(n+" "+k+" "+m);
    }
}