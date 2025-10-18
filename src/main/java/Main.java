import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {

        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(1212,"Ahmet",25000);
        JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[5];
        MidDeveloper[] midDevelopers = new MidDeveloper[5];
        SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[5];

        HRManager hrManager = new HRManager(1213,"Ayşe",30000,juniorDevelopers,midDevelopers,seniorDevelopers);

        hrManager.addEmployee(1,juniorDeveloper1);
        hrManager.addEmployee(1,juniorDeveloper1);

        System.out.println(hrManager.toString());


    }
}