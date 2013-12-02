/**
*	MiFuncion.java
*	Created on 2 December 2013, 12:05 hrs.
*	A simple class wich defines a derivate 
*	function to pass it to a Biseccionador
*	and NewtonRaphson
*	@see Funcion.java
*/

/**	
*		@author: Equipo8
*
*			 -> Trejo Juárez César Alberto
*			 -> Hernández Cuecuecha Jorge Alberto
*			 -> Servín Lucario Verónica Valeria
*			 -> José Alberto Martínez Lara
*			 -> Fajardo Álvarez Samuel
*
*
*/

public class MiFuncion extends Funcion {

	//Métodos
	@Override	    
	public double f(double valorDeX){
		
		double aEvaluar = valorDeX;
		double dy = aEvaluar * Math.exp(aEvaluar) + Math.exp(aEvaluar);
		return dy;
		
	}
}
