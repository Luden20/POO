import java.awt.*;
import java.applet.*;

class Piramide {
    private double Lado;
    private double Altura;
    
    public void Seteo(double l, double h) {
        this.Lado = l;
        this.Altura = h;
    }   
    public void Visualizar(Graphics g) {
        g.drawString("Lado: " + String.format("%.2f", Lado), 500, 10);
        g.drawString("Altura: " + String.format("%.2f", Altura), 500, 30);
        g.drawString("Area: " + String.format("%.2f", CalcularArea()), 500, 50);
        g.drawString("Volumen: " + String.format("%.2f", CalcularVolumen()), 500, 70);
    }
    public double  CalcularArea() {
        return (4*((Apotema()*Lado)/2))+(Lado*Lado);
    }
    public double CalcularVolumen()
    {
    	return (Lado*Lado*Altura)/3;
    }
    public double Apotema() {
        return Math.sqrt((Altura * Altura) + ((Lado * Lado) / 4));
    }
    public void Graficar(Graphics g)
    {
    	int A1x=10,A1y=50+(int)Apotema()*10;
    	int A2x=10+(int)Lado*10,A2y=A1y;
    	int A3x=A1x+(int)Lado*10/2,A3y=A1y-(int)Lado*10/2;
    	int A4x=A3x+(int)Lado*10,A4y=A3y;
    	int A5x=(int)(A1x+A4x)/2,A5y=(int)(A1y+A4y)/2;
    	int A6x=A5x,A6y=(int)A5y-(int)Apotema()*10;
    	System.out.print(A1y);
    	//La base se dibuja como un paralelogramo por la perspectiva
    	g.drawLine(A1x,A1y,A2x,A2y);
    	g.drawLine(A1x,A1y,A3x,A3y);
    	g.drawLine(A3x,A3y,A4x,A4y);
    	g.drawLine(A2x,A2y,A4x,A4y);
    	//Se unen las esquinas en un punto para completar la piramide
    	g.drawLine(A1x,A1y,A6x,A6y);
    	g.drawLine(A2x,A2y,A6x,A6y);
    	g.drawLine(A3x,A3y,A6x,A6y);
    	g.drawLine(A4x,A4y,A6x,A6y);  	
    }
}
public class Trabajo1 extends Applet {
    private Piramide x; 
    public void init() {
        x = new Piramide(); 
        x.Seteo(50,100);
        double Vol=x.CalcularVolumen();
        double Ar=x.CalcularArea();
    }
    public void paint(Graphics g) {
        x.Visualizar(g);
        x.Graficar(g);
    }
}
