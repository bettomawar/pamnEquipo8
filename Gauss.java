/**
*	Gauss.java
*	Created on 22 November 2013, 08:32 hrs.
*	A simple class wich uses Gauss method.
*/

/**
*	@author: Equipo8
*
*			 -> Trejo Juárez César Alberto
*			 -> Hernández Cuecuecha Jorge Alberto
*			 -> Servín Lucario Verónica Valeria
*			 -> José Alberto
*
*
*/

import java.util.Scanner;

public class Gauss{

	//Propiedades
	public float [][]A;
	public float []B;
	public	float cte; 

	//Constructor
	public Gauss(int n){
		this.A = new float [n][n];
		this.B = new float [n];
	}

	//Metodos

	/** Metodo para establecer matriz B
	*	@return: void 
	*	@param: matrix
	*/
	public void setB(float []B){
		//leer matriz B
		Scanner teclado = new Scanner(System.in);
		int i;

		System.out.println("\n-->Ingresar matriz B.");
		for (i = 0; i < B.length ; i++) {
			System.out.print("Elemento [" + i + "]: ");
			B[i] = teclado.nextInt();
		}
	}

	/** Metodo para establecer matriz A
	*	@return: void 
	*	@param: matrix
	*/
	public void setA(float [][]A){
		//leer matriz A
		Scanner teclado = new Scanner(System.in);
		int i,j;

		System.out.println("\n-->Ingresar matriz A.");
		for (i = 0; i < A.length ; i++) {
			for (j = 0; j < A.length; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				A[i][j] = teclado.nextInt();
			}
		}

	}

	/** Metodo para obtener soluciones al sistema
	*	@return: float 
	*	@param: nothing
	*/
	public float[] getX(){
		int i,j,k;
		float []x = new float [A.length];

		for (i = 0; i < A.length; i++) {
			//Asegurar la inexistencia de 0's en diagonal principal
			if (A[i][i] == 0) {
				System.out.println(">>>Exists 0 in diagonal<<<");
				break;
				// falta intercambiar renglones
			}
			//
			//Normalizamos el primer renglón
			cte = A[i][i];
			for (j = 0;j < A.length ; j++) {
				A[i][j] = A[i][j] / cte;
			}
			B[i] = B[i] / cte;
			//Fin normalizar
			//Eliminación gaussiana
			for (j = i + 1; j < A.length ; j++) {
				cte = A[j][i] / A[i][i];
				for (k = i; k < A.length; k++) {
					A[j][k] = A[j][k] - cte * A[i][k];
				}
				B[j] = B[j] - cte * B[i];
			}
		}
		//almacenar en X las soluciones
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A.length ; j++) {
				System.out.print(A[i][j] + "\t");
			} 
			x[i]= B[i];
			System.out.println("|" + B[i]);
		}
		return x;
	}

}
