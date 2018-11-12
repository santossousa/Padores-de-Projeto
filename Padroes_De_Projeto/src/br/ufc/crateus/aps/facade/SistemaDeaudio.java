package br.ufc.crateus.aps.facade;

public class SistemaDeaudio {
	
	
	public void configurarFrequencia() {
		System.out.println("Frequencia configurada");
	}
	public void configurarVolume() {
		System.out.println("Volume configurado");
	}
	public void configurarCanais() {
		System.out.println("Canais Configurados");
	}
	public void reproduzirAudio(String arquivo) {
		System.out.println("Reproduzindo ..."+arquivo);
	}

}
