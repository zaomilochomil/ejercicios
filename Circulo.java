public class Circulo {

    private double radius;
    private String color;
    
    Circulo(){
        
    }
    public Circulo(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    

}
aplicacion

public class Circle extends Circulo{

    public Circle() {
    }

    public Circle(double radius, String color) {
        super(radius, color);
    }

    public double  radio(double radius){
    return radius;
}
    
    
    public double area(double getRadius){
        double Area=Math.PI*(getRadius*getRadius);
        return Area;
    }
    
}
