import java.util.Scanner;

class BinaryConversion2 {
	public static void main(String[] args) {
        //  Integer must be less than 32
        System.out.print("Please enter an integer in the range 0...31, inclusive: ");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		scan.close();
        // Build the binary representation of the integer if it is in range
        String bitstring = "";
        if ( 0 <= value && value < 32)  {
            bitstring += Integer.toString(value/16);
            value %= 16;
            bitstring += Integer.toString(value/8);
            value %= 8;
            bitstring += Integer.toString(value/4);
            value %= 4;
            bitstring += Integer.toString(value/2);
            value %= 2;
            bitstring += Integer.toString(value);
            System.out.println(bitstring);
        } else {
            System.out.println(">>> Value not in range");
        }
    }
}
