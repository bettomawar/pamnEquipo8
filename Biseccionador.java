/**
*	Biseccionador.java
*	Created on 2 December 2013, 13:00 hrs.
*	A simple class wich find roots of a function
*	by bissection method.
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
public class Biseccionador{
	//propiedades	
	float limitea;
	float limiteb;
	float tolerancia;
	Funcion f;

	//Constructor
	public Biseccionador(float limitea, float limiteb,Funcion f){
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
	public double calcular(float tolerancia){
		float c;

		do{
		    c = (limitea + limiteb) / 2;
		    if(this.f.f(limitea) * this.f.f(c) < 0){
		    	limiteb = c;
		    }else{
		    	limitea=  c;
		    }
		}while(Math.abs (this.f.f(limitea-limiteb))  >=tolerancia && this.f.f(c)!=0);

		return c;
	}	
}
