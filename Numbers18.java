import java.util.Arrays;

public class Numbers18{
    public static void main(String [] args) {
        int [][] myNumbers = new int [3][];
        myNumbers [0] = new int [4];
        myNumbers [1] = new int [3];
        myNumbers [2] = new int [1];


        for (int i = 0; i < myNumbers.length; i++){
            System.out.println("panjang baris ke-" + (i+1) + ": " + myNumbers[i].length);
        }
    }
}