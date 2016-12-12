
public class Dog extends Animal {
    private String name = new String();
    private String voice = new String();
    private boolean bite;
    private boolean jump;
    private boolean jog;


    public Dog () {
        name = "Dog";
        voice = "\"Bark-Bark-Bark!\"";
        bite = false;
        jump = isJumping();
        jog = isJogging();
    }

    public Dog (String name) {
        this.name = name;
        voice = "\"Bark-Bark-Bark!\"";
        bite = false;
        jump = isJumping();
        jog = isJogging();
    }


    public Dog (String name, String voice, boolean bite) {
        this.name = name;
        this.voice = voice;
        this.bite = bite;
        jump = isJumping();
        jog = isJogging();
    }

    public Dog (boolean jump, boolean jog, String name, String voice, boolean bite) {
        super(jump, jog);
        this.name = name;
        this.voice = voice;
        this.bite = bite;
    }


    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public boolean isBite() {
        return bite;
    }
}
