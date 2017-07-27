/**
 * 
 */
package jogadorVolei;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Bruno
 *
 */

public class Jogador {
	private String nome;
	private Date dsnasc;
	private int idade;
	private ArrayList<String> jogadores = new ArrayList<>();
	
	public void inserirJogador(){
		Jogador jg = new Jogador();
		
		System.out.println("Hora de informar os jogadores");
		
		
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDsnasc() {
		return dsnasc;
	}
	public void setDsnasc(Date dsnasc) {
		this.dsnasc = dsnasc;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public ArrayList<String> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<String> jogadores) {
		this.jogadores = jogadores;
	}
	
	
}
