import entities.*;
import object.Baloon;
import object.Bush;

public class Main {
    public static void main(String[] args){
        Knowitall knowitall=new Knowitall("Знайка");
        FirstSquad firstsquad=new FirstSquad("Первому отряду");
        SecondSquad secondsquad=new SecondSquad("Второму отряду");
        Residents residents=new Residents("Жители Цветочного города");
        Bush bush=new Bush("ореховому кусту");
        Baloon baloon=new Baloon("шар");
        knowitall.tiedsmth(baloon,bush);
        knowitall.dividedPeople("малышей");
        knowitall.order(firstsquad, Item.COCOONS);
        knowitall.order(firstsquad, Item.THREAD);
        knowitall.order(firstsquad, Item.NET);
        knowitall.order(secondsquad, Item.LARGEBASKET);
        knowitall.action();
        firstsquad.action();
        secondsquad.action();
        residents.come();
        residents.watch(baloon,bush);
        residents.want(baloon);
        residents.trying(baloon);


    }
}
