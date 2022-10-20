package witczak_jakub;
import java.util.Scanner;

public class calculator_cw_3 {
    static Scanner inputWitczak = new Scanner(System.in);
    static  float inAWitczak,inBWitczak,inCWitczak,delaWictzak,x1Witczak,x2Witczak;

    public static void main(String[] args) {
            System.out.println("ax^2+bx+c=0");
        do {
            System.out.println("Write a: ");
            inAWitczak = inputWitczak.nextFloat();
        }while(inAWitczak == 0);
        System.out.println("Write b: ");
            inBWitczak = inputWitczak.nextFloat();
        System.out.println("Write c: ");
            inCWitczak = inputWitczak.nextFloat();

        delaWictzak = (float)Math.pow(inBWitczak,2)-(4*inAWitczak*inCWitczak);


        x1Witczak = ((-1*inBWitczak)+(float)(Math.pow(delaWictzak,(1/2))))/2*inAWitczak;
        x2Witczak = ((-1*inBWitczak)-(float)(Math.pow(delaWictzak,(1/2))))/2*inAWitczak;
    }
}
