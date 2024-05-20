package dispositivo;

import internet.NavegadorInternet;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	boolean ligado = false;
	
	public void exibirPagina(String url) {
		System.out.println("A página " + url + " está sendo exibida.");
	}

	public void adicionarNovaAba() {
		System.out.println("Uma nova aba foi adicionada.");		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página...\nA página atual foi atualizada.");		
	}

	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + "...");		
	}

	public void atender() {
		System.out.println("Ligação atendida.");		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...\nCorreio de voz inicilizado.");		
	}

	public void tocar() {
		System.out.println("O player está tocando");		
	}

	public void pausar() {
		System.out.println("Música pausada.");		
	}

	public void selecionarMusica(String musica) {
		System.out.println("Música " + musica + " selecionada.");		
	}
	
}
