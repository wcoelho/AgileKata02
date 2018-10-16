package kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayPoker {
	
	private List<Carta> cartas = new ArrayList<Carta>();
	private Carta carta;
	private List<String> valores = Arrays.asList("A","2","3","4","5","6","7","8","9","10","J","D","K");
	private List<String> naipes = Arrays.asList("D","H","S","C");
	
	public void criarCartas() {
		
		for (String valor : valores) {
			for(String naipe: naipes) {
				if(cartas.contains(carta)) {
					break;
				}
				carta = new Carta();
				carta.setNaipe(naipe);
				carta.setValor(valor);
			}
			cartas.add(carta);
		}
		
	}
	

}
