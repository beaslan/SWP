package getraenke;

public class Getraenke {
	
	private String name;
	private int menge;
	private double preis;
	
	public Getraenke(String name, int menge, double preis) {
		super();
		this.name = name;
		this.menge = menge;
		this.preis = preis;
	}

	public String getName() {
		return name;
	}

	public int getMenge() {
		return menge;
	}

	public double getPreis() {
		return preis;
	}
	
	public void zubereiten() {
        System.out.println(name + " wird zubereitet...");
    }
	

}
