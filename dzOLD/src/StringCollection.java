package app;

import java.util.Arrays;

public class StringCollection {
    Fruit[] items;
    int count;

    public StringCollection() {
        this.count = 10;
    }

    public StringCollection(int count) {
        items = new Fruit[count];
        this.count = 0;
    }

    public void add(Fruit item) {
        if (count >= items.length) {
            increaseCollection();
        }
        items[count++] = item;
    }

    private void increaseCollection() {
        Fruit[] tmp = new Fruit[items.length + 2];
        System.arraycopy(items, 0, tmp, 0, items.length);
        items = tmp;
    }

    public void remove(int index) {
        for (int i = index; i < items.length - 1; i++) {
            items[i] = items[i + 1];
        }
        items[items.length - 1] = null;
        count--;
    }

    public void remove(Fruit item) {
        int index = 0;
        boolean nashel = false;
        while (index < count) {
            if (items[index] == item) {
                remove(index);
                nashel = true;
                break;
            }
            index++;
        }
        if (nashel) {
            System.out.println("Нужный элемент успешно удалён");
        } else System.out.println("Не найден");
    }

    public void print() {
        Arrays.stream(items).forEach(items -> System.out.println(items));
        System.out.println((count));
        System.out.println(items.length);
    }

    public int size() {
        return count;
    }

    public Fruit get(int index) {
        if (index < count) {
            return items[index];
        } else {
            System.out.println("нет такого элемента");
            return null;
        }
    }

    public void clear()
    {
        for(int i=0;i<count;i++)
        {
            items[i]=null;
        }
        count=0;
    }
    public static void main(String[] args){
        Apple g = new Apple(1);
        Apple g2 = new Apple(2);
        Orange o = new Orange(3);
        Orange o2 = new Orange(4);
        StringCollection stringCollection = new StringCollection(3);
        stringCollection.add(g);
        stringCollection.add(g2);
        stringCollection.add(o);
        stringCollection.add(o2);
        stringCollection.print();
        stringCollection.remove(3);
        stringCollection.remove(o);
        stringCollection.remove(o);
        System.out.println(stringCollection.get(1));
        System.out.println(stringCollection.get(3));
        stringCollection.clear();
        stringCollection.print();
    }

}
