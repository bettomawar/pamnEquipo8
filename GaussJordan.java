/**
*	GaussJordan.java
*	Created on 22 November 2013, 11:13 hrs.
*	A simple class wich uses Gauss-Jordan method.
*	@see Gauss.java 
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
*			 -> Trejo Juárez César Alberto		contact:   cesaralberto@yandex.com / cesaratj27@gmail.com
*			 -> Hernández Cuecuecha Jorge Alberto
*			 -> Servín Lucario Verónica Valeria
*			 -> Martínez Lara José Alberto
*			 -> Fajardo Álvarez Samuel
*			 -> Sebastian Cuatepotzo
*
*/

public class GaussJordan extends Gauss{
	//Constructor
	public GaussJordan(int n){
		super(n);
	}
	
	//Métodos
	@Override  //Sobreescribimos el método
	public double[] getX(){
		int i,j,k;
		double temp[] = new double [orden];
		double tm = 0;

		//mostrar matriz ingresada...-----------------
		System.out.println("-->Your matrix: ");
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
			//Asegurar la inexistencia de 0's en diagonal principal
			if (A[i][i] == 0) {
				System.out.println(">>>Exists 0 in diagonal<<<");
				break; //falta intercambiar renglones
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
		//Eliminación inversa
			for (i = orden-1; i >= 0; i--) {
				for (j = i - 1; j >= 0; j--) {
					cte = A[j][i];
					A[j][i] = A[j][i] - cte * A[i][i];
					B[j] = B[j] - cte * B[i];
				}
			}
		//Fin eliminación inversa
		return B;
	}	
}