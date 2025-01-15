
public class OldMcDonald {

	public static void main(String[] args) {
		Animal animal1 = new Pig();
		Animal animal2 = new Duck();
		
		// Verse 1:
		String farmLine = "Old MacDonald had a farm. E-I-E-I-O.\n";
		String animalLine1 = "And on that farm he had a " + animal1.getName() + ". E-I-E-I-O.\n";
		String soundLines1 = "An " + animal1.getSound() + " " 
							+ animal1.getSound() + " here.\n" 
							+ "And an " + animal1.getSound() + " " 
							+ animal1.getSound() + " there.\n";
		
		// Printing first verse:
		System.out.println(farmLine + animalLine1 + soundLines1 + farmLine);
		
		String animalLine2 = "And on that farm he had a " + animal2.getName() + ". E-I-E-I-O.\n";
		
		String soundLines2 = "A " + animal2.getSound() + " " 
				+ animal2.getSound() + " here.\n" 
				+ "And a " + animal2.getSound() + " " 
				+ animal2.getSound() + " there.\n";
		
		// Printing second verse:
		System.out.println(farmLine + animalLine2 + soundLines2 + soundLines1 + farmLine);

	}

}
