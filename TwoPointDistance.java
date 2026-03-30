
package twopointdistance;

public class TwoPointDistance {

    public static void main(String[] args) {
       double x1 = 25.0;     
        double y1 = 35.0;    
        double x2 = 35.5;     
        double y2 = 25.5;     
        double raio = 6371.01;

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

       
        double distancia = raio * Math.acos(
                Math.sin(x1) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)
        );

        
        System.out.println("yo the distance between the two points is: " + distancia + " km");
    }
    
}
