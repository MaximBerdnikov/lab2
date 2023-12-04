import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Human human1 = new Human("человек1", 1.3, 600);
        Human human2 = new Human("человек2", 1.7, 1200);
        Human human3 = new Human("человек3", 2.2, 3500);
        Robot robot1 = new Robot("робот1", 2, 10000);
        Robot robot2 = new Robot("робот2", 5.5, 1000);
        Cat cat1 = new Cat("кот1", 3.3, 200);
        ArrayList<RunJump> creatures = new ArrayList<>();
        creatures.add(human1);
        creatures.add(human2);
        creatures.add(human3);
        creatures.add(robot1);
        creatures.add(robot2);
        creatures.add(cat1);
        ArrayList<Obstructions> obstr = new ArrayList<>();
        Treadmill treadmill1 = new Treadmill(700);
        Treadmill treadmill2 = new Treadmill(2000);
        Treadmill treadmill3 = new Treadmill( 3000);
        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(2);
        Wall wall3 = new Wall(5);
        obstr.add(treadmill1);
        obstr.add(treadmill2);
        obstr.add(treadmill3);
        obstr.add(wall1);
        obstr.add(wall2);
        obstr.add(wall3);
        int j;
        for(int i = 0;i<creatures.size();i++){
            for (j = 0;j<3;j++){
                creatures.get(i).run(obstr.get(j).getdist());
                if(creatures.get(i).getMaxrundist()< obstr.get(j).getdist()){
                    break;
                }
                creatures.get(i).jump(obstr.get(j+3).getdist());
                if(creatures.get(i).getMaxjump()< obstr.get(j+3).getdist()){
                    break;
                }
            }
        }
    }
}