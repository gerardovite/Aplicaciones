import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 * @author Gerardo_Vite
 *
 */
public class Ventana extends JFrame implements ActionListener {

	// Se crean las cajas de texto
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 =new JTextField();
	
	//Se crean los label con las etiquetas
	private JLabel lbN1 = new JLabel("Ingresa un número");
	private JLabel lbN2 = new JLabel("Ingresa un número");
	private JLabel lbResultado = new JLabel("Resultado");
	
	// Se crean los botones que se van a ocupar
	private JButton btnSuma = new JButton("+");
	private JButton btnResta = new JButton("-");
	private JButton btnMult = new JButton("*");
	private JButton btnDiv = new JButton("/");
	
	//Se crea el contenedor
	private Container c = getContentPane();
	
	private Operaciones op = new Operaciones();
	
	/**
	 * Constructor de la clase
	 */
	public Ventana(){
		super.setTitle("Operaciones");
		//Dimensiones del area de trabajo
		super.setSize(350, 500);
		//Programa el boton de cerrar para que se detenga el programa
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}
	/**
	 * Cargan los botones de la aplicacion
	 */
	private void cargarControles(){
		c.setLayout(null);
		//Se acomodan las etiqueteas, cajas de texto y botones
		lbN1.setBounds(10, 10, 300, 30);
		txtN1.setBounds(10, 40, 300, 30);
		
		lbN2.setBounds(10, 80, 300, 30);
		txtN2.setBounds(10, 110, 300, 30);
		
		btnSuma.setBounds(10, 150, 50, 30);
		btnResta.setBounds(10, 180, 50, 30);
		btnMult.setBounds(10, 210, 50, 30);
		btnDiv.setBounds(10, 240, 50, 30);
		lbResultado.setBounds(10, 270, 250, 30);
		//Se agregan los botones
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		
		c.add(btnSuma);
		c.add(btnResta);
		c.add(btnMult);
		c.add(btnDiv);
		c.add(lbResultado);
		
		/**
		 * Se manda a llamar la operacion de suma
		 */
		btnSuma.addActionListener(new ActionListener() {
			
			@Override
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int sum=op.suma(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
				lbResultado.setText(String.format("%s + %s = %d", txtN1.getText(), txtN2.getText() , sum));
			}
		});
		/**
		 * Se manda a llamar la operacion de resta
		 */
		btnResta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int res=op.resta(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
				lbResultado.setText(String.format("%s - %s = %d", txtN1.getText(), txtN2.getText() , res));
			}
		});
		
		/**
		 * Se manda a llamar la operacion de multiplicacion
		 */
		btnMult.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int mul=op.mult(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
				lbResultado.setText(String.format("%s * %s = %d", txtN1.getText(), txtN2.getText() , mul));
			}
		});
		/**
		 * Se manda a llamar la operacion de division
		 */
		btnDiv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int div=op.div(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
				lbResultado.setText(String.format("%s / %s = %d", txtN1.getText(), txtN2.getText() , div));
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
