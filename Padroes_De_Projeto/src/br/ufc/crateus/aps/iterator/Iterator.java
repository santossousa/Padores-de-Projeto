package br.ufc.crateus.aps.iterator;

public interface Iterator<E>{
	boolean hasNext();
	E next();
	void remove();

}
