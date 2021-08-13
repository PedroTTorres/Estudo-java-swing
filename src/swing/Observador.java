package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		
		janela.setSize(600,200);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setLayout(new FlowLayout());
		
		janela.setLocationRelativeTo(null);
		
		JButton botao = new JButton("CLick");
		janela.add(botao);
		
		janela.setVisible(true);
		
		
	}

}
