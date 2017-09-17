import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.plaf.FontUIResource;

public class Validation {
public static void main(String[] args) {

			for (int i = 0; i < 10; i++) {
				int randomNumber = new Random().nextInt(5);
				System.out.println(randomNumber);

				if (randomNumber==0){
					JOptionPane.showMessageDialog(null,"You have wonderful eyes.");
				}		
				if (randomNumber==1){
					JOptionPane.showMessageDialog(null,"That shirt looks great on you.");
				}
				if (randomNumber==2){
					JOptionPane.showMessageDialog(null,"I love your hairstyle.");
				}
				if (randomNumber==3){
					JOptionPane.showMessageDialog(null,"You are the most talented person on earth.");
				}
				if (randomNumber==4){
					JOptionPane.showMessageDialog(null,"I love your shoes. They look great on you");
				}
			}
}
}
