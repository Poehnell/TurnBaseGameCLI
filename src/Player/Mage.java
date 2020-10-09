package Player;

public class Mage extends Player {
    protected String jobType = "Mage";
    protected String mageImage =
            "              2. Mage:           \n" +
            "   ░░░░░░░░░░░░░░░░░▄▀▀▄░░░░░░░░░\n" +
            "   ░░░░░░░░░░░░░░░░█░░░░█░░░░░░░░\n" +
            "   ░░░░░░░░░░░░░▄█▀░░░█▄░█░░░░░░░\n" +
            "   ░░░░░░░░░░░░█░░░░░░▐░▀█▌░░░░░░\n" +
            "   ░░░░░░░░░░▄█░░░░░░░█░░░░░░░░░░\n" +
            "   ░░░░░░░░░█░░░░░░░░░▌░░░░░░░░░░\n" +
            "   ░░░░░░░░█░░░░░░░░░░█░░░░░░░░░░\n" +
            "   ░░░░░░██░░░░░░░░░░░█▀█▄░░░░░░░\n" +
            "   ░░░█▀▀▀▀░░░░░░░░░░░░░░░▀█▄░░░░\n" +
            "   ░██▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄██░░░\n" +
            "   ░░░░░░▐█░░░░░░░░░▐███░░░░░░░░░\n" +
            "   ░░░░░░▐██░░░░░░░░█████░░░░░░░░\n" +
            "   ░░░░░█▀░░░░░░░░░░█████░░░░░░░░\n" +
            "   ░░░░█░░░▄░░░░░░░██████░░░░░░░░\n" +
            "   ░░░░▀▀▀██▄▄░░░░████████░░░░░░░\n" +
            "   ░░░░░░░█░░░██▌░███░░░███░░░░░░\n" +
            "   ░░░░░░░░██▄██████░░░░░██░░░░░░\n" +
            "   ░░░░░░░░███████░░░░░░░░█▌░░░░░\n" +
            "   ░░░░░░░░█████░░░░░░░░░░░░░░░░░\n" +
            "   ░░░░░░░░░██▀▀░░░░░░░░░░░░░░░░░";

    public Mage() {
        super(10, 15, 5, 100,6);
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getMageImage() {
        return mageImage;
    }

    public void setMageImage(String mageImage) {
        this.mageImage = mageImage;
    }
}
