import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;

public class Main {
    public static void main(String[] args) {


        Circle circle= new Circle(2.0);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

        Cylinder cylinder = new Cylinder(5.0,10.0);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getVolume());
    }
}