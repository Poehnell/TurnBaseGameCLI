package Enemys;


public class Goblin extends Enemy{


    public Goblin(){
        super("Goblin","\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░▀█▄▄░░░░░░░░░░░░░░░░░░░\n" +
                "░██▄▄░░░░░▀▄░▀▀█▄░░░░░░░░░░░░░░░\n" +
                "░░▀██▀█▄░░░░▀█░░░▀█░░░░░░░░░░░░░\n" +
                "░░░░█░░░██▄██▀▀▀▀▀▀▀█▄░░░░░░░░░░\n" +
                "░░░░░▐░░░░███░░░░░░░░░▀█░░░░░░░░\n" +
                "░░░░░░█░░░░██▄▄░░░▀▀██▄░▌░░░░░░░\n" +
                "░░░░░██░░░░░░██▌░░░░███▀█░░░░░░░\n" +
                "░░░░░██░░░░░░░█▌░░░░░░░░░▀█▄░░░░\n" +
                "░░░░░░███▄░░▄███▄░░░░░░▌░░░░▀█░░\n" +
                "░░░░░░░▐█▀▀▀░▄████▄▄▄░░░▀▀██▀░░░\n" +
                "░░░░█▀█░░░░░░░███████▌░░░░░█░░░░\n" +
                "░░██░░░░░░░░░░░░█████▄░░────█░░░\n" +
                "░█░░░░░░░░░░░░▀███░░░██░░░░░░█░░\n" +
                "▐░░░░░░░░░░░░░░░░█░░░▀█████████░\n" +
                "▐░░░░░░░░░░░░░░░░▐░░░░░░▀██████░\n" +
                "░░░░░░░░░░░░░░░░░░▌░░░░░░░░████░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░▐█░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n", 80,10,10, 6);
        System.out.println(this.enemyImage);
    }

}
