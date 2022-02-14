public class CountInBinary {
    public static void main(String[] args) {
        int count = 0;
		while (count < 32) {
			// Build the bit string
            int number = count;
			String bitString = "";

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
