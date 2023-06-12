package controller;

public class Ruota {
	private String[] images= {"prima.jpg", "seconda.jpg","terza.jpg","quarta.jpg"};
	private String[] links= {"http://www.gazzetta.it", "http://www.corriere.it", "http://www.lastampa.it", "http://www.repubblica.it"};
	
	private int indice=0;
	
	public String getImage() {
		return images[indice];
	}
	public String getLink() {
		return links[indice];
	}
	
	public void avanza() {
		indice = (indice+1) %  images.length;
	}
}
