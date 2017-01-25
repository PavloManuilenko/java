public abstract class NaturalLight implements SourceOfLight {

    private boolean burning = false;
    private boolean sunny = false;
    private String sourceName;

    public NaturalLight(boolean burning, String sourceName) {
        this.burning = burning;
        this.sourceName = sourceName;
    }

    public NaturalLight(String sourceName, boolean sunny) {
        this.sunny = sunny;
        this.sourceName = sourceName;
    }

    @Override
    public String isBurning() {
        if (burning) {
            return "Burning!";
        }
        else {
            return "Fire doesn't burn.";
        }
    }

    @Override
    public String isShining() {
        if (sunny) {
            return "The Sun shine!";
        }
        else {
            return "Night time.";
        }
    }

    @Override
    public void sunset() {
        sunny = false;
    }

    @Override
    public void sunrise() {
        sunny = true;
    }

    @Override
    public void burnUp() {
        burning = true;
    }

    @Override
    public void burnDown() {
        burning = false;
    }

    public String getSourceName() {
        return sourceName;
    }
}
