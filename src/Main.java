import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("1 - Задание 1, 2 -Задание 2");
        Scanner in = new Scanner(System.in);
        int numb = in.nextInt();
        if (numb == 1){
            One a = new One();
        } else if (numb == 2){
            Two b = new Two();
        }
    }
}
