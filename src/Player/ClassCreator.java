package Player;

public class ClassCreator {
    private String playerChoice, playerName;
    private Player playerJob;

    public ClassCreator(String playerChoice, String playerName) {
        this.playerName = playerName;
        this.playerChoice = playerChoice;
        if (playerChoice == "Knight") {
            this.playerJob = new Knight();
            playerJob.setPlayerName(playerName);
            playerJob.setPlayerJob(playerChoice);


        } else if (playerChoice == "Mage") {
            this.playerJob = new Mage();
            playerJob.setPlayerName(playerName);
            playerJob.setPlayerJob(playerChoice);
        }
    }


    public String getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    public Player getPlayerJob() {
        return playerJob;
    }

    public void setPlayerJob(Player playerJob) {
        this.playerJob = playerJob;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}

