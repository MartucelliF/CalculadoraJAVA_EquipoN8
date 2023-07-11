import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.*;

public class Vectores extends JFrame {

	
	private static final long serialVersionUID = 1L;

	static void vprod(float vec1[], float vec2[], float prod[]) 
	{
        prod[0]=vec1[1]*vec2[2]-vec1[2]*vec2[1];
        prod[1]=vec1[2]*vec2[0]-vec1[0]*vec2[2];
        prod[2]=vec1[0]*vec2[1]-vec1[1]*vec2[0];
	}
	
    private JPanel contentPane;
    private JTextPane txtpnlas;
    private JButton btnEscalarVector;

    //Definiciones de variables---------------------------------
    
    int CVi=0;
    private int escalar=0;
    private int tamanio=0;
    
    float CVacum=0;
    float[] CVsuma = new float[10];
    float[] CVresta = new float[10];
    float[] vector1 = new float[10];
    float[] vector2 = new float[10];
    float[] prodvec = new float[10];
    float[] prodesc = new float[10];
    float[] multesc = new float[10];
    
    String operacion="sas";
    String seleccionar;
    String CVchoice;
   
    private JTextField posicionA0;
    private JTextField posicionB0;
    private JTextField posicionA1;
    private JTextField posicionA2;
    private JTextField posicionA3;
    private JTextField posicionA4;
    private JTextField posicionA5;
    private JTextField posicionA6;
    private JTextField posicionA7;
    private JTextField posicionA8;
    private JTextField posicionA9;
    private JTextField posicionB1;
    private JTextField posicionB2;
    private JTextField posicionB3;
    private JTextField posicionB4;
    private JTextField posicionB5;
    private JTextField posicionB6;
    private JTextField posicionB7;
    private JTextField posicionB8;
    private JTextField posicionB9;
    private JTextField resultado0;
    private JTextField resultado1;
    private JTextField resultado2;
    private JTextField resultado3;
    private JTextField resultado4;
    private JTextField resultado5;
    private JTextField resultado6;
    private JTextField resultado7;
    private JTextField resultado8;
    private JTextField resultado9;
    
