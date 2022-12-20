public class Sheep extends Animal {
    @Override
    void sound() {
        System.out.println("Beeeeee");
        SoundOfAnimals.soundOfAnimal("sheep.mp3");
    }

}
