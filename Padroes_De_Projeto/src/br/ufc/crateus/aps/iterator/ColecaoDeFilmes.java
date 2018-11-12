package br.ufc.crateus.aps.iterator;

public class ColecaoDeFilmes<E> implements Iterator<E>, ColecaoGeneric<E> {
	private int cont = 0;
	private Filmes[] filmes;

	public ColecaoDeFilmes(int tam) {
		filmes = new Filmes[tam];

	}

	@Override
	public void put(E e) {
		filmes[cont++] = (Filmes) e;

	}

	@Override
	public boolean hasNext() {
		return cont > 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E next() {
		return (E) filmes[--cont];
	}

	@Override
	public void remove() {
		if (!isEmpty()) {
			for (int i = 0; i < cont; i++) {
				filmes[i] = filmes[i + 1];
			}
			filmes[cont] = null;
			cont--;
		}

	}

	private boolean isEmpty() {
		return cont == 0;
	}

}
