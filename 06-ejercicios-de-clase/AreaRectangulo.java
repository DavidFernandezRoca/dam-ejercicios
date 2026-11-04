// Función que calcula el área de un rectángulo a partir de su base y su altura.

public class AreaRectangulo{
    public static void main(String args[]){
        System.out.println(areaRectangulo(1.5, 3.2));
    }
    public static double areaRectangulo(double base, double altura){
        double area;
        area = base * altura;
        return(area);
    }
}
