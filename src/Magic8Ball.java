import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {

	int random = new Random().nextInt(4);
	
	System.out.println(random);

	JOptionPane.showInputDialog("Ask me anything.");

	if (random==(0)){
		JOptionPane.showMessageDialog(null,"Yes.");
	}
	if (random==(1)){
		JOptionPane.showMessageDialog(null,"No.");
	}
	if (random==(2)){
		JOptionPane.showMessageDialog(null,"Maybe you should ask Google?");
	}
	if (random==(3)){
		JOptionPane.showMessageDialog(null,"To be honest, I don't know.");
	}

}
}

