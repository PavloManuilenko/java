package ua.dp.levelup.set;

public class Home {
    private int numbers;
    private String streetName;
    private int stageCount;
    private int citizens;

    public Home(int numbers, String streetName, int stageCount, int citizens) {
        this.numbers = numbers;
        this.streetName = streetName;
        this.stageCount = stageCount;
        this.citizens = citizens;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setStageCount(int stageCount) {
        this.stageCount = stageCount;
    }

    public void setCitizens(int citizens) {
        this.citizens = citizens;
    }

    public int getNumbers() {
        return numbers;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getStageCount() {
        return stageCount;
    }

    public int getCitizens() {
        return citizens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Home home = (Home) o;

        return numbers == home.numbers && streetName.equals(home.streetName);
    }

    @Override
    public int hashCode() {
        int result = numbers;
        result = 31 * result + streetName.hashCode();
        return result;
    }
}
