package futbol;

public class Jugador extends Futbolista {

	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}

	public Jugador() {
		super();
		this.dorsal=7;
		this.golesMarcados=289;
	}
	
	public  boolean jugarConLasManos() {
		return false;
	}
	
	public int compareTo(Object f) {
		return super.getEdad()-((Futbolista)f).getEdad();
	}
	
	public String toString() {
		return "El futbolista " + super.getNombre() + " tiene " + super.getEdad() + ", y juega de " + super.getPosicion()+" con el dorsal "+dorsal+". Ha marcado " +golesMarcados;
	}
	
}
