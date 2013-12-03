/**
*	LU.java
*	Created on 22 November 2013, 11:13 hrs.
*	A simple class wich uses LU method.
*	@see Gauss.java
*
*	Universidad Nacional Autónoma de México
*	Programación Avanzada y Métodos Numéricos
*
*	Profesor: Honorato Saavedra Hernández	
*/

/**
*	@author: Equipo8
*
*			 -> Trejo Juárez César Alberto
*			 -> Hernández Cuecuecha Jorge Alberto
*			 -> Servín Lucario Verónica Valeria
*			 -> José Alberto Martínez Lara
*			 -> Fajardo Álvarez Samuel
*/

public class LU extends Gauss{

	//Propiedades
	public float [][]L;
	public float [][]U;

	//Constructor
	public LU(int n){
		super(n);
		this.L = new float[n][n];
		this.U = new float[n][n];
	}

	//Metodos

	/** 
	*	Metodo para obtener L
	*	@return: array[n] 
	*	@param: nothing
	*/
	public float[][] getL(){
		int i,j,k;


		

		return L;
	}
}