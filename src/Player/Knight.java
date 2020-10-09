package Player;

public class Knight extends Player {
    protected String jobType = "Knight";
    protected String knightImage =
            "            1. Knight:           \n" +
            "   ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
            "   ░░░░░░░░░░░░▄█▀█░░░░░░░░░░░░░░\n" +
            "   ░░░░░░░░░░▄█▀░░█░░░░░░░░░░░░░░\n" +
            "   ░░░░░░░░▄█░░░░░█████▄▄░░░░░░░░\n" +
            "   ░░░░░░▄█░░▄▄▀░░█░░░░░░▀█▄░░░░░\n" +
            "   ░░░░░█░░░█▀░░░░░█░▄▄▄░░░░█░░░░\n" +
            "   ░░░░█░░░▀░░░░░░░▐█▀░░▀█░░░█░░░\n" +
            "   ░░░▐▌░░░░░░▄▄▄▄█▀█░█▌░▐░░░░█░░\n" +
            "   ░░░▐█░░████▀░░░░░█░░░░█░░░░█░░\n" +
            "   ░░█▀▀▀▀▀▀▀░░░░░▐█░▀██▀░░░░▐█░░\n" +
            "   ░░█░░░░░░░░░░░░█▀░░░░░░░░░█░░░\n" +
            "   ░░█░▌░█░░▌░░░█▀░░░░░░░░░░█░░░░\n" +
            "   ░░█░█░▐░░░░▄▀░░░░░░░░░░▄▀░░░░░\n" +
            "   ░░█░░▌░█░░█░░░░░░░░░░░▐▌░░░░░░\n" +
            "   ░░░█░░░░░██▄░░░░░░▄▄▄▄██▄░░░░░\n" +
            "   ░░░░█░░░█░░░█░▄██▀▀░░░░░░▀░░░░\n" +
            "   ░░░░░█░░▌░░▄██▀░░░░░░░░░░░░░░░\n" +
            "   ░░░░░░▀█▌░░▀░░░░░░░░░░░░░░░░░░\n" +
            "   ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
            "   ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░";

    public Knight() {
        super(15, 5, 10, 100, 6);
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getKnightImage() {
        return knightImage;
    }

    public void setKnightImage(String knightImage) {
        this.knightImage = knightImage;
    }
}




