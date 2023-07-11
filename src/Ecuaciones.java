import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class Ecuaciones extends JFrame {
		private static final long serialVersionUID = 1L;
		private JTextField txtElijaLaCalculadora;
	
	    public Ecuaciones() {
	    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	    	setIconImage(Toolkit.getDefaultToolkit().getImage("iconoepico.png"));
	    	this.setResizable(false);
	    	this.setBounds(385, 150, 567, 206);
	        setSize(567, 206);
	        getContentPane().setLayout(null);
	
	        txtElijaLaCalculadora = new JTextField();
	        txtElijaLaCalculadora.setFont(new Font("Minecrafter", Font.PLAIN, 20));
	        txtElijaLaCalculadora.setHorizontalAlignment(SwingConstants.CENTER);
	        txtElijaLaCalculadora.setText("Elija entre los Sistemas de Ecuaciones");
	        txtElijaLaCalculadora.setBounds(10, 11, 531, 64);
	        getContentPane().add(txtElijaLaCalculadora);
	        txtElijaLaCalculadora.setColumns(10);
	
	        JButton btnNewButton_2_2 = new JButton("2x2");
	        btnNewButton_2_2.setFont(new Font("Minecrafter", Font.PLAIN, 35));
	        btnNewButton_2_2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Ecuaciones2x2();
	        	}
	        });
	        btnNewButton_2_2.setBounds(76, 86, 170, 64);
	        getContentPane().add(btnNewButton_2_2);
	        
	        JButton btnNewButton_2_2_1 = new JButton("3x3");
	        btnNewButton_2_2_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		Ecuaciones3x3();
	        	}
	        });
	        btnNewButton_2_2_1.setFont(new Font("Minecrafter", Font.PLAIN, 35));
	        btnNewButton_2_2_1.setBounds(329, 86, 170, 64);
	        getContentPane().add(btnNewButton_2_2_1);
	        
	    }
	    
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	        	Ecuaciones mainFrame = new Ecuaciones();
	            mainFrame.setVisible(true);
	        });
	    }
		   
	    //"LLAMADAS" A LAS CALCULADORAS
		    private void Ecuaciones2x2() {
		    	Ecuaciones2x2 calculadoraEcuaciones2x2 = new Ecuaciones2x2();
		    	calculadoraEcuaciones2x2.setVisible(true);
		    }
		    private void Ecuaciones3x3() {
		    	Ecuaciones3x3 calculadoraEcuaciones3x3 = new Ecuaciones3x3();
		    	calculadoraEcuaciones3x3.setVisible(true);
		    }
		//---------------------------------------------
		   
		
		public ButtonGroup getButtonGroup() {
			return getButtonGroup();
		}
    }