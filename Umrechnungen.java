/**
 * Praktikumsaufgabe Nr. 2.
 * Umrechnungen von diversen Einheiten in andere Einheiten.
 * @author Robin Palkovits
*/
public class Umrechnungen  {
    /**
     * Aufgabe 2.1
     * In dieser Klasse werden bestimmte Werte welche sich in einer Einheit
     * befinden in eine andere Einheit umgerechnet.
     * @param args wird nicht verwendet 
     */
    public static void main(String[] args ) {
        /*
        * Umrechnung von Fahrenheit in Celsius.
        * Normalformel: c = 5/9(f - 32)
        * Hier haben wir einmal 40 Grad Celsius.
        */
        System.out.println(5 * (40 - 32) / 9);
        /*
        * Und hier 41 Grad Celsius.
        */
        System.out.println(5 * (41 - 32) / 9);
        /*
        * Als nächstes soll ein Betrag der alten Waehrung Deutsche Mark in die
        * Waehrung Euro umgerechtet werden.
        *
        * Da Integer Zahlen allerding keine Kommazahlen darstellen, müssen wir
        * zunaechst unseren betragt muessen wir den betrag zunächst mit 100000
        * Multiplizieren
        * und später wieder dividieren.
        * Zunaechst ein Beispiel mit 100 DM.
        */
        System.out.println(100 * 100000 / 195583);
        /*
        * Und nun eine Umrechnung von 1000 DM.
        */
        System.out.println(1000 * 100000 / 195583);
	/*
	* Hier soll eine Minutenangabe im folgendem Format angezeigt werden:
	* h m m.
	*/
	System.out.println((5 / 60) * 100 + (5 % 60));
	System.out.println((59 / 60) * 100 + (59 % 60));
	System.out.println((60 / 60) * 100 + (60 % 60));
	System.out.println((61 / 60) * 100 + (61 % 60));
	System.out.println((825 / 60) * 100 + (825 % 60));
    }
}
