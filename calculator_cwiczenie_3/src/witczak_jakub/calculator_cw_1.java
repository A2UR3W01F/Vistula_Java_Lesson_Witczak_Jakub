package witczak_jakub;
import java.util.Scanner;

public class calculator_cw_1 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Imput first number : ");
        float firstNumberWitczak =myInput.nextFloat();

        System.out.print("Imput second number : ");
        float secondNumberWitctzak =myInput.nextFloat();

        System.out.println("Sum = "+(firstNumberWitczak+secondNumberWitctzak));
        System.out.println("Minus = "+(firstNumberWitczak-secondNumberWitctzak));
        System.out.println("Muliple = "+(firstNumberWitczak*secondNumberWitctzak));
        System.out.println("Divaided = "+(firstNumberWitczak/secondNumberWitctzak));
    }
}
