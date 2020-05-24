import java.awt.*;


class viadukt
{
  Graphics kLeinwand;
  Polygon ecken = new Polygon ();
  public  viadukt(Graphics kLeinwand, int zX, int zY,int zH, int zB){
    this.kLeinwand = kLeinwand;
    this.ecken.addPoint (zX, zY);
    this.ecken.addPoint (zX, zY-zH);
    this.ecken.addPoint (zX+zB, zY-zH);
    this.ecken.addPoint (zX+zB, zY);


    // oder fuenfeckig: (Koordinaten experimentell ermittelt)
    this.ecken.addPoint (zX + (int)(0.80*zB), zY);
    this.ecken.addPoint (zX + (int)(0.7*zB), zY - (int)(0.4*zH));
    this.ecken.addPoint (zX + (int)(0.5*zB), zY - (int)(0.6*zH));
    this.ecken.addPoint (zX + (int)(0.3*zB), zY - (int)(0.4*zH));
    this.ecken.addPoint (zX + (int)(0.20*zB), zY);
  }

public void zeichnen(){
  kLeinwand.setColor(Color.gray);
  kLeinwand.fillPolygon(ecken);

}

}
