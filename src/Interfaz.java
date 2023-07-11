import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

public class Interfaz extends JFrame {
		private static final long serialVersionUID = 1L;
	
	    public Interfaz() {
	    	setIconImage(Toolkit.getDefaultToolkit().getImage("iconoepico.png"));
	    	getContentPane().setBackground(Color.MAGENTA);
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	this.setResizable(false);
	    	this.setBounds(350, 100, 652, 388);
	        setSize(652, 388);
	        getContentPane().setLayout(null);
	        
	        
	        
	        JButton btnNewButton_2 = new JButton("");
	        btnNewButton_2.setIcon(new ImageIcon("btnAritmetica.png"));
	        btnNewButton_2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                Aritmetica();
	            }
	        });
	        btnNewButton_2.setBounds(25, 94, 109, 114);
	        getContentPane().add(btnNewButton_2);
	
	        
	        JButton btnNewButton_2_1 = new JButton("");
	        btnNewButton_2_1.setIcon(new ImageIcon("btnVectores.png"));
	        btnNewButton_2_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Vectores();
	        	}
	        });
	        btnNewButton_2_1.setBounds(25, 219, 109, 114);
	        getContentPane().add(btnNewButton_2_1);
	
	        JButton btnNewButton_2_2 = new JButton("");
	        btnNewButton_2_2.setIcon(new ImageIcon("btnEcuaciones.png"));
	        btnNewButton_2_2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Ecuaciones();
	        	}
	        });
	        btnNewButton_2_2.setBounds(144, 219, 110, 114);
	        getContentPane().add(btnNewButton_2_2);
	
	        JButton btnNewButton_2_3 = new JButton("");
	        btnNewButton_2_3.setIcon(new ImageIcon("btnMatrices.png"));
	        btnNewButton_2_3.setBounds(144, 94, 110, 114);
	        getContentPane().add(btnNewButton_2_3);
	        
	        JLabel lblNewLabel_1 = new JLabel("");
	        lblNewLabel_1.setIcon(new ImageIcon("fondo.jpg"));
	        lblNewLabel_1.setBackground(Color.GRAY);
	        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblNewLabel_1.setFont(new Font("Minecrafter", Font.PLAIN, 20));
	        lblNewLabel_1.setBounds(-132, 0, 768, 435);
	        getContentPane().add(lblNewLabel_1);
	        btnNewButton_2_3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                Matrices();
	            }
	        });
	        
	    }
	    
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	        	Interfaz mainFrame = new Interfaz();
	            mainFrame.setVisible(true);
	        });
	    }
	
	    //"LLAMADAS" A LAS CALCULADORAS
		    private void Aritmetica(){
		        Aritmetica calculadoraAritmetica = new Aritmetica();
		        calculadoraAritmetica.setVisible(true);
		    }
		    private void Matrices(){
		        Matrices calculadoraMatrices = new Matrices();
		        calculadoraMatrices.setVisible(true);
		    }
		    
		    private void Vectores(){
		    	Vectores calculadoraVectores = new Vectores();
		    	calculadoraVectores.setVisible(true);
		    }
		    
		    private void Ecuaciones() {
		    	Ecuaciones calculadoraEcuaciones2x2 = new Ecuaciones();
		    	calculadoraEcuaciones2x2.setVisible(true);
		    }
		//---------------------------------------------
		
		public ButtonGroup getButtonGroup() {
			return getButtonGroup();
		}
    }