package ambiente;

import agente.AgenteLabirinto;
import geral.PosicaoXY;

public class Labirinto {
	
	private int tamanhoLabirinto;
	
	private String[][] labirinto;
	
	private AgenteLabirinto agente;
	
	/* Valores
	 * S - Sujo
	 * L - Limpo
	 * *A* - Agente
	 */
	
	public Labirinto(int tamanhoLabirinto) {
		this.tamanhoLabirinto = tamanhoLabirinto;
		this.construirNovoLabirinto();
	}
	
	//Construir o labirinto
	private void construirNovoLabirinto() {
		labirinto = new String[this.tamanhoLabirinto][this.tamanhoLabirinto];
		for (int x = 0; x < tamanhoLabirinto; x++) {
			for(int y = 0; y < tamanhoLabirinto; y++) {
				labirinto[x][y] = "S";
			}
		}
	}
	
	public void exibirLabirinto() {
		for (int x = 0; x < tamanhoLabirinto; x++) {
			for(int y = 0; y < tamanhoLabirinto; y++) {
				System.out.print("| " + labirinto[x][y] + " |");
			}
			System.out.println("");
		}
	}

	public int getTamanhoLabirinto() {
		return this.tamanhoLabirinto;
	}

	public String retornarValorPosicaoLabirinto(PosicaoXY posicao) {
		return this.labirinto[posicao.getPosX()][posicao.getPosY()];
	}

	public void setAgente(AgenteLabirinto agente) {
		this.agente = agente;
	}

	public void limpar() {
		PosicaoXY posicao = this.agente.getPosicao();
		labirinto[posicao.getPosX()][posicao.getPosY()] = "L";
	}
	
}
