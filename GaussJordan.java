/**
*	GaussJordan.java
*	Created on 22 November 2013, 11:13 hrs.
*	A simple class wich uses Gauss-Jordan method.
*/

/**
*	@author: Equipo8
*
*			 -> Trejo Juárez César Alberto______________cesaralberto at yandex.com or cesaratj27 at gmail.com
*			 -> Hernández Cuecuecha Jorge Alberto
*			 -> Servín Lucario Verónica Valeria
*			 -> José Alberto
*
*
*/

public class GaussJordan extends Gauss{
	//Constructor
	public GaussJordan(int n){
		super(n);
	}

	//Métodos
	@Override
	public float getX(){ //Sobreescribimos el método
		int i,j,k;

		for (i = 0; i < A.length; i++) {
			//Asegurar la inexistencia de 0's en diagonal principal
			if (A[i][i] == 0) {
				System.out.println("Exists 0 in diagonal");
				return -1;
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

			//Eliminación inversa
			for (i = A.length-1; i >= 0; i--) {
				for (j = i - 1; j >= 0; j--) {
					cte = A[j][i];
					A[j][i] = A[j][i] - cte * A[i][i];
					B[j] = B[j] - cte * B[i];
				}
			}
			//Fin eliminación inversa

			//mostrar solución
			System.out.println("Solutions: ");
			for (i = 0; i < A.length; i++) {
				for (j = 0; j < A.length ; j++) {
					System.out.print(A[i][j] + "\t");
				}
				System.out.println("|" + B[i]);
			}
		}
		return 0;
	}
}
