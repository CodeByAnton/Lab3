package entities;
public class FirstSquad extends Entity {
    public FirstSquad(String name){
        super(name);
    }
    @Override
    public void action(){
        System.out.println(getName()+" выполнял работу");
    }
}

