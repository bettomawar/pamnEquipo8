/**
*	NewtonRaphson.java
*	Created on 2 December 2013, 12:32 hrs.
*	A simple class wich find roots of a function
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

public class NewtonRaphson{
	//Propiedades
	Funcion f, df;

	// Constructor
	public NewtonRaphson(Funcion f, Funcion df){
		this.f = f;
		this.df = df;
	}

	//Métodos
	/**
	*	Método que calcula la raíz de la función
	*	@return: real as a root
	*	@param:	real and real
	*/
	public double calcular(double tolerancia, double x0){
		double xi;
		double tol = tolerancia;
		double xiPlus1 = x0;

		do{
			xi = xiPlus1;
			xiPlus1 = xi - (this.f.f(xi) / this.df.f(xi));
		}while(Math.abs(xiPlus1 - xi) > tol && this.f.f(xiPlus1) != 0);

		return xiPlus1;
	}
}