package arraylist;

public class ArrayList {
    private int size = 10;
    private Integer[] arr = new Integer[size];
    private int mark = 0;

    public void resize(int newLength) {
        Integer[] copy = new Integer[newLength];
        // for (int i = 0; i < arr.length; i++) {
        //      copy[i] = arr[i];
        //  }
        //  arr = copy;
        System.arraycopy(arr, 0, copy, 0, mark);
        arr = copy;
    }

    public void add(Integer entity) {
        if (mark == arr.length - 1) {
            resize(arr.length * 2);
        }
        arr[mark] = entity;
        mark++;
    }

    public Integer getIndex(int index) {
        if (((mark - 1) < index) || (index < 0)) {
            return null;
        } else {
            return arr[index];
        }

    }


    public void remove(int index) {
        if (((mark - 1) < index) || (index < 0)) {
            System.out.println("Элемент находится за рамками массива");
        } else {
            for (int i = index; i < mark; i++)
                arr[i] = arr[i + 1];
            arr[mark] = null;
            mark--;
        }
    }


    public int getSize() {
        return mark;
    }

    public void indAdd(Integer entity, int index) {
        if (mark == arr.length - 1) {
            resize(arr.length * 2);
        }
        if (((mark - 1) < index) || (index < 0)) {
            System.out.println("Элемент находится за рамками массива");
        } else {
            Integer[] copy = new Integer[arr.length];
            for (int i = 0; i < getSize(); i++) {
                if (i > index) {
                    copy[i + 1] = arr[i];
                } else if (i == index) {
                    copy[i + 1] = arr[i];
                    copy[index] = entity;
                } else {
                    copy[i] = arr[i];
                }
            }
            arr = copy;
            mark++;
        }


    }


}
