package getraenke;

public class Softdrink extends Getraenke {
	private String geschmack;
	
	public Softdrink(String name, int menge, double preis,String geschmack) {
		super(name, menge, preis);
		this.geschmack = geschmack;
		
	}

	public String getGeschmack() {
		return geschmack;
	}
	public void zubereiten() {
        System.out.println(getName() +" "+ geschmack +" wird zubereitet...");

	

}
}
