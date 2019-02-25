package cz.uhk.anongui.nested;

public class TydenSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tyden tyden = new Tyden();
		
		for (String den : tyden) {
			System.out.println(den);
		}
	}

}
