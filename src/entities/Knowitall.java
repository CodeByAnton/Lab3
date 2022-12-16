package entities;
import objects.Baloon;
import objects.Bush;
public class Knowitall extends AbstractEntity implements Orderedable {
    public Knowitall(String name){
        super(name);
    }

    public void tiedsmth(Baloon baloon,Bush bush){
        System.out.println(getName()+" привязал "+baloon.getName()+" верёвкой к "+bush.getName()+", " +
                "чтобы "+baloon.getName()+" не " + "унесло ветром");
    }
    public void dividedPeople(String persons){
        System.out.println(getName()+" поделил "+persons+" на два отряда");
    }
    @Override
    public void order(AbstractEntity name, Item item){
        switch (item){
            case COCOONS:
                System.out.println(getName()+" велел "+name.getName()+" собрать шелковинчные коконы");
                break;
            case NET:
                System.out.println(getName()+" велел "+name.getName()+" собрать шелковинчные коконы");
                break;
            case THREAD:
                System.out.println(getName()+" велел "+name.getName()+" наделать шекловых нитей");
                break;
            case LARGEBASKET:
                System.out.println(name.getName()+" "+getName()+" велел сделать большую корзину");
                break;
        }
    }
    @Override
    public void action(){
        System.out.println(getName()+ " занимался работой");
    }
}
