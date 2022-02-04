import java.util.Scanner;

class DecimalToBinary {
	public static void main(String[] args) {
        //  Integer must be less than 32
        System.out.print("Please enter an integer in the range 0...31, inclusive: ");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		scan.close();
        // Build the binary representation of the integer if it is in range
        String bitstring = "";
        if ( 0 <= value && value < 32)  {
            if (value >= 16)  {
                bitstring += '1';
                value %= 16;
            } else {
                bitstring += '0';
            }
            if (value >= 8)  {
                bitstring += '1';
                value %= 8;
            } else {
                bitstring += '0';
            }
            if (value >= 4)  {
                bitstring += '1';
                value %= 4;
            } else {
                bitstring += '0';
            }
            if (value >= 2)  {
                bitstring += '1';
                value %= 2;
            } else {
                bitstring += '0';
            }
            bitstring += Integer.toString(value);
            System.out.println(bitstring);
        } else {
            System.out.println("Value not in range");
        }
    }
}
