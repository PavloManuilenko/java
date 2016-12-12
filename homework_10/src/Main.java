import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Puppy puppy1 = new Puppy("Rex", "Bark-bark!", false);
        Puppy puppy2 = new Puppy("Rex", "Bark-bark!", false, true, true);
        System.out.println(puppy1.toString());
        System.out.println("\n" + puppy2.toString());
        System.out.println("\n" + puppy2.equals(puppy1));
        System.out.println(puppy1.hashCode() == puppy2.hashCode());
    }
}
