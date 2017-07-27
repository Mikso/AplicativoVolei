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
	private String nome = null;
	private Date dsnasc = null;
	private int idade = 0;
	private ArrayList<String> jogadores = new ArrayList<>();
	private ArrayList<Integer> idades = new ArrayList<>();
	private ArrayList<Date> datas = new ArrayList<>();
	
	public void inserirJogador(){
		Jogador jg = new Jogador();
		
		System.out.println("Hora de informar os jogadores, informe o primeiro player");
		jg.setNome(nome);
		jogadores.add(nome);
		jg.setIdade(idade);
		idades.add(idade);
		jg.setDsnasc(dsnasc);
		datas.add(dsnasc);
		
		System.out.println("Agora insira o segundo jogador");
		jg.setNome(nome);
		jogadores.add(nome);
		jg.setIdade(idade);
		idades.add(idade);
		jg.setDsnasc(dsnasc);
		datas.add(dsnasc);
		
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
	
	
}
