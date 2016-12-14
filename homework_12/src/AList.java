public class AList {
    private int initialSize;
    private int size = 0;
    private float maxLoad = 0.8f;
    private float minLoad = 0.6f;
    private int[] array;
    private static final float MIN_SIZE = 10;

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

    public void addLast(int num) {
        float currentLoad = size/(initialSize * 1.0f);
        if (currentLoad >= maxLoad) {
            initialSize = (int) (size * 1.5);

            int[] temp = new int[initialSize];

            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[size++] = num;
    }

    public void removeLast() {
        if (size > 0) {
            array[--size] = 0;
        }
        float currentLoad = size / initialSize;
        if (currentLoad <= minLoad && array.length > MIN_SIZE) {
            initialSize = (int)(size * 1.5);

            int[] temp = new int[initialSize];

            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
    }

    public void addFirst(int num) {
        float currentLoad = size/(initialSize * 1.0f);
        if (currentLoad >= maxLoad) {
            initialSize = (int) (size * 1.5);
            int[] temp = new int[initialSize];

            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
            int[] temp = new int[initialSize];

            temp[0] = num;
            for (int i = 0; i < size; i++) {
                temp[i+1] = array[i];
            }
            array = temp;

        size++;
    }

    public void removeFirst() {
        if (size > 0) {
            int[] temp = new int[array.length];
            for (int i = 0; i < size; i++) {
                temp[i] = array[i+1];
            }
            temp[--size] = 0;
            array = temp;
        }
        float currentLoad = size / initialSize;
        if (currentLoad <= minLoad && array.length > MIN_SIZE) {
            initialSize = (int)(size * 1.5);

            int[] temp = new int[initialSize];

            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
    }

    public void addByIndex(int num, int index) {
        float currentLoad = size/(initialSize * 1.0f);
        if (currentLoad >= maxLoad) {
            initialSize = (int) (size * 1.5);
            int[] temp = new int[initialSize];

            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
        if (index == 0) addFirst(num);
        else if (index == size) addLast(num);
        else if (index > 0 && index < size) {
            int[] temp = new int[array.length];
            for (int i = 0; i < index; i++) {
                temp[i] = array[i];
            }
            temp[index] = num;
            for (int i = index+1; i < array.length; i++) {
                temp[i] = array[i-1];
            }
            array = temp;
        }
    }

    public void removeByIndex(int index) {
        if (index == 0) removeFirst();
        else if (index == size) removeLast();
        else if (index > 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[i] = array[i+1];
            }

        }
        float currentLoad = size / initialSize;
        if (currentLoad <= minLoad && array.length > MIN_SIZE) {
            initialSize = (int)(size * 1.5);

            int[] temp = new int[initialSize];

            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }

    }

    public int get(int index) {
        if (index < 0 || index >= size) throw new IllegalArgumentException();
        return array[index];
    }

    public int getArrLength() {
        return array.length;
    }
}