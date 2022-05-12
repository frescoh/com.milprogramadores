package com.milprogramadores.Modulo2TP3;

public class Tarjeta {
	public static void main (String[] args){
		TCredito JPTarjeta=new TCredito("666","JPerez","BcoPatagonia",2000,10000);
		TCredito DMTarjeta=new TCredito("777","DMartin","BcoGalicia",5000,10000);
		JPTarjeta.muestraDatos();
		if(!JPTarjeta.puedoComprar(16000))
			System.out.println("La compra no puede ser realizada porque supera el limite disponible");
		
		DMTarjeta.pagarTarjeta(1500);
		System.out.println("Pago realizado correctamente.");
		DMTarjeta.muestraDatos();
	}
}

/*
 * a) JPTarjeta y DMTarjeta son dos nuevas clases?. Sino es así ¿que son?
 * 		JPTarjeta y DMTarjeta son instancias de la clase Tcredito, es decir, son dos objetos.  
 */


/*
 * b) JPTarjeta.muestraDatos() ¿qué hace?
 * 		Muestra el el cotenido de los atributos numero y nombre en el objeto JPTarjeta
 * 
 */

//c) Mejore el método muestraDatos() para mostrar toda la información disponible.

//d) Modifique el main de Tarjeta para probar si JPTarjeta puede comprarse una
//Ultrabook de $16000. Si no es posible, mostrar un mensaje en pantalla.

//e) No estaría de más tener un método que permita aumentarBalance, ¿no?
//		No se diga más

/*
 * f) A DMTarjeta le informaron que debe pagar su tarjeta. Pero sólo pagará
 * $1500. Realice el pago y muestre la información actualizada de DMTarjeta.
 */