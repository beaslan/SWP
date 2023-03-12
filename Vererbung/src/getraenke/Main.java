package getraenke;

public class Main {

	public static void main(String[] args) {
		Kaffee kaffee = new Kaffee("Kaffee", 250, 2.50, "Espresso");
		Softdrink softdrink = new Softdrink("Fanta",1000,2,"Limonade");
		kaffee.zubereiten();
		softdrink.zubereiten();

	}

}
