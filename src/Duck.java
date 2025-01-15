
public class Duck implements Animal {
	private String name = "duck";
	private String sound = "quack";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSound() {
		return sound;
	}

}
