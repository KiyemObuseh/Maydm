import java.util.Scanner;

public class binary {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int word;
        System.out.println("Whats the sentence");
        String player = input.nextLine();
        for (int i = 0; i<= player.length()-1; i++) {

        
        word = (int)player.charAt(i);

    int a = word/128;
    word = word%128;
    int b = word/64;
    word = word%64;
    int c = word/32;
    word = word % 32;
    int d = word / 16;
    word = word % 16;
    int e = word/8;
    word = word%8;
    int f = word/4;
    word = word%4;
    int g = word/2;
    word = word % 2;
    int h = word / 1;
    word = word % 1;
System.out.println(" "+ a + b + c + d + e + f + g + h);

    
    }
}
}
