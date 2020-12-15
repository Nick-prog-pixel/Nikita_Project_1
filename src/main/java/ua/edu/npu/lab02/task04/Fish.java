package ua.edu.npu.lab02.task04;

public class Fish implements Swimming{
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.swimm();
    }

    public void swimm() {
        System.out.println("I'm swimming");
    }
}
