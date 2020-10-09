package Main;


import Enemys.Enemy;
import Enemys.EnemyManager;
import Player.Job;
import Player.Player;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class GameSetup {

    private Player newPlayer;
    private Enemy enemy;

    public GameSetup() {

        playMusic("music.wav");
        new Intro();

        PlayerPicker playerPicker = new PlayerPicker();
        this.newPlayer = new Job(playerPicker.getPlayerChoice(), playerPicker.getPlayerName()).getPlayerJob();
        System.out.println(this.newPlayer.getHealth());

        this.enemy = new EnemyManager().getNewEnemy();
        Combat combat = new Combat(this.newPlayer, this.enemy);


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
