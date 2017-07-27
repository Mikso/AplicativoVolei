/**
 * 
 */
package jogoVolei;

import java.util.Scanner;

import jogadorVolei.Jogador;


/**
 * @author Bruno
 *Teste
 */
public class Jogo extends Jogador{
	private int numero;
	private Scanner ler = new Scanner(System.in);
	
	public void iniciarJogo(){
		System.out.println("Partida de numero?");
		numero = ler.nextInt();
		setNumero(numero);
		
	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
