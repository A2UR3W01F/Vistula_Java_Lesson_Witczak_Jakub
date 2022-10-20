package witczak_jakub;

public class calculator_cw_4 {
    static int curEvenNumberWitczak=2,sumEvenWitczak;
    public static void main(String[] args) {
        System.out.println("Current even number: "+curEvenNumberWitczak);
        sumEvenWitczak +=curEvenNumberWitczak;
        for(int i= 1 ; i <=50 ;i++){
            curEvenNumberWitczak +=2;
            sumEvenWitczak =sumEvenWitczak+curEvenNumberWitczak;
            System.out.println("Current even number: "+curEvenNumberWitczak);
        }
        System.out.println("Current even Sum: "+curEvenNumberWitczak);
    }
}
