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
*			 -> José Alberto Martínez Lara
*			 -> Fajardo Álvarez Samuel
*
*
*/

import java.util.Scanner;

public class Gauss{

	//Propiedades
	public float [][]A;
	public float []B;
	public	float cte;
	public int orden;
	public float []x;

	//Constructor
	public Gauss(int n){
		this.A = new float [n][n];
		this.B = new float [n];
		this.orden = n;
		this.x = new float [n];
	}

	//Metodos

	/** 
	*	Metodo para establecer matriz B
	*	@return: void 
	*	@param: matrix
	*/
	public void setB(float []B){
		//leer matriz B
		Scanner teclado = new Scanner(System.in);
		int i;

		System.out.println("\n-->Ingresar matriz B.");
		for (i = 0; i < orden ; i++) {
			System.out.print("Elemento [" + i + "]: ");
			B[i] = teclado.nextFloat();
		}
	}

	/** 
	*	Metodo para establecer matriz A
	*	@return: void 
	*	@param: matrix
	*/
	public void setA(float [][]A){
		//leer matriz A
		Scanner teclado = new Scanner(System.in);
		int i,j;

		System.out.println("\n-->Ingresar matriz A.");
		for (i = 0; i < orden ; i++) {
			for (j = 0; j < orden; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				A[i][j] = teclado.nextFloat();
			}
		}
	}

	/** 
	*	Metodo para obtener soluciones al sistema
	*	@return: float[] 
	*	@param: nothing
	*/
	public float[] getX(){
		int i,j,k;
		float temp[] = new float [orden];
		float tm = 0;

		//mostrar matriz ingresada...-----------------
		System.out.println("\n-->Your matrix: ");
		for (int m = 0; m < orden; m++) {
			for (int n = 0; n < orden; n++) {
				System.out.print(A[m][n] + "\t");
			}
			System.out.println("|" + B[m]);
		}
		//--------------------------------------------
		// Intercambio de renglones
		for (k = 0;k < orden ; k++) {
			for (i = 0; i < orden-1; i++) {
				if (A[i][0] < A[i+1][0]) {
					for (j = 0;j < orden ; j++) {
						temp[j] = A[i][j];
						A[i][j] = A[i+1][j];
						A[i+1][j] = temp[j];
					}
					tm = B[i];
					B[i] = B[i+1];
					B[i+1] = tm;
				}
			}	
		}
		//
		//print matriz ordenada------------------
		System.out.println("\n-->Matrix sorted: ");
		for (int m = 0; m < orden; m++) {
			for (int n = 0; n < orden; n++) {
				System.out.print(A[m][n] + "\t");
			}
			System.out.println("|" + B[m]);
		}
		//---------------------------------------
		// operaciones elementales
		for (i = 0; i < orden; i++) {
			//Avisar de la existencia de cero en la diagonal
			if (A[i][i] == 0) {
				System.out.println(">>>Exists 0 in diagonal. Aborting...<<<");
				System.exit(0);
			}
			//
			//Normalizamos el primer renglón
			cte = A[i][i];
			for (j = 0;j < orden ; j++) {
				A[i][j] = A[i][j] / cte;
			}
			B[i] = B[i] / cte;
			//Fin normalizar
			//Eliminación gaussiana
			for (j = i + 1; j < orden ; j++) {
				cte = A[j][i] / A[i][i];
				for (k = i; k < orden; k++) {					
					A[j][k] = A[j][k] - cte * A[i][k];
				}
				B[j] = B[j] - cte * B[i];
			}
		}
		//almacenar en X las soluciones
		for (i = orden - 1; i >= 0; i--) {
			x[i] = B[i];
			for (j = orden - 1; j > i ; j--) {	
				x[i] = x[i] - (A[i][j] * x[j]);
			}
		}

		return x;
	}
}
