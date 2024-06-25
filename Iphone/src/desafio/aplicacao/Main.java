package desafio.aplicacao;

import desafio.implementacao.Iphone;

public class Main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		/* Métodos de NavegadoInternet */
		
		iphone.exibirPagina("web.dio.me/home");
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();
		System.out.println();
		
		/* Métodos de AparelhoTelefonico */
		
		iphone.ligar("4002-8922");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		System.out.println();
		
		/* Métodos de ReprodutorMusical */
		
		iphone.selecionarMusica("Frieren The Slayer");
		iphone.tocar();
		iphone.pausar();
	}

}