    //---------------------------------------------------
    
    
    
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {

                	Vectores frame = new Vectores();

                    frame.setVisible(true);

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        });

    }


    public Vectores() {
    	setResizable(false);

    	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    	setIconImage(Toolkit.getDefaultToolkit().getImage("iconoepico.png"));
    	this.setResizable(false);
        setBounds(390, 109, 564, 433);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(82, 82, 82));

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        contentPane.setLayout(null);

        DecimalFormat df = new DecimalFormat("#.###"); // Se define que no se muestren los ceros de mas en numeros reales


                
        JButton btnLongitud = new JButton("Ingresar la longitud de los vectores (Limite diez)");
        btnLongitud.setBounds(80, 11, 380, 23);
        btnLongitud.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String vectortamanio = JOptionPane.showInputDialog("Ingrese la longitud de los vectores (hasta 10):"); //JOptionPane es un preset de pregunta, por asi decirlo
                if (vectortamanio != null && !vectortamanio.isEmpty()) {
                    int nuevotamanio = Integer.parseInt(vectortamanio);
                    if (nuevotamanio >= 0 && nuevotamanio <= 10 && nuevotamanio != tamanio) {
                        tamanio = nuevotamanio;
                    }
                    if(tamanio==0)
	                	{
	                	posicionA0.setVisible(false);
	                	posicionA1.setVisible(false);
	                	posicionA2.setVisible(false);
	                	posicionA3.setVisible(false);
	                	posicionA4.setVisible(false);
	                	posicionA5.setVisible(false);
	                	posicionA6.setVisible(false);
	                	posicionA7.setVisible(false);
	                	posicionA8.setVisible(false);
	                	posicionA9.setVisible(false);
	                	
	                	posicionB0.setVisible(false);
	                	posicionB1.setVisible(false);
	                	posicionB2.setVisible(false);
	                	posicionB3.setVisible(false);
	                	posicionB4.setVisible(false);
	                	posicionB5.setVisible(false);
	                	posicionB6.setVisible(false);
	                	posicionB7.setVisible(false);
	                	posicionB8.setVisible(false);
	                	posicionB9.setVisible(false);
	                	}
                    if(tamanio==1)
                    	{
                    	posicionA0.setVisible(true);
                    	posicionA1.setVisible(false);
                    	posicionA2.setVisible(false);
                    	posicionA3.setVisible(false);
                    	posicionA4.setVisible(false);
                    	posicionA5.setVisible(false);
                    	posicionA6.setVisible(false);
                    	posicionA7.setVisible(false);
                    	posicionA8.setVisible(false);
                    	posicionA9.setVisible(false);
                    	
                    	posicionB0.setVisible(true);
                    	posicionB1.setVisible(false);
                    	posicionB2.setVisible(false);
                    	posicionB3.setVisible(false);
                    	posicionB4.setVisible(false);
                    	posicionB5.setVisible(false);
                    	posicionB6.setVisible(false);
                    	posicionB7.setVisible(false);
                    	posicionB8.setVisible(false);
                    	posicionB9.setVisible(false);
                    	}
                    if(tamanio==2)
                		{
                    	posicionA0.setVisible(true);
                    	posicionA1.setVisible(true);
                    	posicionA2.setVisible(false);
                    	posicionA3.setVisible(false);
                    	posicionA4.setVisible(false);
                    	posicionA5.setVisible(false);
                    	posicionA6.setVisible(false);
                    	posicionA7.setVisible(false);
                    	posicionA8.setVisible(false);
                    	posicionA9.setVisible(false);
                    	
                    	posicionB0.setVisible(true);	
                    	posicionB1.setVisible(true);
                    	posicionB2.setVisible(false);
                    	posicionB3.setVisible(false);
                    	posicionB4.setVisible(false);
                    	posicionB5.setVisible(false);
                    	posicionB6.setVisible(false);
                    	posicionB7.setVisible(false);
                    	posicionB8.setVisible(false);
                    	posicionB9.setVisible(false);
                		}
                    if(tamanio==3)
            			{
                    	posicionA0.setVisible(true);
                    	posicionA1.setVisible(true);
                    	posicionA2.setVisible(true);
                    	posicionA3.setVisible(false);
                    	posicionA4.setVisible(false);
                    	posicionA5.setVisible(false);
                    	posicionA6.setVisible(false);
                    	posicionA7.setVisible(false);
                    	posicionA8.setVisible(false);
                    	posicionA9.setVisible(false);
                    	
                    	posicionB0.setVisible(true);	
                    	posicionB1.setVisible(true);
                    	posicionB2.setVisible(true);
                    	posicionB3.setVisible(false);
                    	posicionB4.setVisible(false);
                    	posicionB5.setVisible(false);
                    	posicionB6.setVisible(false);
                    	posicionB7.setVisible(false);
                    	posicionB8.setVisible(false);
                    	posicionB9.setVisible(false);
            			}
                    if(tamanio==4)
	        			{
	                	posicionA0.setVisible(true);	
	                	posicionA1.setVisible(true);
	                	posicionA2.setVisible(true);
	                	posicionA3.setVisible(true);
	                	posicionA4.setVisible(false);
	                	posicionA5.setVisible(false);
                    	posicionA6.setVisible(false);
                    	posicionA7.setVisible(false);
                    	posicionA8.setVisible(false);
                    	posicionA9.setVisible(false);
                    	
                    	posicionB0.setVisible(true);	
                    	posicionB1.setVisible(true);
                    	posicionB2.setVisible(true);
                    	posicionB3.setVisible(true);
                    	posicionB4.setVisible(false);
                    	posicionB5.setVisible(false);
                    	posicionB6.setVisible(false);
                    	posicionB7.setVisible(false);
                    	posicionB8.setVisible(false);
                    	posicionB9.setVisible(false);
	        			}
                    if(tamanio==5)
	        			{
	                	posicionA0.setVisible(true);	
	                	posicionA1.setVisible(true);
	                	posicionA2.setVisible(true);
	                	posicionA3.setVisible(true);
	                	posicionA4.setVisible(true);
	                	posicionA5.setVisible(false);
	                	posicionA6.setVisible(false);
	                	posicionA7.setVisible(false);
	                	posicionA8.setVisible(false);
	                	posicionA9.setVisible(false);
	                	
	                	posicionB0.setVisible(true);	
	                	posicionB1.setVisible(true);
	                	posicionB2.setVisible(true);
	                	posicionB3.setVisible(true);
	                	posicionB4.setVisible(true);
	                	posicionB5.setVisible(false);
	                	posicionB6.setVisible(false);
	                	posicionB7.setVisible(false);
	                	posicionB8.setVisible(false);
	                	posicionB9.setVisible(false);
	        			}
                    if(tamanio==6)
	        			{
	                	posicionA0.setVisible(true);	
	                	posicionA1.setVisible(true);
	                	posicionA2.setVisible(true);
	                	posicionA3.setVisible(true);
	                	posicionA4.setVisible(true);
	                	posicionA5.setVisible(true);
	                	posicionA6.setVisible(false);
	                	posicionA7.setVisible(false);
	                	posicionA8.setVisible(false);
	                	posicionA9.setVisible(false);
	                	
	                	posicionB0.setVisible(true);	
	                	posicionB1.setVisible(true);
	                	posicionB2.setVisible(true);
	                	posicionB3.setVisible(true);
	                	posicionB4.setVisible(true);
	                	posicionB5.setVisible(true);
	                	posicionB6.setVisible(false);
	                	posicionB7.setVisible(false);
	                	posicionB8.setVisible(false);
	                	posicionB9.setVisible(false);
	        			}
                    if(tamanio==7)
	        			{
	                	posicionA0.setVisible(true);	
	                	posicionA1.setVisible(true);
	                	posicionA2.setVisible(true);
	                	posicionA3.setVisible(true);
	                	posicionA4.setVisible(true);
	                	posicionA5.setVisible(true);
	                	posicionA6.setVisible(true);
	                	posicionA7.setVisible(false);
	                	posicionA8.setVisible(false);
	                	posicionA9.setVisible(false);
	                	
	                	posicionB0.setVisible(true);	
	                	posicionB1.setVisible(true);
	                	posicionB2.setVisible(true);
	                	posicionB3.setVisible(true);
	                	posicionB4.setVisible(true);
	                	posicionB5.setVisible(true);
	                	posicionB6.setVisible(true);
	                	posicionB7.setVisible(false);
	                	posicionB8.setVisible(false);
	                	posicionB9.setVisible(false);
	        			}
                    if(tamanio==8)
	        			{
	                	posicionA0.setVisible(true);	
	                	posicionA1.setVisible(true);
	                	posicionA2.setVisible(true);
	                	posicionA3.setVisible(true);
	                	posicionA4.setVisible(true);
	                	posicionA5.setVisible(true);
	                	posicionA6.setVisible(true);
	                	posicionA7.setVisible(true);
	                	posicionA8.setVisible(false);
	                	posicionA9.setVisible(false);
	                	
	                	posicionB0.setVisible(true);	
	                	posicionB1.setVisible(true);
	                	posicionB2.setVisible(true);
	                	posicionB3.setVisible(true);
	                	posicionB4.setVisible(true);
	                	posicionB5.setVisible(true);
	                	posicionB6.setVisible(true);
	                	posicionB7.setVisible(true);
	                	posicionB8.setVisible(false);
	                	posicionB9.setVisible(false);
	        			}
                    if(tamanio==9)
  	        			{
  	                	posicionA0.setVisible(true);	
  	                	posicionA1.setVisible(true);
  	                	posicionA2.setVisible(true);
  	                	posicionA3.setVisible(true);
  	                	posicionA4.setVisible(true);
  	                	posicionA5.setVisible(true);
  	                	posicionA6.setVisible(true);
  	                	posicionA7.setVisible(true);
  	                	posicionA8.setVisible(true);
  	                	posicionA9.setVisible(false);
  	                	
	                	posicionB0.setVisible(true);	
	                	posicionB1.setVisible(true);
	                	posicionB2.setVisible(true);
	                	posicionB3.setVisible(true);
	                	posicionB4.setVisible(true);
	                	posicionB5.setVisible(true);
	                	posicionB6.setVisible(true);
	                	posicionB7.setVisible(true);
	                	posicionB8.setVisible(true);
	                	posicionB9.setVisible(false);
  	        			}
                    if(tamanio==10)
	        			{
	                	posicionA0.setVisible(true);	
	                	posicionA1.setVisible(true);
	                	posicionA2.setVisible(true);
	                	posicionA3.setVisible(true);
	                	posicionA4.setVisible(true);
	                	posicionA5.setVisible(true);
	                	posicionA6.setVisible(true);
	                	posicionA7.setVisible(true);
	                	posicionA8.setVisible(true);
	                	posicionA9.setVisible(true);
	                	
	                  	posicionB0.setVisible(true);	
	                	posicionB1.setVisible(true);
	                	posicionB2.setVisible(true);
	                	posicionB3.setVisible(true);
	                	posicionB4.setVisible(true);
	                	posicionB5.setVisible(true);
	                	posicionB6.setVisible(true);
	                	posicionB7.setVisible(true);
	                	posicionB8.setVisible(true);
	                	posicionB9.setVisible(true);
	        			}
                }
            
                
            
            }
        });
        contentPane.add(btnLongitud);

        

        JButton btnCA = new JButton("C");
        btnCA.setFont(new Font("Tahoma", Font.PLAIN, 8));
        btnCA.setBackground(new Color(255, 128, 64));
        btnCA.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	
            	posicionA0.setText("");
            	posicionA1.setText("");
            	posicionA2.setText("");
            	posicionA3.setText("");
            	posicionA4.setText("");
            	posicionA5.setText("");
            	posicionA6.setText("");
            	posicionA7.setText("");
            	posicionA8.setText("");
            	posicionA9.setText("");
            	
            }

        });
        btnCA.setBounds(10, 76, 40, 40);

        contentPane.add(btnCA);
        
        
        
        JButton btnCB = new JButton("C");
        btnCB.setFont(new Font("Tahoma", Font.PLAIN, 8));
        btnCB.setBackground(new Color(255, 128, 64));
        btnCB.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            
            posicionB0.setText("");
            posicionB1.setText("");
            posicionB2.setText("");
            posicionB3.setText("");
            posicionB4.setText("");
            posicionB5.setText("");
            posicionB6.setText("");
            posicionB7.setText("");
            posicionB8.setText("");
            posicionB9.setText("");	
            	
            }	
    	});
        btnCB.setBounds(10, 165, 40, 40);
        
        contentPane.add(btnCB);
                                                
        JTextPane txtpnResultado = new JTextPane();
        txtpnResultado.setVisible(false);
        txtpnResultado.setEditable(false);
        txtpnResultado.setFont(new Font("Tahoma", Font.BOLD, 15));
        txtpnResultado.setForeground(new Color(255, 255, 255));
        txtpnResultado.setText("Resultado");
        txtpnResultado.setBackground(new Color(82, 82, 82));
        txtpnResultado.setBounds(10, 302, 85, 20);
        contentPane.add(txtpnResultado);

        
        
        JButton btnMas = new JButton("+");
        btnMas.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnMas.setBounds(10, 251, 48, 34);
        contentPane.add(btnMas);
        btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tamanio!=0)
					{
					txtpnResultado.setVisible(true);
					}
				
				if(tamanio==0)
					{
					txtpnResultado.setVisible(false);
					resultado0.setVisible(false);
					resultado1.setVisible(false);
					resultado2.setVisible(false);
					resultado3.setVisible(false);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					}
					if(tamanio==1)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(false);
					resultado2.setVisible(false);
					resultado3.setVisible(false);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
					
					}
					if(tamanio==2)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(false);
					resultado3.setVisible(false);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
					
					}
					if(tamanio==3)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(false);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
					
					}
					if(tamanio==4)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
					
					}
					if(tamanio==5)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
					
					}
					if(tamanio==6)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
					
					}
					if(tamanio==7)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(true);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
	            	vector1[6]=Float.parseFloat(posicionA6.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
	            	vector2[6]=Float.parseFloat(posicionB6.getText());
					
					}
					if(tamanio==8)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(true);
					resultado7.setVisible(true);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
	            	vector1[6]=Float.parseFloat(posicionA6.getText());
	            	vector1[7]=Float.parseFloat(posicionA7.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
	            	vector2[6]=Float.parseFloat(posicionB6.getText());
	            	vector2[7]=Float.parseFloat(posicionB7.getText());

					
					}
					if(tamanio==9)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(true);
					resultado7.setVisible(true);
					resultado8.setVisible(true);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
	            	vector1[6]=Float.parseFloat(posicionA6.getText());
	            	vector1[7]=Float.parseFloat(posicionA7.getText());
	            	vector1[8]=Float.parseFloat(posicionA8.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
	            	vector2[6]=Float.parseFloat(posicionB6.getText());
	            	vector2[7]=Float.parseFloat(posicionB7.getText());
	            	vector2[8]=Float.parseFloat(posicionB8.getText());
					
					}
					if(tamanio==10)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(true);
					resultado7.setVisible(true);
					resultado8.setVisible(true);
					resultado9.setVisible(true);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
	            	vector1[6]=Float.parseFloat(posicionA6.getText());
	            	vector1[7]=Float.parseFloat(posicionA7.getText());
	            	vector1[8]=Float.parseFloat(posicionA8.getText());
	            	vector1[9]=Float.parseFloat(posicionA9.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
	            	vector2[6]=Float.parseFloat(posicionB6.getText());
	            	vector2[7]=Float.parseFloat(posicionB7.getText());
	            	vector2[8]=Float.parseFloat(posicionB8.getText());
	            	vector2[9]=Float.parseFloat(posicionB9.getText());
					
					}

            		for(CVi=0;CVi<tamanio;CVi++)
					{
					CVsuma[CVi]=vector1[CVi]+vector2[CVi];	
					}
            	seleccionar = df.format(CVsuma[0]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado0.setText(seleccionar);
               	seleccionar = df.format(CVsuma[1]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado1.setText(seleccionar); 
               	seleccionar = df.format(CVsuma[2]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado2.setText(seleccionar); 
            	seleccionar = df.format(CVsuma[3]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado3.setText(seleccionar);
            	seleccionar = df.format(CVsuma[4]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado4.setText(seleccionar);
            	seleccionar = df.format(CVsuma[5]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado5.setText(seleccionar);
            	seleccionar = df.format(CVsuma[6]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado6.setText(seleccionar);
            	seleccionar = df.format(CVsuma[7]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado7.setText(seleccionar);
            	seleccionar = df.format(CVsuma[8]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado8.setText(seleccionar);
            	seleccionar = df.format(CVsuma[9]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado9.setText(seleccionar);
            	
			}

		});
        
        JButton btnMenos = new JButton("-");
        btnMenos.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnMenos.setBounds(68, 251, 48, 34);
        contentPane.add(btnMenos);
        btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tamanio!=0)
					{
					txtpnResultado.setVisible(true);
					}
				
				if(tamanio==0)
					{
					txtpnResultado.setVisible(false);
					resultado0.setVisible(false);
					resultado1.setVisible(false);
					resultado2.setVisible(false);
					resultado3.setVisible(false);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					}
					if(tamanio==1)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(false);
					resultado2.setVisible(false);
					resultado3.setVisible(false);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
					
					}
					if(tamanio==2)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(false);
					resultado3.setVisible(false);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
					
					}
					if(tamanio==3)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(false);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
					
					}
					if(tamanio==4)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
					
					}
					if(tamanio==5)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
					
					}
					if(tamanio==6)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
					
					}
					if(tamanio==7)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(true);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
	            	vector1[6]=Float.parseFloat(posicionA6.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
	            	vector2[6]=Float.parseFloat(posicionB6.getText());
					
					}
					if(tamanio==8)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(true);
					resultado7.setVisible(true);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
	            	vector1[6]=Float.parseFloat(posicionA6.getText());
	            	vector1[7]=Float.parseFloat(posicionA7.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
	            	vector2[6]=Float.parseFloat(posicionB6.getText());
	            	vector2[7]=Float.parseFloat(posicionB7.getText());

					
					}
					if(tamanio==9)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(true);
					resultado7.setVisible(true);
					resultado8.setVisible(true);
					resultado9.setVisible(false);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
	            	vector1[6]=Float.parseFloat(posicionA6.getText());
	            	vector1[7]=Float.parseFloat(posicionA7.getText());
	            	vector1[8]=Float.parseFloat(posicionA8.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
	            	vector2[6]=Float.parseFloat(posicionB6.getText());
	            	vector2[7]=Float.parseFloat(posicionB7.getText());
	            	vector2[8]=Float.parseFloat(posicionB8.getText());
					
					}
					if(tamanio==10)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(true);
					resultado7.setVisible(true);
					resultado8.setVisible(true);
					resultado9.setVisible(true);
					
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
	            	vector1[6]=Float.parseFloat(posicionA6.getText());
	            	vector1[7]=Float.parseFloat(posicionA7.getText());
	            	vector1[8]=Float.parseFloat(posicionA8.getText());
	            	vector1[9]=Float.parseFloat(posicionA9.getText());
	            	
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
	            	vector2[6]=Float.parseFloat(posicionB6.getText());
	            	vector2[7]=Float.parseFloat(posicionB7.getText());
	            	vector2[8]=Float.parseFloat(posicionB8.getText());
	            	vector2[9]=Float.parseFloat(posicionB9.getText());
					
					}

					for(CVi=0;CVi<tamanio;CVi++)
					{
					CVresta[CVi]=vector1[CVi]-vector2[CVi];	
					}
					
            	seleccionar = df.format(CVresta[0]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado0.setText(seleccionar);
               	seleccionar = df.format(CVresta[1]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado1.setText(seleccionar); 
               	seleccionar = df.format(CVresta[2]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado2.setText(seleccionar); 
            	seleccionar = df.format(CVresta[3]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado3.setText(seleccionar);
            	seleccionar = df.format(CVresta[4]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado4.setText(seleccionar);
            	seleccionar = df.format(CVresta[5]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado5.setText(seleccionar);
            	seleccionar = df.format(CVresta[6]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado6.setText(seleccionar);
            	seleccionar = df.format(CVresta[7]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado7.setText(seleccionar);
            	seleccionar = df.format(CVresta[8]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado8.setText(seleccionar);
            	seleccionar = df.format(CVresta[9]);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado9.setText(seleccionar);
            	
			}

		});
        
        
        
        JButton btnProductoEscalar = new JButton("Producto Escalar");
        btnProductoEscalar.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnProductoEscalar.setBounds(266, 251, 130, 34);
        contentPane.add(btnProductoEscalar);
        btnProductoEscalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if(tamanio==0)
				{
				txtpnResultado.setVisible(false);
				resultado0.setVisible(false);
				resultado1.setVisible(false);
				resultado2.setVisible(false);
				resultado3.setVisible(false);
				resultado4.setVisible(false);
				resultado5.setVisible(false);
				resultado6.setVisible(false);
				resultado7.setVisible(false);
				resultado8.setVisible(false);
				resultado9.setVisible(false);
				}
			
				if(tamanio!=0)
				{
				txtpnResultado.setVisible(true);
				resultado0.setVisible(true);
				resultado1.setVisible(false);
				resultado2.setVisible(false);
				resultado3.setVisible(false);
				resultado4.setVisible(false);
				resultado5.setVisible(false);
				resultado6.setVisible(false);
				resultado7.setVisible(false);
				resultado8.setVisible(false);
				resultado9.setVisible(false);
				}
				if(tamanio==1)
				{
				vector1[0]=Float.parseFloat(posicionA0.getText());
            	
            	vector2[0]=Float.parseFloat(posicionB0.getText());
				
				}
				if(tamanio==2)
				{
				vector1[0]=Float.parseFloat(posicionA0.getText());
            	vector1[1]=Float.parseFloat(posicionA1.getText());
            	
            	vector2[0]=Float.parseFloat(posicionB0.getText());
            	vector2[1]=Float.parseFloat(posicionB1.getText());
				
				}
				if(tamanio==3)
				{
				vector1[0]=Float.parseFloat(posicionA0.getText());
            	vector1[1]=Float.parseFloat(posicionA1.getText());
            	vector1[2]=Float.parseFloat(posicionA2.getText());
            	
            	vector2[0]=Float.parseFloat(posicionB0.getText());
            	vector2[1]=Float.parseFloat(posicionB1.getText());
               	vector2[2]=Float.parseFloat(posicionB2.getText());
				
				}
				if(tamanio==4)
				{
				vector1[0]=Float.parseFloat(posicionA0.getText());
            	vector1[1]=Float.parseFloat(posicionA1.getText());
            	vector1[2]=Float.parseFloat(posicionA2.getText());
            	vector1[3]=Float.parseFloat(posicionA3.getText());
            	
            	vector2[0]=Float.parseFloat(posicionB0.getText());
            	vector2[1]=Float.parseFloat(posicionB1.getText());
               	vector2[2]=Float.parseFloat(posicionB2.getText());
               	vector2[3]=Float.parseFloat(posicionB3.getText());
				
				}
				if(tamanio==5)
				{
				vector1[0]=Float.parseFloat(posicionA0.getText());
            	vector1[1]=Float.parseFloat(posicionA1.getText());
            	vector1[2]=Float.parseFloat(posicionA2.getText());
            	vector1[3]=Float.parseFloat(posicionA3.getText());
            	vector1[4]=Float.parseFloat(posicionA4.getText());
            	
            	vector2[0]=Float.parseFloat(posicionB0.getText());
            	vector2[1]=Float.parseFloat(posicionB1.getText());
               	vector2[2]=Float.parseFloat(posicionB2.getText());
               	vector2[3]=Float.parseFloat(posicionB3.getText());
            	vector2[4]=Float.parseFloat(posicionB4.getText());
				
				}
				if(tamanio==6)
				{
				vector1[0]=Float.parseFloat(posicionA0.getText());
            	vector1[1]=Float.parseFloat(posicionA1.getText());
            	vector1[2]=Float.parseFloat(posicionA2.getText());
            	vector1[3]=Float.parseFloat(posicionA3.getText());
            	vector1[4]=Float.parseFloat(posicionA4.getText());
            	vector1[5]=Float.parseFloat(posicionA5.getText());
            	
            	vector2[0]=Float.parseFloat(posicionB0.getText());
            	vector2[1]=Float.parseFloat(posicionB1.getText());
               	vector2[2]=Float.parseFloat(posicionB2.getText());
               	vector2[3]=Float.parseFloat(posicionB3.getText());
            	vector2[4]=Float.parseFloat(posicionB4.getText());
            	vector2[5]=Float.parseFloat(posicionB5.getText());
				
				}
				if(tamanio==7)
				{
				vector1[0]=Float.parseFloat(posicionA0.getText());
            	vector1[1]=Float.parseFloat(posicionA1.getText());
            	vector1[2]=Float.parseFloat(posicionA2.getText());
            	vector1[3]=Float.parseFloat(posicionA3.getText());
            	vector1[4]=Float.parseFloat(posicionA4.getText());
            	vector1[5]=Float.parseFloat(posicionA5.getText());
            	vector1[6]=Float.parseFloat(posicionA6.getText());
            	
            	vector2[0]=Float.parseFloat(posicionB0.getText());
            	vector2[1]=Float.parseFloat(posicionB1.getText());
               	vector2[2]=Float.parseFloat(posicionB2.getText());
               	vector2[3]=Float.parseFloat(posicionB3.getText());
            	vector2[4]=Float.parseFloat(posicionB4.getText());
            	vector2[5]=Float.parseFloat(posicionB5.getText());
            	vector2[6]=Float.parseFloat(posicionB6.getText());
				
				}
				if(tamanio==8)
				{
				vector1[0]=Float.parseFloat(posicionA0.getText());
            	vector1[1]=Float.parseFloat(posicionA1.getText());
            	vector1[2]=Float.parseFloat(posicionA2.getText());
            	vector1[3]=Float.parseFloat(posicionA3.getText());
            	vector1[4]=Float.parseFloat(posicionA4.getText());
            	vector1[5]=Float.parseFloat(posicionA5.getText());
            	vector1[6]=Float.parseFloat(posicionA6.getText());
            	vector1[7]=Float.parseFloat(posicionA7.getText());
            	
            	vector2[0]=Float.parseFloat(posicionB0.getText());
            	vector2[1]=Float.parseFloat(posicionB1.getText());
               	vector2[2]=Float.parseFloat(posicionB2.getText());
               	vector2[3]=Float.parseFloat(posicionB3.getText());
            	vector2[4]=Float.parseFloat(posicionB4.getText());
            	vector2[5]=Float.parseFloat(posicionB5.getText());
            	vector2[6]=Float.parseFloat(posicionB6.getText());
            	vector2[7]=Float.parseFloat(posicionB7.getText());

				
				}
				if(tamanio==9)
				{
				vector1[0]=Float.parseFloat(posicionA0.getText());
            	vector1[1]=Float.parseFloat(posicionA1.getText());
            	vector1[2]=Float.parseFloat(posicionA2.getText());
            	vector1[3]=Float.parseFloat(posicionA3.getText());
            	vector1[4]=Float.parseFloat(posicionA4.getText());
            	vector1[5]=Float.parseFloat(posicionA5.getText());
            	vector1[6]=Float.parseFloat(posicionA6.getText());
            	vector1[7]=Float.parseFloat(posicionA7.getText());
            	vector1[8]=Float.parseFloat(posicionA8.getText());
            	
            	vector2[0]=Float.parseFloat(posicionB0.getText());
            	vector2[1]=Float.parseFloat(posicionB1.getText());
               	vector2[2]=Float.parseFloat(posicionB2.getText());
               	vector2[3]=Float.parseFloat(posicionB3.getText());
            	vector2[4]=Float.parseFloat(posicionB4.getText());
            	vector2[5]=Float.parseFloat(posicionB5.getText());
            	vector2[6]=Float.parseFloat(posicionB6.getText());
            	vector2[7]=Float.parseFloat(posicionB7.getText());
            	vector2[8]=Float.parseFloat(posicionB8.getText());
				
				}
				if(tamanio==10)
				{
				vector1[0]=Float.parseFloat(posicionA0.getText());
            	vector1[1]=Float.parseFloat(posicionA1.getText());
            	vector1[2]=Float.parseFloat(posicionA2.getText());
            	vector1[3]=Float.parseFloat(posicionA3.getText());
            	vector1[4]=Float.parseFloat(posicionA4.getText());
            	vector1[5]=Float.parseFloat(posicionA5.getText());
            	vector1[6]=Float.parseFloat(posicionA6.getText());
            	vector1[7]=Float.parseFloat(posicionA7.getText());
            	vector1[8]=Float.parseFloat(posicionA8.getText());
            	vector1[9]=Float.parseFloat(posicionA9.getText());
            	
            	vector2[0]=Float.parseFloat(posicionB0.getText());
            	vector2[1]=Float.parseFloat(posicionB1.getText());
               	vector2[2]=Float.parseFloat(posicionB2.getText());
               	vector2[3]=Float.parseFloat(posicionB3.getText());
            	vector2[4]=Float.parseFloat(posicionB4.getText());
            	vector2[5]=Float.parseFloat(posicionB5.getText());
            	vector2[6]=Float.parseFloat(posicionB6.getText());
            	vector2[7]=Float.parseFloat(posicionB7.getText());
            	vector2[8]=Float.parseFloat(posicionB8.getText());
            	vector2[9]=Float.parseFloat(posicionB9.getText());
				
				}
				
				CVacum=0;
				for(CVi=0;CVi<tamanio;CVi++)
				{	
				prodesc[CVi]=vector1[CVi]*vector2[CVi];
                CVacum=CVacum+prodesc[CVi];
				}
				
            	seleccionar = df.format(CVacum);	
            	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
            	resultado0.setText(seleccionar);
				
			   }
			});
        
        
       
        btnEscalarVector = new JButton("Escalar por vector");
        btnEscalarVector.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		 String escalarsus = JOptionPane.showInputDialog("Ingrese el escalar:"); //JOptionPane es un preset de pregunta, por asi decirlo
     	        if (escalarsus != null && !escalarsus.isEmpty()) {
     	            int nuevoescalar = Integer.parseInt(escalarsus);
     	            if (nuevoescalar != escalar) {
     	                escalar = nuevoescalar;
     	            }	
     	        }
     	        String opcion = JOptionPane.showInputDialog("�Qu� vector desea usar? (Ingrese 'a' o 'b' en minuscula)");
     	        
     	        if (opcion != null) {
     	            opcion = opcion.toLowerCase();
     	            if (opcion.equals("a")) 
     	            	{
     	                CVchoice="a";
     	            	} 
     	            else if (opcion.equals("b")) 
     	            	{	
     	            	CVchoice="b";
     	            	}
     	        }
     	        if(tamanio!=0)
					{
					txtpnResultado.setVisible(true);
					}
				
				if(tamanio==0)
					{
					txtpnResultado.setVisible(false);
					resultado0.setVisible(false);
					resultado1.setVisible(false);
					resultado2.setVisible(false);
					resultado3.setVisible(false);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					}
				
					if(tamanio==1)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(false);
					resultado2.setVisible(false);
					resultado3.setVisible(false);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					if(CVchoice=="a")
						{
					vector1[0]=Float.parseFloat(posicionA0.getText());
						}
					else if(CVchoice=="b")
						{
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
						}
					}
					
					if(tamanio==2)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(false);
					resultado3.setVisible(false);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					if(CVchoice=="a")	
						{
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
						}
					
					if(CVchoice=="b")
						{
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
						}
					}
					
					if(tamanio==3)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(false);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					if(CVchoice=="a")
						{
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
						}
					
					if(CVchoice=="b")
						{
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
						}
					}
					
					if(tamanio==4)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(false);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					if(CVchoice=="a")
						{
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
						}
					
					if(CVchoice=="b")
						{
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
						}
					}
					
					if(tamanio==5)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(false);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					if(CVchoice=="a")
						{
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
						}
					
					if(CVchoice=="b")
						{
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
						}
					}
					
					if(tamanio==6)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(false);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					if(CVchoice=="a")
						{
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
						}
					
					if(CVchoice=="b")
						{
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
						}
					}
					
					if(tamanio==7)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(true);
					resultado7.setVisible(false);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					if(CVchoice=="a")
						{
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
	            	vector1[6]=Float.parseFloat(posicionA6.getText());
						}
					
					if(CVchoice=="b")
						{
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
	            	vector2[6]=Float.parseFloat(posicionB6.getText());
						}
					}
					
					if(tamanio==8)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(true);
					resultado7.setVisible(true);
					resultado8.setVisible(false);
					resultado9.setVisible(false);
					
					if(CVchoice=="a")
						{
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
	            	vector1[6]=Float.parseFloat(posicionA6.getText());
	            	vector1[7]=Float.parseFloat(posicionA7.getText());
						}
					
					if(CVchoice=="b")
						{
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
	            	vector2[6]=Float.parseFloat(posicionB6.getText());
	            	vector2[7]=Float.parseFloat(posicionB7.getText());
						}
					
					}
					
					if(tamanio==9)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(true);
					resultado7.setVisible(true);
					resultado8.setVisible(true);
					resultado9.setVisible(false);
					
					if(CVchoice=="a")
						{
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
	            	vector1[6]=Float.parseFloat(posicionA6.getText());
	            	vector1[7]=Float.parseFloat(posicionA7.getText());
	            	vector1[8]=Float.parseFloat(posicionA8.getText());
						}
					
					if(CVchoice=="b")
						{
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
	            	vector2[6]=Float.parseFloat(posicionB6.getText());
	            	vector2[7]=Float.parseFloat(posicionB7.getText());
	            	vector2[8]=Float.parseFloat(posicionB8.getText());
						}
					}
					
					if(tamanio==10)
					{
					resultado0.setVisible(true);
					resultado1.setVisible(true);
					resultado2.setVisible(true);
					resultado3.setVisible(true);
					resultado4.setVisible(true);
					resultado5.setVisible(true);
					resultado6.setVisible(true);
					resultado7.setVisible(true);
					resultado8.setVisible(true);
					resultado9.setVisible(true);
					
					if(CVchoice=="a")
						{
					vector1[0]=Float.parseFloat(posicionA0.getText());
	            	vector1[1]=Float.parseFloat(posicionA1.getText());
	            	vector1[2]=Float.parseFloat(posicionA2.getText());
	            	vector1[3]=Float.parseFloat(posicionA3.getText());
	            	vector1[4]=Float.parseFloat(posicionA4.getText());
	            	vector1[5]=Float.parseFloat(posicionA5.getText());
	            	vector1[6]=Float.parseFloat(posicionA6.getText());
	            	vector1[7]=Float.parseFloat(posicionA7.getText());
	            	vector1[8]=Float.parseFloat(posicionA8.getText());
	            	vector1[9]=Float.parseFloat(posicionA9.getText());
						}
					
					if(CVchoice=="b")
						{
	            	vector2[0]=Float.parseFloat(posicionB0.getText());
	            	vector2[1]=Float.parseFloat(posicionB1.getText());
	               	vector2[2]=Float.parseFloat(posicionB2.getText());
	               	vector2[3]=Float.parseFloat(posicionB3.getText());
	            	vector2[4]=Float.parseFloat(posicionB4.getText());
	            	vector2[5]=Float.parseFloat(posicionB5.getText());
	            	vector2[6]=Float.parseFloat(posicionB6.getText());
	            	vector2[7]=Float.parseFloat(posicionB7.getText());
	            	vector2[8]=Float.parseFloat(posicionB8.getText());
	            	vector2[9]=Float.parseFloat(posicionB9.getText());
						}
					}
					
					if(CVchoice=="a")
				{		
					for(CVi=0;CVi<tamanio;CVi++)	
					{
					multesc[CVi]=escalar*vector1[CVi];
					}
				}
				
					if(CVchoice=="b")
				{		
					for(CVi=0;CVi<tamanio;CVi++)	
					{
					multesc[CVi]=escalar*vector2[CVi];
					}
				}	
					
         	seleccionar = df.format(multesc[0]);	
         	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
         	resultado0.setText(seleccionar);
            seleccionar = df.format(multesc[1]);	
         	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
         	resultado1.setText(seleccionar); 
            seleccionar = df.format(multesc[2]);	
         	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
         	resultado2.setText(seleccionar); 
         	seleccionar = df.format(multesc[3]);	
         	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
         	resultado3.setText(seleccionar);
         	seleccionar = df.format(multesc[4]);	
         	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
         	resultado4.setText(seleccionar);
         	seleccionar = df.format(multesc[5]);	
         	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
         	resultado5.setText(seleccionar);
         	seleccionar = df.format(multesc[6]);	
         	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
         	resultado6.setText(seleccionar);
         	seleccionar = df.format(multesc[7]);	
         	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
         	resultado7.setText(seleccionar);
         	seleccionar = df.format(multesc[8]);	
         	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
         	resultado8.setText(seleccionar);
         	seleccionar = df.format(multesc[9]);	
         	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
         	resultado9.setText(seleccionar);
         	
        	         
        	}        
        });
        btnEscalarVector.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnEscalarVector.setBounds(126, 251, 130, 34);
        contentPane.add(btnEscalarVector);
        
        
        JButton btnProductoVectorial = new JButton("Producto vectorial");
        btnProductoVectorial.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnProductoVectorial.setBounds(406, 251, 130, 34);
        contentPane.add(btnProductoVectorial);
        btnProductoVectorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(tamanio!=0)
				{
				txtpnResultado.setVisible(true);
				}
			
				if(tamanio==0||tamanio==1||tamanio==2||tamanio==4||tamanio==5||tamanio==6||tamanio==7||tamanio==8||tamanio==9||tamanio==10)
				{
				txtpnResultado.setVisible(false);
				resultado0.setVisible(false);
				resultado1.setVisible(false);
				resultado2.setVisible(false);
				resultado3.setVisible(false);
				resultado4.setVisible(false);
				resultado5.setVisible(false);
				resultado6.setVisible(false);
				resultado7.setVisible(false);
				resultado8.setVisible(false);
				resultado9.setVisible(false);				
				JOptionPane.showMessageDialog(null, "El producto vectorial solo es posible de calcular con vectores de longitud 3, estos vectores tiene una longitud de "+tamanio+". Lo lamento, en serio.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				}
				
				if(tamanio==1)
				{
				resultado0.setVisible(true);
				resultado1.setVisible(false);
				resultado2.setVisible(false);
				resultado3.setVisible(false);
				resultado4.setVisible(false);
				resultado5.setVisible(false);
				resultado6.setVisible(false);
				resultado7.setVisible(false);
				resultado8.setVisible(false);
				resultado9.setVisible(false);
				
				vector1[0]=Float.parseFloat(posicionA0.getText());
            	
            	vector2[0]=Float.parseFloat(posicionB0.getText());
				
				}
				if(tamanio==2)
				{
				resultado0.setVisible(true);
				resultado1.setVisible(true);
				resultado2.setVisible(false);
				resultado3.setVisible(false);
				resultado4.setVisible(false);
				resultado5.setVisible(false);
				resultado6.setVisible(false);
				resultado7.setVisible(false);
				resultado8.setVisible(false);
				resultado9.setVisible(false);
				
				vector1[0]=Float.parseFloat(posicionA0.getText());
            	vector1[1]=Float.parseFloat(posicionA1.getText());
            	
            	vector2[0]=Float.parseFloat(posicionB0.getText());
            	vector2[1]=Float.parseFloat(posicionB1.getText());
				
				}
				if(tamanio==3)
				{
				resultado0.setVisible(true);
				resultado1.setVisible(true);
				resultado2.setVisible(true);
				resultado3.setVisible(false);
				resultado4.setVisible(false);
				resultado5.setVisible(false);
				resultado6.setVisible(false);
				resultado7.setVisible(false);
				resultado8.setVisible(false);
				resultado9.setVisible(false);
				
				vector1[0]=Float.parseFloat(posicionA0.getText());
            	vector1[1]=Float.parseFloat(posicionA1.getText());
            	vector1[2]=Float.parseFloat(posicionA2.getText());
            	
            	vector2[0]=Float.parseFloat(posicionB0.getText());
            	vector2[1]=Float.parseFloat(posicionB1.getText());
               	vector2[2]=Float.parseFloat(posicionB2.getText());
				
				}
				
		
				vprod(vector1,vector2,prodvec);
				
        	seleccionar = df.format(prodvec[0]);	
        	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
        	resultado0.setText(seleccionar);
           	seleccionar = df.format(prodvec[1]);	
        	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
        	resultado1.setText(seleccionar); 
           	seleccionar = df.format(prodvec[2]);	
        	seleccionar = seleccionar.replace(",", "."); // reemplaza las comas (,) a puntos (.) para evitar errores matematicos
        	resultado2.setText(seleccionar); 			
				
			}

		});
        
        
        txtpnlas = new JTextPane();
        txtpnlas.setEditable(false);
        txtpnlas.setText("Las operaciones seguir\u00E1n el siguiente orden: Vector A \"operacion\" Vector B");
        txtpnlas.setForeground(Color.WHITE);
        txtpnlas.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtpnlas.setBackground(new Color(82, 82, 82));
        txtpnlas.setBounds(10, 223, 528, 34);
        contentPane.add(txtpnlas);
        
        
                
        JTextPane txtpnVectorB = new JTextPane();
        txtpnVectorB.setEditable(false);
        txtpnVectorB.setForeground(new Color(255, 255, 255));
        txtpnVectorB.setFont(new Font("Tahoma", Font.BOLD, 15));
        
                txtpnVectorB.setText("Vector B\r\n");
                
        txtpnVectorB.setBackground(new Color(82, 82, 82));
        
        txtpnVectorB.setBounds(10, 134, 85, 20);
        
        contentPane.add(txtpnVectorB);
        
        
        
        JTextPane txtpnVectorA = new JTextPane();
        txtpnVectorA.setEditable(false);
        txtpnVectorA.setForeground(new Color(255, 255, 255));
        txtpnVectorA.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        txtpnVectorA.setBackground(new Color(82, 82, 82));
        
        txtpnVectorA.setText("Vector A");
        
        txtpnVectorA.setBounds(10, 45, 85, 20);
        
        contentPane.add(txtpnVectorA);
        
        posicionA0 = new JTextField();
        posicionA0.setVisible(false);
        posicionA0.setBounds(59, 76, 40, 40);
        contentPane.add(posicionA0);
        posicionA0.setColumns(10);
        
        
        
        posicionA1 = new JTextField();
        posicionA1.setVisible(false);
        posicionA1.setBounds(107, 76, 40, 40);
        contentPane.add(posicionA1);
        posicionA1.setColumns(10);
        
        
        
        posicionA2 = new JTextField();
        posicionA2.setVisible(false);
        posicionA2.setColumns(10);
        posicionA2.setBounds(155, 76, 40, 40);
        contentPane.add(posicionA2);
        
        
        
        posicionA3 = new JTextField();
        posicionA3.setVisible(false);
        posicionA3.setColumns(10);
        posicionA3.setBounds(203, 76, 40, 40);
        contentPane.add(posicionA3);
        
        
        
        posicionA4 = new JTextField();
        posicionA4.setVisible(false);
        posicionA4.setColumns(10);
        posicionA4.setBounds(251, 76, 40, 40);
        contentPane.add(posicionA4);
        
        
        
        posicionA5 = new JTextField();
        posicionA5.setVisible(false);
        posicionA5.setColumns(10);
        posicionA5.setBounds(299, 76, 40, 40);
        contentPane.add(posicionA5);
        
        
        
        posicionA6 = new JTextField();
        posicionA6.setVisible(false);
        posicionA6.setColumns(10);
        posicionA6.setBounds(347, 76, 40, 40);
        contentPane.add(posicionA6);
        
        
        
        posicionA7 = new JTextField();
        posicionA7.setVisible(false);
        posicionA7.setColumns(10);
        posicionA7.setBounds(395, 76, 40, 40);
        contentPane.add(posicionA7);
        
        
        
        posicionA8 = new JTextField();
        posicionA8.setVisible(false);
        posicionA8.setColumns(10);
        posicionA8.setBounds(443, 76, 40, 40);
        contentPane.add(posicionA8);
        
        
        
        posicionA9 = new JTextField();
        posicionA9.setVisible(false);
        posicionA9.setColumns(10);
        posicionA9.setBounds(491, 76, 40, 40);
        contentPane.add(posicionA9);
        
        
        
        posicionB0 = new JTextField();
        posicionB0.setVisible(false);
        posicionB0.setColumns(10);
        posicionB0.setBounds(60, 165, 40, 40);
        contentPane.add(posicionB0);
        
        
        posicionB1 = new JTextField();
        posicionB1.setVisible(false);
        posicionB1.setColumns(10);
        posicionB1.setBounds(107, 165, 40, 40);
        contentPane.add(posicionB1);
        
        
        
        posicionB2 = new JTextField();
        posicionB2.setVisible(false);
        posicionB2.setColumns(10);
        posicionB2.setBounds(155, 165, 40, 40);
        contentPane.add(posicionB2);
        
        
        
        posicionB3 = new JTextField();
        posicionB3.setVisible(false);
        posicionB3.setColumns(10);
        posicionB3.setBounds(203, 165, 40, 40);
        contentPane.add(posicionB3);
        
        
        
        posicionB4 = new JTextField();
        posicionB4.setVisible(false);
        posicionB4.setColumns(10);
        posicionB4.setBounds(251, 165, 40, 40);
        contentPane.add(posicionB4);
        
        
        
        posicionB5 = new JTextField();
        posicionB5.setVisible(false);
        posicionB5.setColumns(10);
        posicionB5.setBounds(299, 165, 40, 40);
        contentPane.add(posicionB5);
        
        
        
        posicionB6 = new JTextField();
        posicionB6.setVisible(false);
        posicionB6.setColumns(10);
        posicionB6.setBounds(347, 165, 40, 40);
        contentPane.add(posicionB6);
        
        
        
        posicionB7 = new JTextField();
        posicionB7.setVisible(false);
        posicionB7.setColumns(10);
        posicionB7.setBounds(395, 165, 40, 40);
        contentPane.add(posicionB7);
        
        
        
        posicionB8 = new JTextField();
        posicionB8.setVisible(false);
        posicionB8.setColumns(10);
        posicionB8.setBounds(443, 165, 40, 40);
        contentPane.add(posicionB8);
        
        
        
        posicionB9 = new JTextField();
        posicionB9.setVisible(false);
        posicionB9.setColumns(10);
        posicionB9.setBounds(491, 165, 40, 40);
        contentPane.add(posicionB9);
        
        resultado0 = new JTextField();
        resultado0.setVisible(false);
        resultado0.setEditable(false);
        resultado0.setBounds(30, 333, 40, 40);
        contentPane.add(resultado0);
        resultado0.setColumns(10);
        
        resultado1 = new JTextField();
        resultado1.setVisible(false);
        resultado1.setEditable(false);
        resultado1.setColumns(10);
        resultado1.setBounds(80, 333, 40, 40);
        contentPane.add(resultado1);
        
        resultado2 = new JTextField();
        resultado2.setVisible(false);
        resultado2.setEditable(false);
        resultado2.setColumns(10);
        resultado2.setBounds(129, 333, 40, 40);
        contentPane.add(resultado2);
        
        resultado3 = new JTextField();
        resultado3.setVisible(false);
        resultado3.setEditable(false);
        resultado3.setColumns(10);
        resultado3.setBounds(179, 333, 40, 40);
        contentPane.add(resultado3);
        
        resultado4 = new JTextField();
        resultado4.setVisible(false);
        resultado4.setEditable(false);
        resultado4.setColumns(10);
        resultado4.setBounds(228, 333, 40, 40);
        contentPane.add(resultado4);
        
        resultado5 = new JTextField();
        resultado5.setVisible(false);
        resultado5.setEditable(false);
        resultado5.setColumns(10);
        resultado5.setBounds(278, 333, 40, 40);
        contentPane.add(resultado5);
        
        resultado6 = new JTextField();
        resultado6.setVisible(false);
        resultado6.setEditable(false);
        resultado6.setColumns(10);
        resultado6.setBounds(329, 333, 40, 40);
        contentPane.add(resultado6);
        
        resultado7 = new JTextField();
        resultado7.setVisible(false);
        resultado7.setEditable(false);
        resultado7.setColumns(10);
        resultado7.setBounds(380, 333, 40, 40);
        contentPane.add(resultado7);
        
        resultado8 = new JTextField();
        resultado8.setVisible(false);
        resultado8.setEditable(false);
        resultado8.setColumns(10);
        resultado8.setBounds(430, 333, 40, 40);
        contentPane.add(resultado8);
        
        resultado9 = new JTextField();
        resultado9.setVisible(false);
        resultado9.setEditable(false);
        resultado9.setColumns(10);
        resultado9.setBounds(480, 333, 40, 40);
        contentPane.add(resultado9);

    }
}