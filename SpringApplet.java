package oscylator;

import javax.swing.JApplet;
import java.awt.*;

public class SpringApplet extends JApplet {
	
	public void init(){
		
		Vector2D vektor1 = new Vector2D(7.0, 5.0);
		Vector2D vektor2 = new Vector2D(8.0, 2.0);
		
		Vector2D suma_wektorow = new Vector2D();
		suma_wektorow = vektor1.suma(vektor2);
		
		Vector2D roznica_wektorow = new Vector2D();
		roznica_wektorow = vektor1.roznica(vektor2);
		
		Vector2D znormalizowany_wektor1 = new Vector2D();
		znormalizowany_wektor1 = vektor1.znorm_wektor();
		
		Vector2D znormalizowany_wektor2 = new Vector2D();
		znormalizowany_wektor2 = vektor2.znorm_wektor();
		
		double dlugosc_wektora1;
		dlugosc_wektora1 = vektor1.dlugosc();
		
		double dlugosc_wektora2;
		dlugosc_wektora2 = vektor2.dlugosc();
		
		double stala = 4;
		Vector2D iloczyn_wektorow = new Vector2D();
		iloczyn_wektorow = vektor1.iloczyn(stala);
		
		System.out.println("Wartoœæ pierwszego wektora wynosi: " + "("+vektor1.x +", " +vektor1.y+")");
		System.out.println("Wartoœæ drugiego wektora wynosi: "+ "("+vektor2.x + ", " + vektor2.y+")");
		System.out.println("Suma wektorów wynosi: (" + suma_wektorow.x + ", " + suma_wektorow.y + ")");
		System.out.println("Ró¿nica wektorow wynosi: (" + roznica_wektorow.x + ", " + roznica_wektorow.y + ")");
		System.out.println("Znormalizowany wektor pierwszy: (" + znormalizowany_wektor1.x + ", " + znormalizowany_wektor1.y+ ")");
		System.out.println("Znormalizowany wektor drugi: (" + znormalizowany_wektor2.x + ", " + znormalizowany_wektor2.y+ ")");
		System.out.println("D³ugoœæ pierwszego wektora wynosi: " + dlugosc_wektora1 );
		System.out.println("D³ugoœæ drugiego wektora wynosi: " + dlugosc_wektora2 );
		System.out.println("Iloczyn pierwszego wektora i sta³ej równej 4 wynosi: (" + iloczyn_wektorow.x +", "+ iloczyn_wektorow.y + ")");	
		
	}
	public void paint(){
		
	}

}
