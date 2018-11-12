package br.ufc.crateus.aps.facade;

public class Radio {
	private SistemaDeaudio audio = new SistemaDeaudio();
	public void configurandoFrequencia() {
		audio.configurarFrequencia();
	}
	public void configurandoVolume() {
		audio.configurarVolume();
	}
	public void configurandoCanais() {
		audio.configurarCanais();
	}
	public void configurandoRadio(String arquivo) {
		audio.reproduzirAudio(arquivo);
	}

}
