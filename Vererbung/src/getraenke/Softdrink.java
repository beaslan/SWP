package getraenke;

public class Softdrink extends Getraenke {
	private String geschmack;
	
	public Softdrink(String name, int menge, double preis,String geschamck) {
		super(name, menge, preis);
		
	}

	public String getGeschmack() {
		return geschmack;
	}
	public void zubereiten() {
        System.out.println(getName() + geschmack+" wird zubereitet...");

	

}
}
