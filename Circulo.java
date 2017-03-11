package circulo;

public class circulo {
	private double radius;
	private String color;

	public circulo(){
		radius = 1.0;
		color = "red";
	}
	public circulo (double r ){
		radius = r;	
		color = "red";
		}
public double getRadius (){
	return radius;
}
public double getArea (){
	return radius*radius*Math.PI;
	
}
public String getColor (){
	return color;
	
}
}
aplicacion
package circulo;

public class Circle {
public static void main (String [] args){
	

	circulo c1 new = circulo(2,azul);
	circulo c2 new = circulo(2,red);
	circulo c3 new = circulo(1,red);

			
System.out.println ("el radio del circulo es: "
+ c1.getRadius() "su area es: " + c1.getArea()
"su color es:" + c1.getColor() ;
					
			System.out.println ("el radio del circulo es: "
			+ c2.getRadius() "su area es: " + c.getArea()
			"su color es:" + c2.getColor() ;
							
			System.out.println ("el radio del circulo es: "
			+ c3.getRadius() "su area es: " + c3.getArea()
			"su color es:" + c3.getColor() ;
									
	
}
}
