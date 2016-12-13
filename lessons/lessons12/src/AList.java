
public class AList {
    private int initialSize;
    private int size = 0;
    private float maxLoad = 0.8f;
    private float minLoad = 0.6f;
    private int[] array;

    public AList() {
        this.initialSize = 10;
        this.array = new int[initialSize];
    }

    public AList(int initialSize) {
        this.initialSize = initialSize;
        this.array = new int[initialSize];
    }

    public int size() {
        return size;
    }

    public void add(int num) {
        float currentLoad = size/(initialSize * 1.0f);
        if (currentLoad>= maxLoad) {
            initialSize = (int)(size * 1.5);
            int[] temp = new int[initialSize];

            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[size++] = num;
    }

    public void remove() {
        if (size> 0) {
            array[--size] = 0;
        }
        float currentLoad = size / initialSize;
        if (currentLoad <= minLoad) {
            initialSize = (int)(size * 1.5);

            int[] temp = new int[initialSize];

            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
    }

    public int get(int index) {
        if (index < 0 ||index >= size) throw new IllegalArgumentException();
        return array[index];
    }

    public int getArrLength() {
        return array.length;
    }
}
