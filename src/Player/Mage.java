package Player;

import Items.Potions.ManaPotion;
import Items.scrolls.Cure;
import Items.scrolls.FireBall;

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
        super(100, 100, 50, 100,6);
        itemBag.addItem(new FireBall(201),2);
        itemBag.addItem(new Cure(200),2);
        itemBag.addItem(new ManaPotion(2),5);
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
