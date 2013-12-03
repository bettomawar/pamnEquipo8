/**
*	Biseccionador.java
*	Created on 2 December 2013, 13:00 hrs.
*	A simple class wich find roots of a function
*	by bissection method.
*	@see Funcion.java
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
public class Biseccionador{
	//propiedades	
	double limitea;
	double limiteb;
	double tolerancia;
	Funcion f;

	//Constructor
	public Biseccionador(double limitea, double limiteb,Funcion f){
		this.limitea=limitea;
		this.limiteb=limiteb;
		this.f=f;	
	}

	//Métodos

	/**
	*	Método que calcula la raíz de la función
	*	@return: real as a root
	*	@param:	real
	*/
	public double calcular(double tolerancia){
		double c;

		do{
		    c = (limitea + limiteb) / 2;
		    if(this.f.f(limitea) * this.f.f(c) < 0){
		    	limiteb = c;
		    }else{
		    	limitea=  c;
		    }
		}while(Math.abs (this.f.f(limitea-limiteb))  >= tolerancia && this.f.f(c) != 0);

		return c;
	}	
}