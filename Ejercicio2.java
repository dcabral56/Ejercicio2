
public class Ejercicio {

	public int[][] devolverMatrizSuma(int[][] matriz){
		
		int rows = matriz. length;
		int coloumns = matriz[0]. length;
		
		int[][] nuevaMatriz = new int[rows][coloumns];
		for(int i=0;i<rows;i++ ){
			for(int j=0;j<coloumns;j++){
				nuevaMatriz[i][j] = matriz[i][j];
				if(i-1 >= 0){
					nuevaMatriz[i][j] += matriz[i-1][j];
				}
				if(j-1 >= 0){
					nuevaMatriz[i][j] += matriz[i][j-1];
				}
				if(i+1 < rows){
					nuevaMatriz[i][j] += matriz[i+1][j];
				}
				if(j+1 < coloumns){
					nuevaMatriz[i][j] += matriz[i][j+1];
				}
			}
		}

		return nuevaMatriz;
		
	}

	
	public static void main(String[] args) {
		
		int[][] test = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		Ejercicio miEjercicio = new Ejercicio();
		int[][] nuevaMatriz = miEjercicio.devolverMatrizSuma(test);
		
		int rows = nuevaMatriz. length;
		int coloumns = nuevaMatriz[0]. length;
		
		for(int i=0;i<rows;i++ ){
			for(int j=0;j<coloumns;j++){
				System.out.print(nuevaMatriz[i][j]);
				System.out.print(' ');
			}
			System.out.println('\n');
		}
		
	}
}
