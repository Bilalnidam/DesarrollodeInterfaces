import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.WindowConstants;

public class Calculadora {

	public static void main(String[] args) {
		Calculadora C = new Calculadora();
	}
	/*
	 * private static class EscuchadorInterno implements ActionListener { // para
	 * llamarla internamente y no tener una // clase con dos lineas solamente
	 * 
	 * @Override public void actionPerformed(ActionEvent e) {
	 * 
	 * //System.out.println("Enter en el TextField");
	 * 
	 * //System.out.println("Has pulsado el boton, este es el Listener interno");
	 * String comando = e.getActionCommand();
	 * System.out.println("Has pulsado el boton:" + comando);
	 * 
	 * JButton origen = (JButton) e.getSource();
	 * System.out.println("Has pulsado en:" + origen.getText());
	 * 
	 * } }
	 */
	
	JFrame frame;
	JPanel SupPanel, Calc;

	double operacion1 = 0, operacion2 = 0;
	String operacion = "";
	boolean numeroinsertado = true;

	JLabel campotextoLabel;

	public Calculadora() {
		SupPanelnew();
		panelcalc();
		DiseñoVentana();
	}

	void SupPanelnew() {
		SupPanel = new JPanel();
		SupPanel.setLayout(new FlowLayout());
		campotextoLabel = new JLabel("Comience a operar");
		SupPanel.add(campotextoLabel);
	}

	void panelcalc() {

		Calc = new JPanel();
		Calc.setLayout(new GridLayout(4, 5));

		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb0 = new JButton("0");
		JButton jbC = new JButton("C");
		JButton jbpunto = new JButton(".");
		JButton jbmas = new JButton("+");
		JButton jbmenos = new JButton("-");
		JButton jbx = new JButton("x");
		JButton jbdividir = new JButton("/");
		JButton jbmasmenos = new JButton("+/-");
		JButton jbsiguiente = new JButton("siguiente");
		JButton jbigual = new JButton("=");

		Calc.add(jb7);
		Calc.add(jb8);
		Calc.add(jb9);
		Calc.add(jbmasmenos);
		Calc.add(jbsiguiente);
		Calc.add(jb4);
		Calc.add(jb5);
		Calc.add(jb6);
		Calc.add(jbx);
		Calc.add(jbdividir);
		Calc.add(jb1);
		Calc.add(jb2);
		Calc.add(jb3);
		Calc.add(jbmenos);
		Calc.add(jbigual);
		Calc.add(jbC);
		Calc.add(jb0);
		Calc.add(jbpunto);
		Calc.add(jbmas);

		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (numeroinsertado) {
					campotextoLabel.setText("");
					numeroinsertado = false;
				}
				campotextoLabel.setText(campotextoLabel.getText() + "1");
			}
		});

		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (numeroinsertado) {
					campotextoLabel.setText("");
					numeroinsertado = false;
				}
				campotextoLabel.setText(campotextoLabel.getText() + "2");
			}
		});

		jb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (numeroinsertado) {
					campotextoLabel.setText("");
					numeroinsertado = false;
				}
				campotextoLabel.setText(campotextoLabel.getText() + "3");
			}
		});

		jb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (numeroinsertado) {
					campotextoLabel.setText("");
					numeroinsertado = false;
				}
				campotextoLabel.setText(campotextoLabel.getText() + "4");
			}
		});

		jb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (numeroinsertado) {
					campotextoLabel.setText("");
					numeroinsertado = false;
				}
				campotextoLabel.setText(campotextoLabel.getText() + "5");
			}
		});

		jb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (numeroinsertado) {
					campotextoLabel.setText("");
					numeroinsertado = false;
				}
				campotextoLabel.setText(campotextoLabel.getText() + "6");
			}
		});

		jb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (numeroinsertado) {
					campotextoLabel.setText("");
					numeroinsertado = false;
				}
				campotextoLabel.setText(campotextoLabel.getText() + "7");
			}
		});

		jb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (numeroinsertado) {
					campotextoLabel.setText("");
					numeroinsertado = false;
				}
				campotextoLabel.setText(campotextoLabel.getText() + "8");
			}
		});

		jb9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (numeroinsertado) {
					campotextoLabel.setText("");
					numeroinsertado = false;
				}
				campotextoLabel.setText(campotextoLabel.getText() + "9");
			}
		});

		jb0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (numeroinsertado) {
					campotextoLabel.setText("");
					numeroinsertado = false;
				}
				campotextoLabel.setText(campotextoLabel.getText() + "0");
			}
		});

		jbC.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				campotextoLabel.setText("");
				operacion1 = operacion2 = 0;
				operacion = "";
			}
		});

		jbpunto.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				if (numeroinsertado) {
					campotextoLabel.setText("");
					numeroinsertado = false;
				}
				campotextoLabel.setText(campotextoLabel.getText() + ".");
			}
		});

		
	}

	void DiseñoVentana() {
		JFrame frame = new JFrame("Calculadora ITACA");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.add(SupPanel);
		frame.add(Calc);
		frame.pack();
		frame.setVisible(true);
	}

}
