package frontend;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.Choice;
import java.awt.Panel;
import javax.swing.JCheckBoxMenuItem;

public class ProbarPantalla {
	
	public static void main(String[] args) {
		PantallaGrafica pantalla = new PantallaGrafica();
		pantalla.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Panel panel = new Panel();
		pantalla.getContentPane().add(panel);
		
		Choice choice_1 = new Choice();
		panel.add(choice_1);
		
		Choice choice = new Choice();
		panel.add(choice);
		pantalla.setVisible(true);
	}

}
