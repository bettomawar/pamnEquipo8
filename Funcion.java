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
*	@author: Equipo8
*
*			 -> Trejo Juárez César Alberto				contact:   cesaralberto@yandex.com / cesaratj27@gmail.com
*			 -> Hernández Cuecuecha Jorge Alberto		contact:   fig_jorg10_7@hotmail.com
*			 -> Servín Lucario Verónica Valeria			contact:   vili_servin@hotmail.com
*			 -> Martínez Lara José Alberto				contact:   betto_ma_war.h@hotmail
*			 -> Fajardo Álvarez Samuel					contact:   samfajalv@gmail.com
*			 -> Sebastian Cuatepotzo					contact:   sstsacm@gmail.com
*
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