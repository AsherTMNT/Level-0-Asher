import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String zodiac = JOptionPane.showInputDialog("What is your zodiac sign?");
		if (zodiac.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "You are soon going to recover a lost item today.");
		} else if (zodiac.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "You are going to find a new passion today.");
		} else if (zodiac.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "You are mostly likely going to eat food today.");
		} else if (zodiac.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "You like to eat food.");
		} else if (zodiac.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "Your favorite thing to do is breath oxygen.");
		} else if (zodiac.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null,
					"You are the most talented, most creative, most amazing person in the world.");
		} else if (zodiac.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "You like to consume lquids.");
		} else if (zodiac.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Cheese...");
		} else if (zodiac.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "I like strawberries. How about you?");
		} else if (zodiac.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "I really like the game Skyrim. You should play it. It's pretty good.");
		} else if (zodiac.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "I think that the best fruit is strawberries. That's just my opinion.");
		} else if (zodiac.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "I have a dog...");
		}
	}
}