import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input < 1 ? "no army" : input <= 19 ? "pack" : input <= 249 ? "throng" : input <= 999 ? "zounds" : "legion");
    }
}






