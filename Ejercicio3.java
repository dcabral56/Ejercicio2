import java.util.*;

public class Ejercicio3 {
	
	public int[] modaDeMatrizPorFila(int[][] matriz) {
		
		int filas = matriz.length,
				columnas = matriz[0].length,
				vectorResultado[] = new int[filas];
		HashMap<Integer, Integer> mapa = new HashMap<>();
		
		for (int i=0;i < filas;i++) {
			for (int j=0;j < columnas;j++) {
				//hash map cuento los valores de repeticion y los guardo en el valor
				int numero = matriz[i][j];
				if (mapa.containsKey(numero)) {
					mapa.put(numero, mapa.get(numero) + 1);
				} else {
					mapa.put(numero, 1);
				}
			}
			int moda = 0, mayor = 0;
			// TreeMap to store values of HashMap
			// TreeMap Ordena de manera natural sus claves
      TreeMap<Integer, Integer> sorted = new TreeMap<>();
      sorted.putAll(mapa);
			for (HashMap.Entry<Integer, Integer> entry : sorted.entrySet()) {
				//el que tenga mayor valor es el que tiene mas repeticiones
				if (entry.getValue() >= mayor ) {
						mayor = entry.getValue();
						moda = entry.getKey();						
				}
			}
			vectorResultado[i] = moda;
			mapa.clear();
		}
		
		return vectorResultado;
		
	}
	
	public static void main(String[] args) {
		int matrizTest[][] = { {1,2,3,4},{5,-6,-6,20},{10,1,1,10},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4} },
			filas = matrizTest.length;
		
		Ejercicio3 claseFuncion = new Ejercicio3();		
		int vectorTest[] = claseFuncion.modaDeMatrizPorFila(matrizTest);
		
		for (int i = 0;i < filas; i++) {
			System.out.print(vectorTest[i]);
			System.out.print(" ");
		}

	}
}
