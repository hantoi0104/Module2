public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];

    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        Object[] newElements = new Object[newSize];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
//        elements = Arrays.copyOf(elements, newSize);
    }


    public E get(int i) {
        return (E) elements[i];
    }

    public void add(E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }

    public void add(int index, E element) {
        if (index > size || index < 0) {

        } else {
            if (size == elements.length) {
                ensureCapa();
            }
            Object[] newElements = new Object[elements.length];
            for (int i = 0; i < elements.length; i++) {
                if (i < index)
                    newElements[i] = elements[i];
                else if (i == index)
                    newElements[i] = element;
                else newElements[i] = elements[i - 1];
            }
            elements = newElements;
        }
    }
}