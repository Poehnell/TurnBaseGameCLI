package Main;

import Player.ClassCreator;
import Player.Player;
import Town.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class GameSetup {

    private Player newPlayer;
    private int decision;
    Screen screen = new Screen();


    public GameSetup(){


        playMusic("music.wav");
        screen.intro();
        PlayerInitiator initiator = new PlayerInitiator();
        this.newPlayer = new ClassCreator(initiator.getPlayerChoice(), initiator.getPlayerName()).getPlayerJob();
        Town town = new Town(this.newPlayer);
        Tower tower = new Tower(this.newPlayer);
        Merchant merchant = new Merchant(this.newPlayer,tower.getFloor());

        while (!this.newPlayer.isGameOver()){
            if (this.newPlayer.getPlayerLocation() == 0){
                town.menue();
            }else if (this.newPlayer.getPlayerLocation() == 1){
                merchant.merchantMenue(merchant.getMerchantBag());
            }else if (this.newPlayer.getPlayerLocation() == 2){
                tower.mainFloor();
            }
        }
        gameOver();




    }
    public void gameOver(){
        screen.gameOver();
        System.out.println("\n\n   1. Try again? \n" +
                "\n   2. Quit");
        decision = screen.optionScreen();
        if (decision == 1){
            new GameSetup();
        }else if (decision == 2){
        }else if (decision == 0){
            gameOver();
        }
    }

    public void playMusic(String musicLocation) {
        try {
            File musicPath = new File(musicLocation);

            if (musicPath.exists()) {

                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(10);


            } else {
                System.out.println(" cant find file");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
