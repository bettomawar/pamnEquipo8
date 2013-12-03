/**
*	Funcion.java
*	Created on 2 December 2013, 12:05 hrs.
*	A simple class wich defines a function to pass
*	it to a Biseccionador and NewtonRaphson
*	
*	Universidad Nacional Autónoma de México
*	Programación Avanzada y Métodos Numéricos
*	Facultad de Ingeniería
*	Semestre: 2014-1
*	Profesor: Honorato Saavedra Hernández
*/

/**	
*		@author: Equipo8
*
*			 -> Trejo Juárez César Alberto
*			 -> Hernández Cuecuecha Jorge Alberto
*			 -> Servín Lucario Verónica Valeria
*			 -> José Alberto Martínez Lara
*			 -> Fajardo Álvarez Samuel
*/

public class Funcion{
	//Metodos

	/** 
	*	Metodo que define una función
	*	@return: double 
	*	@param: double
	*/
	public double f(double valorDeX){
		
		double aEvaluar = valorDeX;
		double y = aEvaluar * Math.exp(aEvaluar) - 5;
		return y;
	
	}
}