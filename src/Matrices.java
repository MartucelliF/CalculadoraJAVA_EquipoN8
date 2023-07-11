import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Matrices extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JTextField txt_matrizA11;
	private JTextField txt_matrizA12;
	private JTextField txt_matrizA13;
	private JTextField txt_matrizA21;
	private JTextField txt_matrizA22;
	private JTextField txt_matrizA23;
	private JTextField txt_matrizA31;
	private JTextField txt_matrizA32;
	private JTextField txt_matrizA33;
	private JTextField txt_matrizB11;
	private JTextField txt_matrizB12;
	private JTextField txt_matrizB13;
	private JTextField txt_matrizB21;
	private JTextField txt_matrizB22;
	private JTextField txt_matrizB23;
	private JTextField txt_matrizB31;
	private JTextField txt_matrizB32;
	private JTextField txt_matrizB33;
	
	private JButton btnNewButton_1_2;
	private JButton btnNewButton_1_3;
	private JButton btnNewButton_1_4;

	static void imprimirMatriz(float matriz[][], int filas, int columnas){
        int i, j;
        for(i=0;i<filas; i++){
            System.out.print("  ");
            for(j=0;j<columnas;j++){
                System.out.print("|"+matriz[i][j]+"|");
            }
            System.out.print("\n"); //por cada tres columnas, una fila. Cada que se repite: esto un salto de lÃ­nea	
        }
        System.out.print("\n");
    }
	
	static void inicializarMatriz(float[][] matriz, int filas, int columnas){
		int CMi, CMj;
		for(CMi = 0; CMi < filas; CMi++){
			for(CMj = 0; CMj < columnas; CMj++){
				matriz[CMi][CMj] = 0;
			}
		}
	}
	
	public void asignarValoresMatrizA(float[][] matrizA) {
		String validarValorA11 = txt_matrizA11.getText();
        float valorA11 = Float.parseFloat(validarValorA11);
		matrizA[0][0] = valorA11;
		
		String validarValorA12 = txt_matrizA12.getText();
		float valorA12 = Float.parseFloat(validarValorA12);
		matrizA[0][1] = valorA12;
		
		String validarValorA13 = txt_matrizA13.getText();
		float valorA13 = Float.parseFloat(validarValorA13);
		matrizA[0][2] = valorA13;
		
		String validarValorA21 = txt_matrizA21.getText();
		float valorA21 = Float.parseFloat(validarValorA21);
		matrizA[1][0] = valorA21;
		
		String validarValorA22 = txt_matrizA22.getText();
		float valorA22 = Float.parseFloat(validarValorA22);
		matrizA[1][1] = valorA22;
        
		String validarValorA23 = txt_matrizA23.getText();
		float valorA23 = Float.parseFloat(validarValorA23);
		matrizA[1][2] = valorA23;
		
		String validarValorA31 = txt_matrizA31.getText();
		float valorA31 = Float.parseFloat(validarValorA31);
		matrizA[2][0] = valorA31;
		
		String validarValorA32 = txt_matrizA32.getText();
		float valorA32 = Float.parseFloat(validarValorA32);
		matrizA[2][1] = valorA32;
		
		String validarValorA33 = txt_matrizA33.getText();
		float valorA33 = Float.parseFloat(validarValorA33);
		matrizA[2][2] = valorA33;
	}
	
	public void asignarValoresMatrizB(float[][] matrizB) {
		String validarValorB00 = txt_matrizB11.getText();
	    float valorB00 = Float.parseFloat(validarValorB00);
		matrizB[0][0] = valorB00;
		
		String validarValorB01 = txt_matrizB12.getText();
		float valorB01 = Float.parseFloat(validarValorB01);
		matrizB[0][1] = valorB01;
		
		String validarValorB02 = txt_matrizB13.getText();
		float valorB02 = Float.parseFloat(validarValorB02);
		matrizB[0][2] = valorB02;
		
		String validarValorB10 = txt_matrizB21.getText();
		float valorB21 = Float.parseFloat(validarValorB10);
		matrizB[1][0] = valorB21;
		
		String validarValorB11 = txt_matrizB22.getText();
		float valorB22 = Float.parseFloat(validarValorB11);
		matrizB[1][1] = valorB22;
	    
		String validarValorB12 = txt_matrizB23.getText();
		float valorB23 = Float.parseFloat(validarValorB12);
		matrizB[1][2] = valorB23;
		
		String validarValorB20 = txt_matrizB31.getText();
		float valorB31 = Float.parseFloat(validarValorB20);
		matrizB[2][0] = valorB31;
		
		String validarValorB21 = txt_matrizB32.getText();
		float valorB32 = Float.parseFloat(validarValorB21);
		matrizB[2][1] = valorB32;
		
		String validarValorB22 = txt_matrizB33.getText();
		float valorB33 = Float.parseFloat(validarValorB22);
		matrizB[2][2] = valorB33;
	}
		
	public void asignarValoresMatrizC(float[][] matrizC) {
		txtC00.setText(String.valueOf(String.format("%.2f",matrizC[0][0])));
	    txtC01.setText(String.valueOf(String.format("%.2f",matrizC[0][1])));
	    txtC02.setText(String.valueOf(String.format("%.2f",matrizC[0][2])));

	    txtC10.setText(String.valueOf(String.format("%.2f",matrizC[1][0])));
	    txtC11.setText(String.valueOf(String.format("%.2f",matrizC[1][1])));
	    txtC12.setText(String.valueOf(String.format("%.2f",matrizC[1][2])));

	    txtC20.setText(String.valueOf(String.format("%.2f",matrizC[2][0])));
	    txtC21.setText(String.valueOf(String.format("%.2f",matrizC[2][1])));
	    txtC22.setText(String.valueOf(String.format("%.2f",matrizC[2][2])));
	}
	
	static float[][] multiplicarMatriz(float matrizA[][], float matrizB[][], int filas, int columnas){
		int CMi, CMj;
		float[][] matrizC = new float[3][3];
		
		 for(CMi=0;CMi<3;CMi++){ // Itera a travÃ©s de cada fila de matrizA
	           for(CMj=0;CMj<3;CMj++){ // Itera a travÃ©s de cada columna de matrizB
	               //Inicializarlos para que no den errores, 4saber quÃ© valores van a tomar (o los que deberÃ­an segÃºn la definiciÃ³n MatemÃ¡tica)
	               //Si no se definen, van a empezar de 0, y habrÃ­a una incompatibilidad con la previa definiciÃ³n de las "filaA" y "columB" ya que empiezan de 1
	               //Si se quisiera mostrar que empiecen por 0, no harÃ­a falta iniciarlo (quizÃ¡s para prevenir), ya que todos empiezan, por defecto, en 0
	               int filaB=0;
	               int columA=0;
	               for(columA=0;columA<3;columA++){
	                   for(filaB=0;filaB<3;filaB++){
	                       //System.out.print("|%d|",resultado);
	                       matrizC[CMi][CMj]=matrizA[CMi][columA]*matrizB[filaB][CMj]+matrizC[CMi][CMj];
	                       columA++;
	                           //System.out.print("\n");
	                   }
	                   //System.out.print("C[%d][%d]=%d",filaA,columB,matrizC[filaA][columB]);
	                       //System.out.print("\n");
	               }
	                   //System.out.print("\n\n"); //por cada tres columnas, una fila. Cada que se repite: esto un salto de lÃ­nea
	           }	
	       }
	       System.out.print("\n");
	       for(CMi= 0; CMi<3; CMi++){
	           System.out.print("  ");
	           for(CMj=0;CMj<3;CMj++){
	               System.out.print("|"+matrizC[CMi][CMj]+"|");
	           }
	           System.out.print("\n");
	       }
	     
	       return matrizC;
	        
	}
	
	static float determinanteMatriz(float matriz[][], int filas, int columnas){
        float ci1=0, ci2=0, ci3=0, ci4=0, ci5=0, ci6=0, det=0;
        
        if(filas==2&&columnas==2){
            ci1=matriz[0][0]*matriz[0][1];
            ci2=matriz[1][0]*matriz[1][1];
        
            det=(ci1-ci2);
            //System.out.print("El resultado del determinante 2x2 es %d\n",det);
        }
        
        if(filas==3&&columnas==3){
            ci1=matriz[0][0]*matriz[1][1]*matriz[2][2];
            ci2=matriz[0][1]*matriz[1][2]*matriz[2][0];
            ci3=matriz[1][0]*matriz[2][1]*matriz[0][2];
            ci4=matriz[0][2]*matriz[1][1]*matriz[2][0];
            ci5=matriz[0][1]*matriz[1][0]*matriz[2][2];
            ci6=matriz[1][2]*matriz[2][1]*matriz[0][0];
        
            det=ci1+ci2+ci3-ci4-ci5-ci6;
            
            //System.out.print("El resultado del determinante 3x3 es %d\n",det);
        }

        System.out.print("\n  Determinante de la Matriz: "+det);
        return det;
    }
	
	public float[][] traspuestaMatriz(float matriz[][], int filas, int columnas){
		float[][] traspuesta = new float[3][3];
        int i=0, j=0;
            for(j=0; j<columnas; j++){//por cada columna
                for(i=0; i<filas; i++){//...x cantidad de filas
                //se invierten la lectura
                    traspuesta[i][j]=matriz[j][i];
                }
            }
        imprimirMatriz(traspuesta,filas,columnas);
        
        return traspuesta;
	}
	
	public float[][] inversaMatriz(float matriz[][], int filas, int columnas){
        int i, j, k, l, fila_eliminar=0, columna_eliminar=0, filaAUX, coluAUX, CONTcoluAUX=0, CONTfilaAUX=0;
        float detF;
        
        float[][] traspuesta = new float[3][3];
        inicializarMatriz(traspuesta,3,3);
        
        float[][] matrizADJUNTA = new float[3][3];
		inicializarMatriz(matrizADJUNTA,3,3);
		
		float[][] matrizAUX = new float[3][3];
		inicializarMatriz(matrizAUX,3,3);
		
		float[][] matrizINVERSA = new float[3][3];
		inicializarMatriz(matrizINVERSA,3,3);
		
		traspuesta=traspuestaMatriz(matriz,3,3);
        for(i=0;i<filas; i++){
            for(j=0;j<columnas;j++){
                System.out.print("|Adj("+traspuesta[i][j]+")|");
            }
            System.out.print("\n");//por cada tres columnas, una fila. Cada que se repite: esto un salto de lÃ­nea	
        }
        System.out.print("\n\n");

        int count=0;

        for(k=0;k<filas;k++){
            for(l=0;l<columnas;l++){
                fila_eliminar=k;
                columna_eliminar=l;
                filaAUX=1;
                coluAUX=1;
                CONTfilaAUX=0;
                CONTcoluAUX=0;
                for(i=0;i<filas;i++){    
                    coluAUX=1;/*X cantidad de columnas corresponden a una determinada FILA, y esa misma X cantidad de columnas (diferentes valores) van a formar parte de otra fila, 
                    por eso se necesita reiniciar ÃšNICAMENTE las columnas*/
                    for(j=0;j<columnas;j++){
                        if(i!=fila_eliminar&&j!=columna_eliminar){/*Va a imprimir ÃšNICAMENTE los valores donde el num. real de filas (i) y el num. real de columnas(j)
                        sean diferentes al num. de filas y de columnas guardados en fila_eliminar y columna_eliminar respectivamente.
                        Por lo tanto, no va a imprimir ni la fila, ni la columna, de ese elemento, ya que entonces sÃ­ serÃ­an igual*/
                            matrizAUX[filaAUX][coluAUX]=traspuesta[i][j];
                            //Va definiendo la cantidad de filas y columnas a medida que aumentan
                            coluAUX++;
                            CONTcoluAUX=coluAUX-1;
                            /*Si ponÃ©s un CONTADOR sumando la cantidad de filas, hay que tener en cuenta que esta va a aumentar, entonces serÃ­a un SUPERCONTADOR
                            y por lo tanto no mostrarÃ­a el valor correcto. Simplemente, si queremos guardar la cantidad, lo asignamos a otra variable. En vez del SUPERCONTADOR, lo denominamos
                            SUPERAUXILIAR: auxiliar de un auxiliar*/
                        }
                    }
                    if(i!=fila_eliminar){
                        filaAUX++;
                        CONTfilaAUX=filaAUX-1;
                        /*DOS SUPERAUXILIARES!!!*/
                    }
                }
                
                System.out.print("MATRIZ AUX...\n");
                imprimirMatriz(matrizAUX,3,3);

                System.out.println("\nCONTfilaAUX= "+CONTfilaAUX);
                System.out.println("CONTcoluAUX= "+CONTcoluAUX);
            
                float ci1=0, ci2=0, detAUX1=0, detAUX2=0, detAUX3=0,detAUX4=0,detAUX5=0,detAUX6=0,detAUX7=0,detAUX8=0,detAUX9=0;
                if(CONTfilaAUX==2&&CONTcoluAUX==2){

                    count++;
                    System.out.print("Contador de det. = "+count);

                    ci1=matrizAUX[1][1]*matrizAUX[2][2];
                    ci2=matrizAUX[1][2]*matrizAUX[2][1];
                    
                    System.out.println("\nci1= "+ci1);
                    System.out.println("\nci2= "+ci2);

                    detF=(ci1-ci2);
                    if(count==1){
                        detAUX1=detF;
                        matrizADJUNTA[0][0]=detAUX1;
                        //System.out.print("El resultado del determinante 2x2 es %d\n",detAUX1);
                    }
                    if(count==2){
                        detAUX2=detF;
                        matrizADJUNTA[0][1]=detAUX2*-1;
                        //System.out.print("El resultado del determinante 2x2 es %d\n",detAUX2);
                    }
                    if(count==3){
                        detAUX3=detF;
                        matrizADJUNTA[0][2]=detAUX3;
                        //System.out.print("El resultado del determinante 2x2 es %d\n",detAUX3);
                    }
                    if(count==4){
                        detAUX4=detF;
                        matrizADJUNTA[1][0]=detAUX4*-1;
                        //System.out.print("El resultado del determinante 2x2 es %d\n",detAUX4);
                    }
                    if(count==5){
                        detAUX5=detF;
                        matrizADJUNTA[1][1]=detAUX5;
                        //System.out.print("El resultado del determinante 2x2 es %d\n",detAUX5);
                    }
                    if(count==6){
                        detAUX6=detF;
                        matrizADJUNTA[1][2]=detAUX6*-1;
                        //System.out.print("El resultado del determinante 2x2 es %d\n",detAUX6);
                    }
                    if(count==7){
                        detAUX7=detF;
                        matrizADJUNTA[2][0]=detAUX7;
                        //System.out.print("El resultado del determinante 2x2 es %d\n",detAUX7);
                    }
                    if(count==8){
                        detAUX8=detF;
                        matrizADJUNTA[2][1]=detAUX8*-1;
                        //System.out.print("El resultado del determinante 2x2 es %d\n",detAUX8);
                    }
                    if(count==9){
                        detAUX9=detF;
                        matrizADJUNTA[2][2]=detAUX9;
                        //System.out.print("El resultado del determinante 2x2 es %d\n",detAUX9);
                    }         
                }
            }
        }
        System.out.print("\n");
        
        imprimirMatriz(matrizADJUNTA, filas, columnas);
        
        float det=determinanteMatriz(matriz, filas, columnas);
        
        System.out.print("Det="+det+"\n\n");
        
        imprimirMatriz(matriz, filas, columnas);
        
        System.out.print("\n");
        System.out.print("  [ matriz^ -1 ]\n");
        for(i=0;i<filas; i++){
            System.out.print("  ");
            for(j=0;j<columnas;j++){
                matrizINVERSA[i][j]=matrizADJUNTA[i][j]/det;
                System.out.print("|"+matrizINVERSA[i][j]+"|");
            }
            System.out.print("\n"); //por cada tres columnas, una fila. Cada que se repite: esto un salto de lÃ­nea	
        }
        
        return matrizINVERSA;

    }

	private JPanel contentPane;

	//--DEFINICIÓN DE VARIABLES
	   
    int CMi=0;
    int CMj=0;
    
    float[][] matrizA = new float[3][3];
    float[][] matrizB = new float[3][3];   
    float[][] matrizC = new float[3][3];
   
    private JTextField txtC00;
    private JTextField txtC01;
    private JTextField txtC02;
    private JTextField txtC10;
    private JTextField txtC11;
    private JTextField txtC12;
    private JTextField txtC20;
    private JTextField txtC21;
    private JTextField txtC22;
    private JTextField txtDetA;
    private JTextField txtEscalarA;
    private JTextField txtDetB;
    private JTextField txtEscalarB;
    //--------------------------
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Matrices frame = new Matrices();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	public Matrices() {

		setTitle("CalculadoraMatrices");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("iconoepico.png"));
		this.setResizable(false);
		setBounds(360, 100, 637, 539);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//--MATRIZ A
		
			//--Inicilización de la Matriz
			inicializarMatriz(matrizA, 3, 3);
		
		txt_matrizA11 = new JTextField();
		txt_matrizA11.setBounds(25, 41, 49, 44);
		contentPane.add(txt_matrizA11);
		txt_matrizA11.setColumns(10);
		
		
		txt_matrizA12 = new JTextField();
		txt_matrizA12.setColumns(10);
		txt_matrizA12.setBounds(84, 41, 49, 44);
		contentPane.add(txt_matrizA12);
		
		txt_matrizA13 = new JTextField();
		txt_matrizA13.setColumns(10);
		txt_matrizA13.setBounds(143, 41, 49, 44);
		contentPane.add(txt_matrizA13);
		
		txt_matrizA21 = new JTextField();
		txt_matrizA21.setColumns(10);
		txt_matrizA21.setBounds(25, 96, 49, 44);
		contentPane.add(txt_matrizA21);
		
		txt_matrizA22 = new JTextField();
		txt_matrizA22.setColumns(10);
		txt_matrizA22.setBounds(84, 96, 49, 44);
		contentPane.add(txt_matrizA22);
		
		txt_matrizA23 = new JTextField();
		txt_matrizA23.setColumns(10);
		txt_matrizA23.setBounds(143, 96, 49, 44);
		contentPane.add(txt_matrizA23);
		
		txt_matrizA31 = new JTextField();
		txt_matrizA31.setColumns(10);
		txt_matrizA31.setBounds(25, 151, 49, 44);
		contentPane.add(txt_matrizA31);
		
		txt_matrizA32 = new JTextField();
		txt_matrizA32.setColumns(10);
		txt_matrizA32.setBounds(84, 151, 49, 44);
		contentPane.add(txt_matrizA32);
		
		txt_matrizA33 = new JTextField();
		txt_matrizA33.setColumns(10);
		txt_matrizA33.setBounds(143, 151, 49, 44);
		contentPane.add(txt_matrizA33);
		//------------------------------------------
		
		//--MATRIZ B
			//--Inicilización de la Matriz
			inicializarMatriz(matrizB, 3, 3);
		txt_matrizB11 = new JTextField();
		txt_matrizB11.setColumns(10);
		txt_matrizB11.setBounds(419, 41, 49, 44);
		contentPane.add(txt_matrizB11);
		
		txt_matrizB12 = new JTextField();
		txt_matrizB12.setColumns(10);
		txt_matrizB12.setBounds(478, 41, 49, 44);
		contentPane.add(txt_matrizB12);
		
		txt_matrizB13 = new JTextField();
		txt_matrizB13.setColumns(10);
		txt_matrizB13.setBounds(537, 41, 49, 44);
		contentPane.add(txt_matrizB13);
		
		txt_matrizB21 = new JTextField();
		txt_matrizB21.setColumns(10);
		txt_matrizB21.setBounds(419, 96, 49, 44);
		contentPane.add(txt_matrizB21);
		
		txt_matrizB22 = new JTextField();
		txt_matrizB22.setColumns(10);
		txt_matrizB22.setBounds(478, 96, 49, 44);
		contentPane.add(txt_matrizB22);
		
		txt_matrizB23 = new JTextField();
		txt_matrizB23.setColumns(10);
		txt_matrizB23.setBounds(537, 96, 49, 44);
		contentPane.add(txt_matrizB23);
		
		txt_matrizB31 = new JTextField();
		txt_matrizB31.setColumns(10);
		txt_matrizB31.setBounds(419, 151, 49, 44);
		contentPane.add(txt_matrizB31);
		
		txt_matrizB32 = new JTextField();
		txt_matrizB32.setColumns(10);
		txt_matrizB32.setBounds(478, 151, 49, 44);
		contentPane.add(txt_matrizB32);
		
		txt_matrizB33 = new JTextField();
		txt_matrizB33.setColumns(10);
		txt_matrizB33.setBounds(537, 151, 49, 44);
		contentPane.add(txt_matrizB33);
		//---------------------------------------
		
		
		JButton btnClearMatrizA = new JButton("C");
		btnClearMatrizA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_matrizA11.setText("");
				txt_matrizA12.setText("");
				txt_matrizA13.setText("");
				txt_matrizA21.setText("");
				txt_matrizA22.setText("");
				txt_matrizA23.setText("");
				txt_matrizA31.setText("");
				txt_matrizA32.setText("");
				txt_matrizA33.setText("");
			}
		});
		btnClearMatrizA.setBackground(Color.RED);
		btnClearMatrizA.setBounds(25, 206, 167, 32);
		contentPane.add(btnClearMatrizA);
		
		JButton btnClearMatrizB = new JButton("C");
		btnClearMatrizB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_matrizB11.setText("");
				txt_matrizB12.setText("");
				txt_matrizB13.setText("");
				txt_matrizB21.setText("");
				txt_matrizB22.setText("");
				txt_matrizB23.setText("");
				txt_matrizB31.setText("");
				txt_matrizB32.setText("");
				txt_matrizB33.setText("");
			}
		});
		btnClearMatrizB.setForeground(Color.BLACK);
		btnClearMatrizB.setBackground(Color.RED);
		btnClearMatrizB.setBounds(419, 206, 167, 32);
		contentPane.add(btnClearMatrizB);
		
		txtC00 = new JTextField();
		txtC00.setBackground(new Color(128, 128, 128));
		txtC00.setText("");
		txtC00.setBounds(225, 268, 49, 44);
		contentPane.add(txtC00);
		
		txtC01 = new JTextField();
		txtC01.setBackground(new Color(128, 128, 128));
		txtC01.setText("");
		txtC01.setBounds(281, 269, 49, 44);
		contentPane.add(txtC01);
		
		txtC02 = new JTextField();
		txtC02.setBackground(new Color(128, 128, 128));
		txtC02.setText("");
		txtC02.setBounds(340, 268, 49, 44);
		contentPane.add(txtC02);
		
		txtC10 = new JTextField();
		txtC10.setBackground(new Color(128, 128, 128));
		txtC10.setText("");
		txtC10.setBounds(225, 323, 49, 44);
		contentPane.add(txtC10);
		
		txtC11 = new JTextField();
		txtC11.setBackground(new Color(128, 128, 128));
		txtC11.setText("");
		txtC11.setBounds(281, 323, 49, 44);
		contentPane.add(txtC11);
		
		txtC12 = new JTextField();
		txtC12.setBackground(new Color(128, 128, 128));
		txtC12.setText("");
		txtC12.setBounds(340, 324, 49, 44);
		contentPane.add(txtC12);
		
		txtC20 = new JTextField();
		txtC20.setBackground(new Color(128, 128, 128));
		txtC20.setText("");
		txtC20.setBounds(225, 378, 49, 44);
		contentPane.add(txtC20);
		
		txtC21 = new JTextField();
		txtC21.setBackground(new Color(128, 128, 128));
		txtC21.setText("");
		txtC21.setBounds(281, 379, 49, 44);
		contentPane.add(txtC21);

		txtC22 = new JTextField();
		txtC22.setBackground(new Color(128, 128, 128));
		txtC22.setText("");
		txtC22.setBounds(340, 378, 49, 44);
		contentPane.add(txtC22);
		//--------------------------------------------
		
		//--BOTONES DE OPERACIÓN
		
		//ESCALAR
			//--MATRIZ A
				JButton btnEscalarA = new JButton("Escalar");
				btnEscalarA.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						asignarValoresMatrizA(matrizA);
						inicializarMatriz(matrizC, 3, 3);
						
						String validarEscalarA = txtEscalarA.getText();
						float escalarA = Float.parseFloat(validarEscalarA);
						System.out.print("Verificación escalar: "+escalarA);
						
						System.out.print("--ANTES");
						imprimirMatriz(matrizC,3,3);
						
							for(CMi=0;CMi<3;CMi++){
								for(CMj=0;CMj<3;CMj++){
									matrizC[CMi][CMj]=matrizA[CMi][CMj]*escalarA;
								}
			                }
			                System.out.print("\n");
			                       
			                System.out.print("  La matriz multiplicada por el escalar "+escalarA+" es igual a...");
			                System.out.print("\n");
			                for(CMi=0;CMi<3;CMi++){
			                	System.out.print("  ");
			                    for(CMj=0;CMj<3;CMj++){
			                    	System.out.print("|"+matrizC[CMi][CMj]+"|");
			                    }
			                    System.out.print("\n");
			                }
			                System.out.print("\n  ---------------------------------------\n");
			                
			                asignarValoresMatrizC(matrizC);
			                
			                System.out.print("--DESPUÉS");
			    			imprimirMatriz(matrizC,3,3);
						}
					});
					
				btnEscalarA.setBounds(77, 268, 125, 44);
				contentPane.add(btnEscalarA);
				txtEscalarA = new JTextField();
				txtEscalarA.setBounds(18, 271, 49, 39);
				contentPane.add(txtEscalarA);
				txtEscalarA.setColumns(10);
			//------------------
			
			//--MATRIZ B
				JButton btnEscalarB = new JButton("Escalar");
				btnEscalarB.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						asignarValoresMatrizB(matrizB);
						inicializarMatriz(matrizC, 3, 3);
						
						String validarEscalarB = txtEscalarB.getText();
						float escalarB = Float.parseFloat(validarEscalarB);
						System.out.print("Verificación escalar: "+escalarB);
						
						System.out.print("--ANTES");
						imprimirMatriz(matrizC,3,3);
						
							for(CMi=0;CMi<3;CMi++){
								for(CMj=0;CMj<3;CMj++){
									matrizC[CMi][CMj]=matrizB[CMi][CMj]*escalarB;
								}
			                }
			                System.out.print("\n");
			                       
			                System.out.print("  La matriz multiplicada por el escalar "+escalarB+" es igual a...");
			                System.out.print("\n");
			                for(CMi=0;CMi<3;CMi++){
			                	System.out.print("  ");
			                    for(CMj=0;CMj<3;CMj++){
			                    	System.out.print("|"+matrizC[CMi][CMj]+"|");
			                    }
			                    System.out.print("\n");
			                }
			                System.out.print("\n  ---------------------------------------\n");
			                
			                asignarValoresMatrizC(matrizC);
			                
			                System.out.print("--DESPUÉS");
			    			imprimirMatriz(matrizC,3,3);
					}
				});
				btnEscalarB.setBounds(472, 268, 125, 44);
				contentPane.add(btnEscalarB);
				txtEscalarB = new JTextField();
				txtEscalarB.setBounds(413, 271, 49, 39);
				contentPane.add(txtEscalarB);
				txtEscalarB.setColumns(10);
			//----------
		//--------------
		
		//DETERMINANTE
			//--MATRIZ A
				JButton btnDetA = new JButton("Determinante");
				btnDetA.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						asignarValoresMatrizA(matrizA);
						txtDetA.setText(String.valueOf(determinanteMatriz(matrizA,3,3)));
		                System.out.print("\n---------------------------------------\n\n");
					}
				});
				btnDetA.setBounds(18, 323, 125, 44);
				contentPane.add(btnDetA);
				txtDetA = new JTextField();
				txtDetA.setBackground(new Color(128, 128, 128));
				txtDetA.setColumns(10);
				txtDetA.setBounds(143, 326, 59, 39);
				contentPane.add(txtDetA);
			//-----------
				
			//--MATRIZ B
				JButton btnDetB = new JButton("Determinante");
				btnDetB.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						asignarValoresMatrizB(matrizB);
						txtDetB.setText(String.valueOf(determinanteMatriz(matrizB,3,3)));
		                System.out.print("\n---------------------------------------\n\n");
					}
				});
				btnDetB.setBounds(413, 323, 125, 44);
				contentPane.add(btnDetB);
				txtDetB = new JTextField();
				txtDetB.setColumns(10);
				txtDetB.setBackground(Color.GRAY);
				txtDetB.setBounds(537, 326, 60, 39);
				contentPane.add(txtDetB);
			//----------
		//--------------
			
		//TRASPUESTA
			//--MATRIZ A
				JButton btnTraspA = new JButton("Traspuesta");
				btnTraspA.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						inicializarMatriz(matrizA,3,3);
						
						System.out.print("--ANTES (asignar valores en traspuesta)\n");
						imprimirMatriz(matrizA,3,3);
						
						asignarValoresMatrizA(matrizA);
						
						System.out.print("--DESPUÉS (asignar valores en traspuesta)\n");
						imprimirMatriz(matrizA,3,3);
						
						matrizC=traspuestaMatriz(matrizA,3,3);
						//envío como parámetro la 'matrizC' para que me la muestre en los campos de texto
						
						asignarValoresMatrizC(matrizC);
						
					}
				});
				btnTraspA.setBounds(54, 377, 125, 23);
				contentPane.add(btnTraspA);
			//-----------
				
			//--MATRIZ B
				JButton btnTraspB = new JButton("Traspuesta");
				btnTraspB.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						inicializarMatriz(matrizB,3,3);
						
						System.out.print("--ANTES (asignar valores en traspuesta)\n");
						imprimirMatriz(matrizB,3,3);
						
						asignarValoresMatrizB(matrizB);
						
						System.out.print("--DESPUÉS (asignar valores en traspuesta)\n");
						imprimirMatriz(matrizB,3,3);
						
						matrizC=traspuestaMatriz(matrizB,3,3);
						//envío como parámetro la 'matrizC' para que me la muestre en los campos de texto
						
						asignarValoresMatrizC(matrizC);
					}
				});
				btnTraspB.setBounds(449, 377, 125, 23);
				contentPane.add(btnTraspB);
				
			//-----------
		//---------------
				
		//INVERSA
			//--MATRIZ A
				JButton btnInversaA = new JButton("Inversa");
				btnInversaA.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						inicializarMatriz(matrizA,3,3);
						
						System.out.print("--ANTES (asignar valores en inversa)\n");
						imprimirMatriz(matrizA,3,3);
						
						asignarValoresMatrizA(matrizA);
						
						System.out.print("--DESPUÉS (asignar valores en traspuesta)\n");
						imprimirMatriz(matrizA,3,3);
						
						matrizC=inversaMatriz(matrizA, 3,3);
						//envío como parámetro la 'matrizC' para que me la muestre en los campos de texto
						
						asignarValoresMatrizC(matrizC);
					}
				});
				btnInversaA.setBounds(54, 411, 125, 23);
				contentPane.add(btnInversaA);
			//-----------
				
			//--MATRIZ B
				JButton btnInversaB = new JButton("Inversa");
				btnInversaB.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						inicializarMatriz(matrizB,3,3);
						
						System.out.print("--ANTES (asignar valores en inversa)\n");
						imprimirMatriz(matrizB,3,3);
						
						asignarValoresMatrizB(matrizB);
						
						System.out.print("--DESPUÉS (asignar valores en traspuesta)\n");
						imprimirMatriz(matrizB,3,3);
						
						matrizC=inversaMatriz(matrizB, 3,3);
						//envío como parámetro la 'matrizC' para que me la muestre en los campos de texto
						
						asignarValoresMatrizC(matrizC);
					}
				});
				btnInversaB.setBounds(449, 411, 125, 23);
				contentPane.add(btnInversaB);
			//----------
		//--------------
				
		JButton btnNewButton_1_1 = new JButton("+");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				asignarValoresMatrizA(matrizA);
				asignarValoresMatrizB(matrizB);
				
				for(CMi=0;CMi<3;CMi++){
                    for(CMj=0;CMj<3;CMj++){
                        matrizC[CMi][CMj]=matrizA[CMi][CMj]+matrizB[CMi][CMj];
                    }
                }
                for(CMi=0;CMi<3;CMi++){
                    System.out.print("  ");
                    for(CMj=0;CMj<3;CMj++){
                        System.out.print("|"+matrizC[CMi][CMj]+"|");	 
                    }
                    System.out.print("\n");
                }
                System.out.print("  --------------\n");
                
				imprimirMatriz(matrizC, 3, 3);
        	    
        	    asignarValoresMatrizC(matrizC);

				imprimirMatriz(matrizC, 3, 3);
				
        	    
			}
		});

		btnNewButton_1_1.setBounds(254, 79, 49, 44);
		contentPane.add(btnNewButton_1_1);
		
		btnNewButton_1_2 = new JButton("-");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarValoresMatrizA(matrizA);
				asignarValoresMatrizB(matrizB);
				
				for(CMi=0;CMi<3;CMi++){
                    for(CMj=0;CMj<3;CMj++){
                        matrizC[CMi][CMj]=matrizA[CMi][CMj]-matrizB[CMi][CMj];
                    }
                }
                for(CMi=0;CMi<3;CMi++){
                    System.out.print("  ");
                    for(CMj=0;CMj<3;CMj++){
                        System.out.print("|"+matrizC[CMi][CMj]+"|");	 
                    }
                    System.out.print("\n");
                }
                System.out.print("  --------------\n");
                
				imprimirMatriz(matrizC, 3, 3);
        	    
        	    asignarValoresMatrizC(matrizC);

				imprimirMatriz(matrizC, 3, 3);
			}
		});
		btnNewButton_1_2.setBounds(313, 79, 49, 44);
		contentPane.add(btnNewButton_1_2);
		
		btnNewButton_1_3 = new JButton("X");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarValoresMatrizA(matrizA);
				asignarValoresMatrizB(matrizB);
		  
			    imprimirMatriz(matrizC, 3, 3);
	        	//Comprobar cómo está ANTES de la inserción de los valores
			    
			    matrizC=multiplicarMatriz(matrizA,matrizB,3,3);
			    
	        	asignarValoresMatrizC(matrizC);
	        	    
	        	imprimirMatriz(matrizC, 3, 3);
				//Comprobar cómo está DESPUÉS de la inserción de los valores
				
				inicializarMatriz(matrizC, 3, 3);
				//Reiniciar la matriz para que no se multiplique infinitamente y dé un resultado único
			 }
				
		});
		btnNewButton_1_3.setBounds(254, 134, 49, 44);
		contentPane.add(btnNewButton_1_3);
		
		btnNewButton_1_4 = new JButton("/");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarValoresMatrizA(matrizA);
				asignarValoresMatrizB(matrizB);
		  
			    imprimirMatriz(matrizC, 3, 3);
	        	//Comprobar cómo está ANTES de la inserción de los valores
			    
			    float[][] matrizBinv = new float[3][3];
			    matrizBinv=inversaMatriz(matrizB,3,3);
			    
			    matrizC=multiplicarMatriz(matrizA,matrizBinv,3,3);
			    
	        	asignarValoresMatrizC(matrizC);
	        	    
	        	imprimirMatriz(matrizC, 3, 3);
				//Comprobar cómo está DESPUÉS de la inserción de los valores
				
				inicializarMatriz(matrizC, 3, 3);
			}
		});
		btnNewButton_1_4.setBounds(313, 134, 49, 44);
		contentPane.add(btnNewButton_1_4);
		
		
	}

}
