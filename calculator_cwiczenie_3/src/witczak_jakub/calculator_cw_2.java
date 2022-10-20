package witczak_jakub;
import java.util.Scanner;
public class calculator_cw_2 {
    public static void main(String[] args) {
        Scanner myInputWitczak = new Scanner(System.in);

        System.out.print("Write youre weight: ");
        float weightWitczak = myInputWitczak.nextFloat();
        System.out.print("Write youre height: ");
        float heightWitczak = myInputWitczak.nextFloat();

        float bmiWitczak = weightWitczak/(float)Math.pow(heightWitczak/100,2);

        System.out.println("Youre BMI : "+bmiWitczak);

        if(bmiWitczak<16){
            System.out.println("wygłodzenie");
        }else if(bmiWitczak<=16.9){
            System.out.println("wychudzenie");
        }else if(bmiWitczak<=18.5){
            System.out.println("niedowaga");
        }else if(bmiWitczak<=24.9){
            System.out.println("waga prawidłowa");
        }else if(bmiWitczak<=29.9) {
            System.out.println("nadwaga");
        }else if(bmiWitczak<=34.9) {
            System.out.println("otyłość I stopnia");
        }else if(bmiWitczak<=39.9) {
            System.out.println("otylosc II stopnia");
        }else{
            System.out.println("otylosc III stopnia");
        }
    }
}
