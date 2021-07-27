package animal;

public class FelidaeFamily extends Animal {

    public boolean meowing;

    public FelidaeFamily(int age, int weight, boolean eating, boolean running) {
        super(age, weight, eating, running);
    }

    public boolean getMeowing() {
        return meowing;
    }

    public void setMeowing(boolean meowing) {
        this.meowing = meowing;
    }


}
