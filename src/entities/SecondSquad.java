package entities;

public class SecondSquad extends Entity {
    public SecondSquad(String name){
        super(name);
    }

    @Override
    public void action() {
        System.out.println(getName()+" выполнял работу");
    }
}
