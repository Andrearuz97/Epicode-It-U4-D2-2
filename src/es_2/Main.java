package es_2;

public class Main {
	public static void main(String[] args) {
		Sim sim = new Sim("3499806782");
		;
		sim.aggiornaCredito(10.0);
		sim.effettuaChiamata("3478906782", 5);
		sim.effettuaChiamata("3403838367", 2);
		sim.effettuaChiamata("3207645123", 19);
		sim.effettuaChiamata("3336747352", 11);
		sim.effettuaChiamata("3406677858", 6);
		sim.stampaDatiSim();
	}
}
