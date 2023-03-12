package getraenke;

public class Kaffee extends Getraenke {
	private String sorte;

	public Kaffee(String name, int menge, double preis,String sorte) {
		super(name, menge, preis);
		this.sorte = sorte;
		
	}

	public String getSorte() {
		return sorte;
	}
	public void zubereiten() {
        System.out.println(getName() + sorte+  " wird zubereitet...");

	
}
}
