import javax.swing.JOptionPane;

public class MadLibs {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "If you ever find yourself keeping care of a barn, here's how to do it.");
		String Animal1 = JOptionPane.showInputDialog("Choose an animal(s).");
		String Food = JOptionPane.showInputDialog("Choose a food.");
		String Verb1 = JOptionPane.showInputDialog("Choose a verb.");
		String Place = JOptionPane.showInputDialog("Choose a place.");
		String Verb2 = JOptionPane.showInputDialog("Choose a verb.");
		String Animal2 = JOptionPane.showInputDialog("Choose an animal(s).");
		String Adjective = JOptionPane.showInputDialog("Choose an adjective.");
		String Noun1 = JOptionPane.showInputDialog("Choose a noun");
		String Animal3 = JOptionPane.showInputDialog("Choose an animal.");
		String Noun2 = JOptionPane.showInputDialog("Choose a plural noun.");
		String Animal4 = JOptionPane.showInputDialog("Choose an animal(s).");
		JOptionPane.showMessageDialog(null, "If you ever find yourself keeping care of a barn, here's how to do it. First you're going to need to feed the "
				+ Animal1 + ". They like to eat" + Food + ", so you're going to have to" + Verb1 + "to" + Place + "to get some. After that, you're going to need to"
				+ Verb2 + "the" + Animal2 + ". They're usually pretty" + Adjective + ", so you're not going to need a " + Noun1 + ". Next you're going to need to check the"
				+ "(animal) coop, to see if any of them layed any (plural noun). The last thing you need to do is take out the (animal(s). After that"
				+ "you're all done for the day. Until, you have to do it again all over tomorrow.");
	}
}
