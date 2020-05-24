import java.awt.*;


class blume
{
  Color Farbe;
  int x;
  int  y;
  Graphics kLeinwand;
  
  public  blume(Graphics kLeinwand,Color Farbe, int x, int y){
    this.kLeinwand = kLeinwand;
    this.Farbe = Farbe;
    this.x = x;
    this.y = y;
  }

  public void zeichnen(){
    kLeinwand.setColor(this.Farbe);
    kLeinwand.fillOval(x,y, 10, 10);
  }

}
