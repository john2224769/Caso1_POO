package modelo;

public class Circulo
{
    // atributos
    private double radio;
    private double perimetro;
    private double area;

    // metodos 
    public void setRadio(double radio)
    {
        this.radio=radio;
    }
    
    public void calcularArea ()
    {
        area=Math.PI*(radio*radio);
    }

    public void calcularPerimetro()
    {
        perimetro=2*Math.PI*radio;
    }

    public double getArea()
    {
        return area;
    }

    public double getPerimetro()
    {
        return perimetro;
    }

}