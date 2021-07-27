package animal;

public class Animal {
    public int age;
    public int weight;
    public boolean eating;
    public boolean running;

    public Animal(int age, int weight, boolean eating, boolean running){

        this.age = age;
        this.weight = weight;
        this.eating = eating;
        this.running = running;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public boolean isEating() {
        return eating;
    }

    public void setEating(boolean eating) {
        this.eating = eating;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
