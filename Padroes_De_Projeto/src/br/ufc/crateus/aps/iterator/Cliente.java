package br.ufc.crateus.aps.iterator;

public class Cliente {

	public static void main(String[] args) {
		ColecaoDeFilmes<Filmes> filme = new ColecaoDeFilmes<Filmes>(3);
		filme.put(new Filmes("Vingadores-Guerra Infinita"));
		filme.put(new Filmes("Vingadores-Era de Ultron"));
		filme.put(new Filmes("Homem de Ferro"));
		while(filme.hasNext()) {
			System.out.println(filme.next());
			filme.remove();
		}
		System.out.println();
		ColecaoDeMusicas<Musicas> music = new ColecaoDeMusicas<>(3);
		music.put(new Musicas.Builder("Calvin Harris", "Blame").duracao(4.04).tipo("Eletronica").builder());
		music.put(new Musicas.Builder("Jennifer Lopez", "dance again").duracao(4.02).tipo("Eletronica").builder());
		music.put(new Musicas.Builder("Alok", "Big Jet Plane").duracao(3.47).tipo("Eletronica").builder());
		while(music.hasNext()) {
			System.out.println(music.next());
		}
	}

}
