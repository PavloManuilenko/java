
public class Animal {
    private boolean jump;
    private boolean jog;

    public Animal () {
        this.jump = true;
        this.jog = true;
    }

    public Animal (boolean jump, boolean jog) {
        this.jump = jump;
        this.jog = jog;
    }

    public boolean isJumping() {
        return jump;
    }

    public boolean isJogging() {
        return jog;
    }
}
