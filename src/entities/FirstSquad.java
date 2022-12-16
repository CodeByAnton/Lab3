package entities;
public class FirstSquad extends AbstractEntity {
    public FirstSquad(String name){
        super(name);
    }
    @Override
    public void action(){
        System.out.println(getName()+" выполнял работу");
    }
}

