public class CountInBinaryBigger {
    public static void main(String[] args) {
        int count = 0;
		while (count < 1024) {
			// Build the bit string
			int number = count;
            String bitString = "";

            bitString += Integer.toString(number / 512);
            number %= 512;
            bitString += Integer.toString(number / 256);
            number %= 256;
            bitString += Integer.toString(number / 128);
            number %= 128;
            bitString += Integer.toString(number / 64);
            number %= 64;
            bitString += Integer.toString(number / 32);
            number %= 32;
            bitString += Integer.toString(number / 16);
            number %= 16;
            bitString += Integer.toString(number / 8);
            number %= 8;
            bitString += Integer.toString(number / 4);
            number %= 4;
            bitString += Integer.toString(number / 2);
            number %= 2;
            bitString += Integer.toString(number);

            System.out.println(bitString);

			count++;
		}
    }
}
