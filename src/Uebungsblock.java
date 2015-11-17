public class Uebungsblock {

	// Achtung: Zur Ausfuehrung des Programms muss das Uebungstools.jar
	// eingebundenwerden. Die Anleitung finden Sie in den Folien zu dieser
	// Uebung: https://github.com/nordakademie-einfuehrung-java/vorlesungsskript/blob/master/folien/Semester_03_Termin_05_Uebungsblock_01-04.ppt

	/**
	 * Die Mainmethode ermoeglicht den Aufruf der einzelnen Uebungen ueber einen Abfragedialog
	 */
	public static void main(String[] args) {

		boolean ende = false;
		while (!ende) {

			int nr = Eingabe.frageNachIntUeberDialog("Bitte Uebungsnr eingeben (1-7, 0 zum Beenden):");

			Zeichenfenster.zeigeZeichenfenster();
			Zeichenfenster.clearZeichenfenster();
			Zeichenfenster.setzeFarbeSchwarz();

			if (nr == 1) {
				uebung1();
			}
			if (nr == 2) {
				uebung2();
			}
			if (nr == 3) {
				uebung3();
			}
			if (nr == 4) {
				uebung4();
			}
			if (nr == 5) {
				uebung5();
			}
			if (nr == 6) {
				uebung6();
			}
			if (nr == 7) {
				uebung7();
			}
			if (nr == 0) {
				System.exit(0);
			}
		}

	}

	public static void uebung1() {
		// TODO Implementieren Sie die Uebung 1
		Zeichenfenster.zeichnePunkt(100, 100);
		Zeichenfenster.zeichnePunkt(110, 100);
		Zeichenfenster.zeichnePunkt(120, 100);
		Zeichenfenster.zeichneLinie(100, 200, 700, 200);
		Zeichenfenster.zeichneLinie(100, 200, 100, 550);
		Zeichenfenster.zeichneLinie(700, 200, 700, 550);
		Zeichenfenster.zeichneLinie(100, 550, 700, 550);
		Zeichenfenster.zeichneEllipse(400, 375, 600, 350);
		
	}

	public static void uebung2() {
		// TODO Implementieren Sie die Uebung 2
		
		for(int x = 0; x <= 800; x = x + 10)
		{Zeichenfenster.zeichneLinie(x , 0, 0, x);}
	}

	public static void uebung3() {
		// TODO Implementieren Sie die Uebung 3
		
		for(int x = 200; x <= 500; x = x + 5)
		{Zeichenfenster.zeichneEllipse(x, 400, x-100, x-100);}
	}

	public static void uebung4() {
		// TODO Implementieren Sie die Uebung 4
		
		for(int x = 0; x <= 600; x = x + 10)
		{Zeichenfenster.zeichneEllipse(400, 400, 800-x, 200+x);}
	}

	public static void uebung5() {
		// TODO Implementieren Sie die Uebung 5
		
		for(int x = 0; x <= 800; x = x + 8){
		Zeichenfenster.zeichneLinie(0+x, 0, 800, 0+x);
		Zeichenfenster.zeichneLinie(0, 800-x, 0+x, 0);
		Zeichenfenster.zeichneLinie(0, 0+x, 0+x, 800);
		Zeichenfenster.zeichneLinie(0+x, 800, 800, 800-x);
		}
	}

	public static void uebung6() {
		// TODO Implementieren Sie die Uebung 6
		
	}

	public static void uebung7() {
		// TODO Implementieren Sie die Uebung 7
	}

}
