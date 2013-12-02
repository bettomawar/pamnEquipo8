/**
*	NewtonRaphson.java
*	Created on 2 December 2013, 12:32 hrs.
*	A simple class wich find roots of a function
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
