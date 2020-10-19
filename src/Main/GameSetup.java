package Main;


import Enemys.Enemy;
import Enemys.EnemyManager;
import Items.Merchant;
import Player.ClassCreator;
import Player.Player;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class GameSetup {

    private Player newPlayer;
    private Enemy enemy;

    public GameSetup(){

        //playMusic("music.wav");
        //new Intro();

        PlayerInitiator initiator = new PlayerInitiator();
        this.newPlayer = new ClassCreator(initiator.getPlayerChoice(), initiator.getPlayerName()).getPlayerJob();
        new Merchant(this.newPlayer);
        //this.enemy = new EnemyManager().getNewEnemy();
        //new Combat(this.newPlayer, this.enemy);


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
