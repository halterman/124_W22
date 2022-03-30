public class TextTrafficLight {
	
    /**
     * Draws a traffic light object in a console
     * @param lt the traffic light to draw
     */
    private static void show(TrafficLight lt) {
        LightColor currentState = lt.get();
        if (currentState == LightColor.RED) {
            System.out.println("+---+");
            System.out.println("|(R)|");
            System.out.println("|( )|");
            System.out.println("|( )|");
            System.out.println("+---+");
        } else if (currentState == LightColor.GREEN) {
            System.out.println("+---+");
            System.out.println("|( )|");
            System.out.println("|( )|");
            System.out.println("|(G)|");
            System.out.println("+---+");
        } else if (currentState == LightColor.YELLOW) {
            System.out.println("+---+");
            System.out.println("|( )|");
            System.out.println("|(Y)|");
            System.out.println("|( )|");
            System.out.println("+---+");
        }
    }


	public static void main(String[] args) {
		TrafficLight light = new TrafficLight();
		var scan = new java.util.Scanner(System.in);
		String input;
		do {
			show(light);
			light.change();
			input = scan.nextLine();
		} while (input.equals(""));
		scan.close();
	}

}
