
public class Puppy extends Dog {
    private String name = new String();
    private String voice = new String();
    private boolean bite;
    private boolean jump;
    private boolean jog;

    public Puppy() {
        name = getName();
        voice = getVoice();
    }

    public Puppy(String name, String voice, boolean bite) {
        this.name = name;
        this.voice = voice;
        this.bite = bite;
        this.jump = super.isJumping();
        this.jog = super.isJogging();
    }

    public Puppy(String name, String voice, boolean bite, boolean jump, boolean jog) {
        this.name = name;
        this.voice = voice;
        this.bite = bite;
        this.jump = jump;
        this.jog = jog;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getVoice() {
        return voice;
    }

    @Override
    public boolean isBite() {
        return bite;
    }

    @Override
    public boolean isJogging() {
        return jog;
    }

    @Override
    public boolean isJumping() {
        return jump;
    }

    @Override
    public String toString() {
        return "name: " + this.getName() + "\nvoice: " + this.getVoice() + "\nbite: " + this.isBite() + "\njog: " + this.isJogging() + "\njump: " + this.isJumping();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof Puppy) {
            Puppy puppy = (Puppy)obj;
            if (this.name != null && puppy.getName() != null) {
                return puppy.getName().equals(this.name) && puppy.getVoice().equals(this.voice) && puppy.isBite() == this.isBite() && puppy.isJumping() == this.isJumping() && puppy.isJogging() == this.isJogging();
            }
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash *= name.hashCode();
        hash *= voice.hashCode();
        hash += bite ? 1 : 0;
        hash += (isJumping() ? 1 : 0);
        hash += (isJogging() ? 1 : 0);
        return hash;
    }
}
