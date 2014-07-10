/**
 * @(#)Ejercicio.java
 *
 *
 * @author 
 * @version 1.00 2014/7/8
 */
import javax.swing.JOptionPane;

public class Ejercicio {
	
	private int puntosA;
	private int puntosB;
	private String nombreA;
	private String nombreB;
	private String frases[] = {"love","all","deuce","fifteen","thirty","fourty","adventages player 1"
								,"adventages player 2","player 1 wins","player 2 wins"};
	
    public Ejercicio(String nombreA, String nombreB) {
    	this.nombreA = nombreA;
    	this.nombreB = nombreB;
    	puntosA = 0;
    	puntosB = 0;
    }
    public void juega(){
    	String mensaje = frases[0]+" - "+frases[1];
    	while (puntosA <= 60 && puntosB <= 60){
    		System.out.print(puntosA+" -- "+ puntosB+"    ");
    		System.out.println(mensaje);
    		int jugador = Integer.parseInt(JOptionPane.showInputDialog("¿Qué jugador anotó?","Ingresa 1 o 2"));
    		if(jugador == 1){
    			puntoA();
    		}
    		if(jugador == 2){
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
    	}
    	if (puntosA > puntosB){
    		mensaje = frases[8];
    	}
    	else {
    		mensaje = frases[9];
    	}
    	System.out.println(mensaje);
    }
    
    public void puntoA(){
    	if(puntosA <= 15){
    		puntosA += 15;
    	}
    	else
    		puntosA += 10;
    }
    
    public void puntoB(){
    	if(puntosB <= 15){
    		puntosB += 15;
    	}
    	else
    		puntosB += 10;
    }
    public String score(){
    	return "player 1: "+puntosA+" -- player 2: "+puntosB;
    }
}
