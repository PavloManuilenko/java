public abstract class ArtificialLight implements SourceOfLight {

    private boolean shining = false;
    private String sourceName;

    public ArtificialLight(boolean shining, String sourceName) {
        this.shining = shining;
        this.sourceName = sourceName;
    }

    @Override
    public void turnOn() {
        shining = true;
    }

    @Override
    public void turnOff() {
        shining = false;
    }

    @Override
    public String isShining() {
        if (shining) {
            return "Shining!";
        }
        else {
            return "Darkness.";
        }
    }

    public String getSourceName() {
        return sourceName;
    }
}
