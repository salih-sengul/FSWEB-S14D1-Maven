import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {


        Rectangle rectangle= new Rectangle(5.0,2.0);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getArea());

        Cuboid cuboid = new Cuboid(5.0,2.0,3.0);
        System.out.println(cuboid.getHeight());
        System.out.println(cuboid.getVolume());
    }
}