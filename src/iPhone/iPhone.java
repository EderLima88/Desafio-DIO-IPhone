package iPhone;

import mp3Player.mp3Player;
import navegadorInternet.navegadorInternet;
import telefone.telefone;

public class iPhone implements mp3Player, telefone, navegadorInternet{

		
	@Override
	public void tocar() {
		System.out.println("Tocando musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica");
		
	}
	
	@Override
	public void ligar() {
		System.out.println("Fazendo ligacao");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo Telefone");
		
	}
	
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Inicinado correio de voz");
		
	}


	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina de intenet");
	
}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando pagina de intenet");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina de intenet");
		
	}
}