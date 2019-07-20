

public class ArrayList<T> {
    private int size = 10;
    private Integer[] arr = new Integer[size];
    private int mark = 0;

    public void resize(int newLength) {
        Integer[] copy = new Integer[newLength];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
            arr = copy;
        }
    }

    public void add(Integer entity) {
        if (mark == arr.length - 1) {
            resize(arr.length*2);
        }
        arr[mark++] = entity;
    }

    public int getIndex(int index) {
        return arr[index];
    }


    public void remove(int index) {
//        for (int i = index; i < mark; i++)
//           arr[i] = arr[i + 1];
        arr[mark] = null;
        mark--;
    }


    public int getSize(){
        return mark;
    }


}
