package br.ufc.crateus.aps.iterator;

public class ColecaoDeMusicas<E> implements Iterator<E>, ColecaoGeneric<E> {

	private int cont = 0;
	private Musicas[] musicas;

	public ColecaoDeMusicas(int tam) {
		musicas = new Musicas[tam];

	}

	@Override
	public void put(E e) {
		musicas[cont++] = (Musicas) e;

	}

	@Override
	public boolean hasNext() {
		return cont > 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E next() {
		return (E) musicas[--cont];
	}

	@Override
	public void remove() {
		if (!isEmpty()) {
			for (int i = 0; i < cont; i++) {
				musicas[i] = musicas[i + 1];

			}
			musicas[cont] = null;
			cont--;
		}

	}

	private boolean isEmpty() {
		return cont == 0;
	}

}
