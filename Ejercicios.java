import javax.swing.*;
import java.awt.event.*;
public class Ejercicio extends JFrame implements ActionListener {
    private int puntosA;
	private int puntosB;
	private String nombreA;
	private String nombreB;
	private String frases[] = {"love","all","deuce","fifteen","thirty","fourty","adventages player 1"
								,"adventages player 2","wins"};
    JButton boton1;
    JButton boton2;
    
    public Ejercicio(String nombreA, String nombreB) {
		this.nombreA = nombreA;
    	this.nombreB = nombreB;
    	puntosA = 0;
    	puntosB = 0;
    	
        setLayout(null);
        boton1=new JButton(nombreA);
        boton1.setBounds(100,100,100,30);
        add(boton1);
        boton1.addActionListener(this);
        
        boton2=new JButton(nombreB);
        boton2.setBounds(300,250,100,30);
        add(boton2);
        boton2.addActionListener(this);
        this.setDefaultCloseOperation(Ejercicio.DISPOSE_ON_CLOSE);
        System.out.println(frases[0]+" - "+frases[1]);
    }
    
    public void actionPerformed(ActionEvent e) {
    	if ((puntosA <= 60) && (puntosB <= 60)){
	        if (e.getSource()==boton2) {
	            juega(2);
	        }
	        if (e.getSource()==boton1) {
	            juega(1);
	        }
    	}
    	if ((puntosA == 70) || (puntosB == 70)){
    	   	if (puntosA > puntosB){
	    		System.out.println(nombreA+" "+frases[8]);
	    	}
	    	else {
	    		System.out.println(nombreB+" "+frases[8]);
	    	}
    	}
    }
    public void juega(int n){
    	String mensaje ="";    	    		
		if(n == 1){
			puntoA();
		}
		if(n == 2){
			puntoB();
		}
		if (puntosA == puntosB){
			if (puntosA <= 30 || puntosB < 30){
    			if(puntosA == 15){
    				mensaje = frases[3]+" - "+frases[1];
    			}
	    		if(puntosA == 30){
	    			mensaje = frases[4]+" - "+frases[1];
	    		}	
			}else{
				mensaje = frases[2];
			}
		}
		else{
			if(puntosA == 0){
				mensaje = frases[0]+" - ";
			}
			if(puntosA == 15){
				mensaje = frases[3]+" - ";
			}
    		if(puntosA == 30){
    			mensaje = frases[4]+" - ";
    		}
    		if(puntosA == 40){
    			mensaje = frases[5]+" - ";
    		}
    		if ((puntosB > 40) && (puntosB > puntosA)){
    			mensaje = frases[7];
    		}
    		
    		if(puntosB == 0){
				mensaje += frases[0];
			}
    		if(puntosB == 15){
				mensaje += frases[3];
			}
    		if(puntosB == 30){
    			mensaje += frases[4];
    		}
    		if(puntosB == 40){
    			mensaje += frases[5];
    		}
    		if ((puntosA > 40) && (puntosA > puntosB)){
    			mensaje = frases[6];
    		}
		}
		System.out.print(puntosA+" -- "+ puntosB+"    ");
    	System.out.println(mensaje);
    }
    public void puntoA(){
    	if(puntosA <= 15){
    		puntosA += 15;
    	}
    	else{    	
    		puntosA += 10;
    	}
    }
    
    public void puntoB(){
    	if(puntosB <= 15){
    		puntosB += 15;
    	}
    	else{
    		puntosB += 10;
    	}
    }
    
    public String score(){
    	return "player 1: "+puntosA+" -- player 2: "+puntosB;
    }
}
