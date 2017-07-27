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
public class Volei extends Jogo{
	private Date dtpartida = null;
	private String nomeGanhador = null;
	
	
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
