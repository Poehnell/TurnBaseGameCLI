package Town;


import Main.Screen;
import Player.Player;

public class Town {
    Screen screen = new Screen();
    private int decision;
    private int playerLocation;
    private Player player;




    public Town(Player player) {
        this.player = player;
        this.playerLocation = playerLocation;
    }

     public void menue(){
        screen.updateScreen();
        screen.town();
        if (this.player.getRopeFloor() > 0){
            for (int i = 1; i <= this.player.getRopeFloor(); i++){
                System.out.println("\n   " + (i + 2) + ". Climb to floor: " + (i * 5));
            }
        }
        decision = screen.optionScreen();
        if (decision == 1) {
            this.player.setPlayerLocation(1);
        }else if (decision == 2) {
            this.player.setPlayerLocation(2);
        }else if (decision == 0) {
            this.player.setPlayerLocation(0);
        }else if (decision > 2 && this.player.getRopeFloor() > 0){
            climbRope();
        }
    }
public void climbRope(){
        this.player.setPlayerLocation(5);
        this.player.setTowerFloor((decision - 2) * 5);

}
}
