import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("入力してください：");
        Scanner scanner = new Scanner(System.in);
        String input_num = scanner.nextLine();
        int index = input_num.indexOf(" ");
        int left =  Integer.parseInt(input_num.substring(0, index));
        int light =  Integer.parseInt(input_num.substring(index + 1, input_num.length()));
        System.out.print("答え：");
        System.out.println(left + light);
    }
}