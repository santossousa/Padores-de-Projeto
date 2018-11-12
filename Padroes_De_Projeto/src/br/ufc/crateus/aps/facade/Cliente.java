package br.ufc.crateus.aps.facade;

public class Cliente {
	public static void main(String[] args) {
		/*
		 * o padrao facade foi usado nos sistemas de audio,Tv,Radio e Videos, foi criado
		 * uma classe facade para configurar os sistemas
		 * 
		 */
		SistemaFacade facade = new SistemaFacade();
		System.out.println("###Configurandos subsistemas Facade###");
		facade.inicializar();
		System.out.println();
		System.out.println("Subsistema Tv");
		facade.reproduzirTv("som.mp4", "imagem.png");
		System.out.println();
		System.out.println("Subsistema Radio");
		facade.reproduzindoRadio("music.mp4");

	}

}
