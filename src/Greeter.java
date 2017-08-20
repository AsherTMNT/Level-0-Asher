import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello " + name);

		String food = JOptionPane.showInputDialog("What is your favorite food?");
		JOptionPane.showMessageDialog(null, food + " is awesome!");
	}
}
