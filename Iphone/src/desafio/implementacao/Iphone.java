package desafio.implementacao;

import desafio.interfaces.AparelhoTelefonico;
import desafio.interfaces.NavegadorInternet;
import desafio.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	private String modelo;
	private int anoFabricacao;
	
	public Iphone() {}
	
	public Iphone(String modelo, int anoFabricacao) {
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	/* Métodos da interface NavegadorInternet */

	@Override
	public void exibirPagina(String pagina) {
		System.out.println("Exibindo a página " + pagina.toUpperCase() + "...");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba...");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}
	
	/* Métodos da interface AparelhoTelefonico */

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número " + numero + "...");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo à ligação...");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
	}
	
	/* Métodos da interface ReprodutorMusical */

	@Override
	public void tocar() {
		System.out.println("Tocando música...");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a música...");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a música " + musica.toUpperCase() + "...");
	}

	@Override
	public String toString() {
		return "Iphone [ modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + " s]";
	}
	
	
	
}
