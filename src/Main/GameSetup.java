package Main;

import Player.Job;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;


public class GameSetup {


    public GameSetup() {
        playMusic("music.wav");
        new Intro();
        DataInput scan = new DataInput();
        scan.heroChoice();

        Job newPlayer = new Job(DataInput.playerName, DataInput.playerChoice);
        newPlayer.heroChoice();
        Combat combat = new Combat(6,newPlayer.getPlayerName(), newPlayer.getHealth(), newPlayer.getMana(), newPlayer.getDamage());

        combat.initiateCombat();
        combat.battle();

    }
public void playMusic(String musicLocation){
        try {
            File musicPath = new File(musicLocation);

            if (musicPath.exists()) {

                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(10);

                JOptionPane.showMessageDialog(null, "Press OK to stop playing");
                clip.stop();

            } else {
                System.out.println(" cant find file");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
}
}
