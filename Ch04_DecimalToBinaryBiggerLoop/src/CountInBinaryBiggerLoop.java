public class CountInBinaryBiggerLoop {
    public static void main(String[] args) {
        int count = 0;
		final int MAX = 32;
		while (count < MAX) {
            // Build the bit string
            int number = count;
            String bitString = "";

            int placeValue = MAX / 2;
            while (placeValue > 0) {
                bitString += Integer.toString(number / placeValue);
                number %= placeValue;
                placeValue /= 2;
            }

            System.out.println("***" + bitString);
			
			count++;
		}
    }
}
