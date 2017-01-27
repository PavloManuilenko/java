public class Coin {
    int weight;
    int diametr;

    public Coin(int weight, int diametr) throws CoinLoigcException {
        this.weight = weight;
        this.diametr = diametr;
        if (diametr <= 0) throw new CoinLoigcException("Diameter should be more than 0");
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public int getWeight() {
        return weight;
    }

    public int getDiametr() {
        return diametr;
    }

}
