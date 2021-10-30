import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(fibonacci(in.nextInt()));
    }
    private static int fibonacci(int nilai){
        if(nilai == 0 || nilai == 1){
            return nilai;
        }
        else{
            nilai = fibonacci(nilai - 2) + fibonacci(nilai - 1);
            return nilai;
        }
    }
}