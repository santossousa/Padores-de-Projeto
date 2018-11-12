package br.ufc.crateus.aps.iterator;

public class Musicas {
	private String autor;
	private String nome;
	private String tipo;
	private double duracao;
	private Musicas(Builder builder) {
		this.autor = builder.autor;
		this.nome = builder.nome;
		this.tipo = builder.tipo;
		this.duracao = builder.duracao;
	}
	@Override
	public String toString() {
		return "autor :" + autor + ", nome : " + nome + ", tipo : " + tipo + ", duracao : " + duracao + "";
	}
	static class Builder{
		private String autor;
		private String nome;
		private String tipo;
		private double duracao;
		public Builder(String autor,String nome) {
			this.autor = autor;
			this.nome = nome;
		}
		public Builder tipo(String tipo) {
			this.tipo = tipo;
			return this;
		}
		public Builder duracao(double duracao) {
			this.duracao = duracao;
			return this;
		}
		public Musicas builder() {
			return new Musicas(this);
		}
		
	}

}
