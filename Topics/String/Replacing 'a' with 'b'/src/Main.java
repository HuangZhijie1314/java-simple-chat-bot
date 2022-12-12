import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String word=scanner.nextLine();
        word=word.replace('a','b');
        System.out.println(word);
    }
}