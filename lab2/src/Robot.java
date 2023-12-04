public class Robot implements RunJump {
    String Name;
    double Maxjump;
    int Maxrundist;
    @Override public double getMaxjump() {
        return Maxjump;
    }

    @Override public int getMaxrundist() {
        return Maxrundist;
    }
    public Robot(String name, double maxjump, int maxrundist){
        this.Name=name;
        this.Maxjump= maxjump;
        this.Maxrundist= maxrundist;
    }
    @Override
    public void jump(double jumpdist) {
        if (jumpdist<0){
            System.out.println("Неправильное значение");
        }
        else if (jumpdist<=Maxjump) {
            System.out.println(Name + " Перепрыгрул стену " + jumpdist + " м" );
        }
        else if (jumpdist>Maxjump){
            System.out.println(Name + " Не смог перепрыгнуть стену "+ jumpdist + " м");
        }
    }
    @Override
    public void run(int rundist) {
        if (rundist<0) {
            System.out.println("Неправильное значение");
        }
        else if (rundist<=Maxrundist) {
            System.out.println(Name + " Пробежал дистанцию "+ rundist + " м");
        }
        else if (rundist>Maxrundist) {
            System.out.println(Name + " Не смог пробежать дистанцию " + rundist + " м");
        }
    }
}
