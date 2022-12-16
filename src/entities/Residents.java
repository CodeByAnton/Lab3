package entities;

import object.Baloon;
import object.Bush;

public class Residents extends Entity implements Comeable, Watchable, Wantable, Tryable {
    public Residents(String name){
        super(name);
    }

    @Override
    public void action() {

    }
    @Override
    public void come(){
        System.out.println(getName()+" приходили");
    }

    @Override
    public void watch(Baloon baloon, Bush bush) {
        System.out.println(getName()+" смотрели на огромнейший "+baloon.getName()+", который был привязан к "+bush.getName());
    }

    @Override
    public void want(Baloon baloon) {
        System.out.println(getName()+" хотели потрогать "+baloon.getName()+" руками");
    }

    @Override
    public void trying(Baloon baloon) {
        System.out.println("Некоторые "+getName()+" пытались приподнять "+baloon.getName());
    }
}
