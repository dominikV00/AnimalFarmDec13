public class Pig extends Animal {

    @Override
    void sound() {
        System.out.println("Oink oink");
        SoundOfAnimals.soundOfAnimal("pig.mp3");
    }
}
