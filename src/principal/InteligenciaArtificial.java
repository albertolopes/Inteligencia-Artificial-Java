package principal;

public class InteligenciaArtificial {
	
	public static void main(String[] args) {
		
		int tamanhoLabirinto = 2;
		
		String[][] labirinto = new String[tamanhoLabirinto][tamanhoLabirinto];
		
		/* Valores
		 * S - Sujo
		 * L - Limpo
		 * *A* - Agente
		 */
		
		//Construir o labirinto
		for (int x = 0; x < tamanhoLabirinto; x++) {
			for(int y = 0; y < tamanhoLabirinto; y++) {
				labirinto[x][y] = "S";
			}
		}
		
		for (int x = 0; x < tamanhoLabirinto; x++) {
			for(int y = 0; y < tamanhoLabirinto; y++) {
				System.out.print("| " + labirinto[x][y] + " |");
			}
			System.out.println("");
		}
	}
}
