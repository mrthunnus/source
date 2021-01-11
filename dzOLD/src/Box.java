package app;

import java.util.ArrayList;

public class Box {
    ArrayList<Fruit> fruits = new ArrayList<>();

    public int size()
    {
        return fruits.size();
    }
    public void add(Fruit item)
    {
        if (fruits.size()!=0) {
            if (fruits.get(0).getClass() != item.getClass())
            {
                System.out.println("Сюда нельзя добавить ");
            }
            else
            {
                fruits.add(item);
                System.out.println("Успешно добавлено");

            }
        }
        else
        {
            fruits.add(item);
            System.out.println("Успешно добавлено");
        }

    }

    public void remove(int index)
    {
        fruits.remove(index);
    }
    public Fruit get(int index)
    {
        return fruits.get(index);
    }
    public void clear()
    {
        fruits.clear();
    }
    public double getWeight()
    {
        double Sum=0;
        for (int i =0;i<size();i++)
        {
            Sum+=get(i).Ves;
        }
        return Sum;
    }
    public boolean Compare(Box korobka)
    {
        return this.getWeight()==korobka.getWeight();
    }
    public void messege(Box korobka)
    {
        if(this!=korobka) {
            if (this.size() != 0) {
                if (korobka.size() != 0) {
                    if (korobka.get(0).getClass() == this.get(0).getClass()) {
                        for (int i = 0; i < this.size(); i++) {
                            korobka.add(this.get(i));
                        }
                        this.clear();
                        System.out.println("Успешно переложенно");
                    } else System.out.println("Не переложенно");
                } else {
                    for (int i = 0; i < this.size(); i++) {
                        korobka.add(this.get(i));
                        System.out.println("Успешно переложенно");
                    }
                    this.clear();
                }
            } else System.out.println("Нечего перекладывать");
        }else System.out.println("Нельзя переложить в туже корбку");
    }
    public static void main(String[] args)
    {
        Apple g = new Apple(1);
        Apple g2 = new Apple(2);
        Orange o = new Orange(3);
        Orange o2 = new Orange(4);
        System.out.println(o.Ves);
        Box korobka1 = new Box();
        Box korobka2 = new Box();
        korobka1.add(g);
        System.out.println(korobka1.get(0));
        korobka1.add(o);
        System.out.println(korobka1.size());
        korobka1.add(g2);
        korobka2.add(o);
        korobka2.add(o2);
        korobka2.add(g);
        System.out.println(korobka2.getWeight());
        System.out.println(korobka1.getWeight());
        System.out.println(korobka1.Compare(korobka2));
        System.out.println(korobka1.Compare(korobka1));
        System.out.println(korobka1.size());
        korobka1.remove(0);
        System.out.println(korobka1.size());
        korobka1.clear();
        korobka1.add(o);
        korobka1.add(o2);
        System.out.println(korobka1.size());
        korobka2.messege(korobka1);
    }
}

