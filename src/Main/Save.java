package Main;

import java.io.*;

import Player.*;

public class Save implements java.io.Serializable {
    private int decission;
    private Player player;
    private SavedPlayer savedPlayer;
    Screen screen = new Screen();


    public Save() {
    }

    public Save(Player player) {
        this.player = player;
    }


    public void saveDungeon() {
        screen.saveDungeon();
        System.out.println("\n\n   1. Save " +
                "\n\n   2. Return ");
        decission = screen.optionScreen();
        if (decission == 1) {
            this.savedPlayer = new SavedPlayer(this.player.getVitality(), this.player.getWisdom(), this.player.getStrength(), this.player.getHealth(), this.player.getMana(), this.player.getGold(), this.player.getDieSize(), this.player.getRopeFloor(), this.player.getPlayerName(), this.player.getPlayerJob(), this.player.getItemBag(), this.player.getSpellBag());
            serializeState();
            System.out.println(savedPlayer.getPlayerJob());
            screen.nextScreen();
            saveDungeon();
        } else if (decission == 2) {
            this.player.setPlayerLocation(1);
        }
    }


    public void load() {
        String Job = savedPlayer.getPlayerJob();
        if (savedPlayer.getPlayerJob() == Job) {
            this.player = new Knight();
            System.out.println("yup knight");
        } else if (savedPlayer.getPlayerJob() == Job) {
            this.player = new Mage();
        }
        this.player.setPlayerName(savedPlayer.getPlayerName());
        this.player.setPlayerJob(savedPlayer.getPlayerJob());
        this.player.setHealth(savedPlayer.getHealth());
        this.player.setMana(savedPlayer.getMana());
        this.player.setGold(savedPlayer.getGold());
        this.player.setDieSize(savedPlayer.getDieSize());
        this.player.setRopeFloor(savedPlayer.getRopeFloor());
        this.player.setVitality(savedPlayer.getVitality());
        this.player.setWisdom(savedPlayer.getWisdom());
        this.player.setStrength(savedPlayer.getStrength());
        this.player.setItemBag(savedPlayer.getItemBag());
        this.player.setSpellBag(savedPlayer.getSpellBag());
    }

    public void loadDungeon() {
        deserializeState();
        load();
        System.out.println(savedPlayer.getPlayerJob());
        screen.nextScreen();


    }

    public void serializeState() {
        try {
            FileOutputStream fileOut = new FileOutputStream("C://Users//Poehn//Desktop//test.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(savedPlayer);
            out.flush();
            out.close();
            fileOut.close();
            System.out.println("Serialized data is Saved in");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void deserializeState() {
        try {
            FileInputStream fileIn = new FileInputStream("C://Users//Poehn//Desktop//test.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            savedPlayer = (SavedPlayer) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Player not found");
            c.printStackTrace();
            return;
        }
    }


    public Player getPlayer() {
        return this.player;
    }


}
