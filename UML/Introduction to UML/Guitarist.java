public class Guitarist extends Person implements MusicPlayer {
	Guitar favoriteGuitar;
	
	public Guitarist(String name) {
		super(name);
	}

	// A couple of local methods for accessing the class's properties
	public void setInstrument(Instrument instrument) {
		if (instrument instanceof Guitar) {
			this.favoriteGuitar = (Guitar) instrument;
		} else {
			System.out.println("I'm not playing that thing!");
		}
	}
...
