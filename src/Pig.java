
public class Pig implements Animal {
	private String name = "pig";
	private String sound = "oink";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSound() {
		return sound;
	}

}
