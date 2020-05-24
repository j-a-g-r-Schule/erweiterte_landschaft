
/**
 * Anwendung für PLeinwand01
 *
 * @author (Mönter)
 * @version (PLeinwand01 V.01)
 */

import java.awt.*;

public class LeinwandAnwendung
{
    // Deklaration der Variablen

    private FrmZeichnen hZeichenfenster;
    private Graphics kLeinwand;

    /**
     * Konstruktor
     */

    public LeinwandAnwendung()
    {
        // Initialisierung
        hZeichenfenster = new FrmZeichnen ();               // erstellt ein Zeichenfenster
        hZeichenfenster.setVisible (true);                  // schatet das Zeichenfenster sichtbar
        kLeinwand = hZeichenfenster.getGraphics();          // weist der entsprechenden Variablen die Leinwand des Zeichenfensters zu
    }

    /**
     * Methoden
     */

    public void leinwandZeichnen()
    {

        Polygon Ecken;                                          // erstellt eine temporäre Variable "Ecken" des Typs Polygon
        int x0, y0, h0, w0;                                     // erstellt 4 temporäre Variablen des Typs Integer

        x0 = hZeichenfenster.getInsets().left;                  // weist x0 den Pixelwert der inneren linken Ecke des Fensters zu
        y0 = hZeichenfenster.getInsets().top;                   // weist y0 den Pixelwert der inneren oberen Ecke des Fensters zu
        h0 = hZeichenfenster.getSize().height;                  // weist h0 den Pixelwert der Fensterhöhe zu
        w0 = hZeichenfenster.getSize().width;                   // weist w0 den Pixelwert der Fensterbreite zu

        // Himmel erzeugen --> Polygon erzeugen

        Ecken = new Polygon();
        Ecken.addPoint (x0, y0);                                // erste Ecke
        Ecken.addPoint (x0, y0+(int)(h0/3));                    // zweite Ecke
        Ecken.addPoint (w0, y0+(int)(h0/6));                    // dritte Ecke
        Ecken.addPoint (w0, y0);                                // vierte Ecke

        // Himmel erzeugen --> Polygon einfärben

        kLeinwand.setColor (new Color (128, 255, 255));         // Farbwahl auf nicht vordefinierte Farbe "hellblau"
        kLeinwand.fillPolygon (Ecken);                          // füllen des Polygonzuges mit der voreingestelletn Farbe

        // Wiese erzeugen --> Polygon erzeugen

        Ecken = new Polygon();
        Ecken.addPoint (x0, y0+(int)(h0/3));
        Ecken.addPoint (x0, h0);
        Ecken.addPoint (w0, h0);
        Ecken.addPoint (w0, y0+(int)(h0/6));

        // Wiese erzeugen --> Polygon einfärben

        kLeinwand.setColor (Color.green);                       // Farbwahl auf vordefinierte Farbe "grün"
        kLeinwand.fillPolygon (Ecken);

    }

    public void landschaftZeichnen()
    {
      blume[] blumen;
      blumen = new blume[3];
      blumen[0] = new blume(kLeinwand, Color.red, 200, 200);
      blumen[0].zeichnen();
      blumen[1] = new blume(kLeinwand, Color.red, 220, 200);
      blumen[1].zeichnen();
      blumen[2] = new blume(kLeinwand, Color.red, 210, 230);
      blumen[2].zeichnen();

      viadukt[] bruecke;
      bruecke = new viadukt[4];
      bruecke[0] = new viadukt(kLeinwand,0,150,15,30);
      bruecke[0].zeichnen();
      bruecke[1] = new viadukt(kLeinwand,30,150,15,30);
      bruecke[1].zeichnen();
      bruecke[2] = new viadukt(kLeinwand,60,150,15,30);
      bruecke[2].zeichnen();
      bruecke[3] = new viadukt(kLeinwand,90,150,15,30);
      bruecke[3].zeichnen();

}

}
