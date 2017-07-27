/**
 * 
 */
package jogoVolei;

import java.util.Scanner;
import jogadorVolei.Jogador;

/**
 * @author Bruno
 * Testando o caso
 *
 */
public class Jogo {
	private int numero = 0;
	private Scanner ler = new Scanner(System.in);
	
	public void iniciarJogo(){
		System.out.println("Partida de numero?");
		numero = ler.nextInt();
		setNumero(numero);
		
		
		Jogador n = new Jogador();
		n.inserirJogador();
	
	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
