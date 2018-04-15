package my;

public class DecBinHex {

    public static void main(String[] args) {


        int decNumber = 25;
        System.out.println("Dec value is " + decNumber);

        String binNumber = Integer.toBinaryString(decNumber);
        System.out.println("Bin value is " + binNumber);

        String hexNumber = Integer.toHexString(decNumber);
        System.out.println("Hex value is " + hexNumber);
    }
}
