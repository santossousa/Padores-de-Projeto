package br.ufc.crateus.aps.facade;

public class SistemaFacade {
	private Tv tv = null;
	private Radio fm = null;

	public void inicializar() {
		tv = new Tv();
		System.out.println("***TV***");
		tv.configurandoCanais();
		tv.configurandoVolume();
		tv.configurandoCores();
		tv.configurandoImagem();
		tv.configurandoFrequecia();
		System.out.println();
		System.out.println("***Radio***");
		fm = new Radio();
		fm.configurandoFrequencia();
		fm.configurandoCanais();
		fm.configurandoVolume();
	}

	public void reproduzirTv(String arquivo, String imagem) {
		tv.configurandoTv(arquivo, imagem);

	}

	public void reproduzindoRadio(String arquivo) {
		fm.configurandoRadio(arquivo);
	}

}
