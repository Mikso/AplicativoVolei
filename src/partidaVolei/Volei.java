/**
 * 
 */
package partidaVolei;

import java.util.Date;

import jogoVolei.Jogo;

/**
 * @author Bruno
 *
 */
public class Volei{
	private Date dtpartida;
	private String nomeGanhador;
	
	
	public Date getDtpartida() {
		return dtpartida;
	}
	public void setDtpartida(Date dtpartida) {
		this.dtpartida = dtpartida;
	}
	public String getNomeGanhador() {
		return nomeGanhador;
	}
	public void setNomeGanhador(String nomeGanhador) {
		this.nomeGanhador = nomeGanhador;
	}
}
