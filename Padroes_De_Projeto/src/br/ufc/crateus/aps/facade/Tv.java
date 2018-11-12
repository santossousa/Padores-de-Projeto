package br.ufc.crateus.aps.facade;

public class Tv {
	protected SistemaDeVideos video = new SistemaDeVideos();
	protected SistemaDeaudio audio = new SistemaDeaudio();

	public void configurandoCanais() {
		audio.configurarCanais();

	}

	public void configurandoFrequecia() {
		audio.configurarFrequencia();
	}

	public void configurandoVolume() {
		audio.configurarVolume();
	}
	public void configurandoImagem() {
		video.configurarResolucao();
	}
	public void configurandoCores() {
		video.configurarCores();
	}
	public void configurandoTv(String arquivo,String imagem) {
		audio.reproduzirAudio(arquivo);
		video.renderizarImagem(imagem);
		
	}

}
