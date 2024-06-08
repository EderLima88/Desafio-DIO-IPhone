package usuario;

import iPhone.iPhone;

public class Usuario {

	public static void main(String[] args) {
		
		iPhone iphone = new iPhone();
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();

	}

}
