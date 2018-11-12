package br.ufc.crateus.aps.proxy;

public interface Internet {
	void connect(String server) throws Exception;
	void add(String hostname,String ip);
	void ListSite();
	
}
