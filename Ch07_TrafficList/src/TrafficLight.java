/**
 * Represents the state of a standard traffic light object
 * with stop, go, and caution signals.
 * Clients are responsible for the presentation of the 
 * view of a traffic light object.
 */
public class TrafficLight {
	
    /** The traffic light object's current color */
	private LightColor color;
	
    /** Initially, all traffic lights are red (stop signal) */
	public TrafficLight() {
		color = LightColor.RED;
	}
	
    /** Changes the lights state from its current signal to the next signal */
	public void change() {
		if (color == LightColor.RED) {
			color = LightColor.GREEN;
		} else if (color == LightColor.GREEN) {
			color = LightColor.YELLOW;
		} else if (color == LightColor.YELLOW) {
			color = LightColor.RED;
		}
	}

    /**
     * Gets the traffic light's current color.  Clients call
     * this method when they need to render the light.
     * @return the light's current color
     */
	public LightColor get() {
		return color;
	}
	
}
