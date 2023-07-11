import java.awt.EventQueue;

		import javax.swing.JFrame;

		import javax.swing.JButton;

		import java.awt.event.ActionListener;

		import java.awt.event.ActionEvent;

		import javax.swing.SwingConstants;

		import java.awt.Color;

		import javax.swing.JTextField;

		import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;


		import java.lang.Math;


		
		public class Ecuaciones3x3 extends JFrame {
			
			private static final long serialVersionUID = 1L;
			
			//VARIABLES
			double numeroa;
			double numerob;
			double numeroc;
			double numerod;
			double numeroe;
			double numerof;
			double numerog;
			double numeroh;
			double numeroi;
			double numeroj;
			double numerok;
			double numerol;
			String operacion;
			double resultado;
			String seleccionar;
		    private final ButtonGroup buttonGroup = new ButtonGroup();
		    private JTextField textField_d;
		    private JTextField textField_h;
		    private JTextField textField_a;
		    private JTextField textField_b;
		    private JTextField textField_e;
		    private JTextField textField_f;
		    private JTextField textField_x;
		    private JTextField textField_y;
		    private JTextField textField_c;
		    private JTextField textField_g;
		    private JTextField textField_i;
		    private JTextField textField_j;
		    private JTextField textField_k;
		    private JTextField textField_l;
		    private JTextField textField_z;
		    public static void main(String[] args) {

		        EventQueue.invokeLater(new Runnable() {

		            public void run() {

		                try {

		                	Ecuaciones3x3 frame = new Ecuaciones3x3();
		                    frame.setVisible(true);

		                } catch (Exception e) {

		                    e.printStackTrace();

		                }

		            }

		        });

		    }



		    public Ecuaciones3x3() {
		  

		    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		    	setIconImage(Toolkit.getDefaultToolkit().getImage("iconoepico.png"));
		    	this.setResizable(false);
		        setBounds(659, 150, 349, 408);
		        getContentPane().setLayout(null);
				
				
				
				JButton btnNewButton_igual = new JButton("=");
				btnNewButton_igual.setBackground(new Color(128, 255, 255));
				btnNewButton_igual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String seleccionar;
				numerob = Double.parseDouble(textField_e.getText());
				
				if(operacion == "+") {
					resultado = numeroa+numerob;
					seleccionar = String.format("%.3f",resultado);
					textField_e.setText(seleccionar);
				}
				
				if(operacion == "-") {
					resultado = numeroa-numerob;
					seleccionar = String.format("%.3f",resultado);
					textField_e.setText(seleccionar);
				}
				
				if(operacion == "*") {
					resultado = numeroa*numerob;
					seleccionar = String.format("%.3f",resultado);
					textField_e.setText(seleccionar);
				}
					
				if(operacion == "/") {
					resultado = numeroa/numerob;
					seleccionar = String.format("%.3f",resultado);
					textField_e.setText(seleccionar);
				
				}
				
				if(operacion == "^") {
					resultado=Math.pow(numeroa,numerob);
					seleccionar = String.format("%.3f",resultado);
					textField_e.setText(seleccionar);
				}
				
				if(operacion == "√") {
					resultado=Math.pow(numeroa, 1.0 / numerob);
					seleccionar = String.format("%.3f",resultado);
					textField_e.setText(seleccionar);
				}
				
					}
		
				});
		
				btnNewButton_igual.setBounds(10, 207, 245, 33);
				getContentPane().add(btnNewButton_igual);
		
		
		
				JButton btnNewButton_c = new JButton("C");
				btnNewButton_c.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	textField_e.setText("");
				    	textField_d.setText("");
				    	textField_h.setText("");
				    	textField_a.setText("");
				    	textField_b.setText("");
				    	textField_f.setText("");
				    	textField_f.setText("");
				    	numeroa = 0;
				    	numerob = 0;
				    	numeroc = 0;
				    	numerod = 0;
				    	numeroe = 0;
				    	numerof = 0;
				    	
				    	seleccionar = String.format("%.0f",numeroa);
						textField_a.setText(seleccionar);
				    	seleccionar = String.format("%.0f",numerob);
						textField_b.setText(seleccionar);
						seleccionar = String.format("%.0f",numeroc);
						textField_c.setText(seleccionar);
						seleccionar = String.format("%.0f",numerod);
						textField_d.setText(seleccionar);
						seleccionar = String.format("%.0f",numeroe);
						textField_e.setText(seleccionar);
						seleccionar = String.format("%.0f",numerof);
						textField_f.setText(seleccionar);
						seleccionar = String.format("%.0f",numerog);
						textField_g.setText(seleccionar);
				    
				    }
				});
				
				btnNewButton_c.setBackground(new Color(255, 128, 64));
				btnNewButton_c.setBounds(274, 11, 50, 175);
				getContentPane().add(btnNewButton_c);
				
				textField_d = new JTextField();
				textField_d.setBackground(new Color(192, 192, 192));
				textField_d.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_d.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_d.setColumns(10);
				textField_d.setBounds(205, 11, 50, 50);
				getContentPane().add(textField_d);
				
				textField_h = new JTextField();
				textField_h.setBackground(new Color(192, 192, 192));
				textField_h.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_h.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_h.setColumns(10);
				textField_h.setBounds(205, 75, 50, 50);
				getContentPane().add(textField_h);
				
				textField_a = new JTextField();
				textField_a.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_a.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_a.setColumns(10);
				textField_a.setBackground(new Color(255, 128, 128));
				textField_a.setBounds(10, 11, 50, 50);
				getContentPane().add(textField_a);
				
				textField_b = new JTextField();
				textField_b.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_b.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_b.setColumns(10);
				textField_b.setBackground(new Color(128, 255, 128));
				textField_b.setBounds(75, 11, 50, 50);
				getContentPane().add(textField_b);
				
				textField_e = new JTextField();
				textField_e.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_e.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_e.setColumns(10);
				textField_e.setBackground(new Color(255, 128, 128));
				textField_e.setBounds(10, 75, 50, 50);
				getContentPane().add(textField_e);
				
				textField_f = new JTextField();
				textField_f.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_f.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_f.setColumns(10);
				textField_f.setBackground(new Color(128, 255, 128));
				textField_f.setBounds(75, 75, 50, 50);
				getContentPane().add(textField_f);
				
				textField_x = new JTextField();
				textField_x.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_x.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_x.setColumns(10);
				textField_x.setBackground(new Color(255, 128, 128));
				textField_x.setBounds(10, 255, 50, 50);
				getContentPane().add(textField_x);
				
				textField_y = new JTextField();
				textField_y.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_y.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_y.setColumns(10);
				textField_y.setBackground(new Color(128, 255, 128));
				textField_y.setBounds(75, 255, 50, 50);
				getContentPane().add(textField_y);
				
				textField_c = new JTextField();
				textField_c.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_c.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_c.setColumns(10);
				textField_c.setBackground(new Color(255, 255, 0));
				textField_c.setBounds(140, 11, 50, 50);
				getContentPane().add(textField_c);
				
				textField_g = new JTextField();
				textField_g.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_g.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_g.setColumns(10);
				textField_g.setBackground(Color.YELLOW);
				textField_g.setBounds(140, 75, 50, 50);
				getContentPane().add(textField_g);
				
				textField_i = new JTextField();
				textField_i.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_i.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_i.setColumns(10);
				textField_i.setBackground(new Color(255, 128, 128));
				textField_i.setBounds(10, 136, 50, 50);
				getContentPane().add(textField_i);
				
				textField_j = new JTextField();
				textField_j.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_j.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_j.setColumns(10);
				textField_j.setBackground(new Color(128, 255, 128));
				textField_j.setBounds(75, 136, 50, 50);
				getContentPane().add(textField_j);
				
				textField_k = new JTextField();
				textField_k.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_k.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_k.setColumns(10);
				textField_k.setBackground(Color.YELLOW);
				textField_k.setBounds(140, 136, 50, 50);
				getContentPane().add(textField_k);
				
				textField_l = new JTextField();
				textField_l.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_l.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_l.setColumns(10);
				textField_l.setBackground(Color.LIGHT_GRAY);
				textField_l.setBounds(205, 136, 50, 50);
				getContentPane().add(textField_l);
				
				textField_z = new JTextField();
				textField_z.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_z.setFont(new Font("Tahoma", Font.PLAIN, 22));
				textField_z.setColumns(10);
				textField_z.setBackground(Color.YELLOW);
				textField_z.setBounds(140, 255, 50, 50);
				getContentPane().add(textField_z);
				
				
		
				}



			public ButtonGroup getButtonGroup() {
				return buttonGroup;
			}
				}
