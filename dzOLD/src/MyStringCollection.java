package app;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

public class MyLinkedList {
    private StringNode head;

    void add(MyLinkedList list,String item){
        StringNode node = new StringNode(item, null);
        if (list.head == null){
            list.head = node;
        }else {
            StringNode last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }
    class  StringNode{
        String value;
        StringNode next;

        public StringNode(String value, StringNode next){
            this.value = value;
            this.next = next;
        }
    }
    int size(MyLinkedList list){
        if(list.head != null){
            int i=1;
            StringNode last = list.head;
            while (last.next != null) {
                last = last.next;
                i++;
            }
            return i;}
        else {
            System.out.println("Нет списка");
            return 0;
        }
    }
    StringNode get(MyLinkedList list,int index)
    {
        if(list.head != null){
            StringNode cel;
            if ((index < size(list))&&(index>=0)) {
                cel = list.head;
                if (index != 0){
                    for (int i = 0;i != index;i++) {
                        cel = cel.next;
                    }
                }
                return cel;
            }
            else{
                System.out.println("Нет такого индекса");
                return null;
            }
        }
        else {
            System.out.println("Нет списка");
            return null;
        }
    }
    void clear(MyLinkedList list){
        list.head=null;
    }
    void remove(MyLinkedList list,int index){
        if(list.head != null) {
            StringNode cel;
            if ((index < size(list))&&(index>=0)) {
                cel = list.head;
                if (index != 0){
                    for (int i = 1;i != index-2;i++) {

                        cel = cel.next;
                    }
                    cel.next=cel.next.next;
                }
                else{
                    list.head=list.head.next;
                }
            }
            else{
                System.out.println("Нет такого индекса");
            }


        }
        else{
            System.out.println("Нет списка");
        }
    }
    void remove(MyLinkedList list,StringNode node)
    {
        if(list.head != null){
            boolean neyspeh = true;
            StringNode cel = list.head;
            for(int i = 0; i < size(list);i++){
                if(node == cel){
                    remove(list,i);
                    System.out.println("Успешно удалён");
                    neyspeh = false;
                    break;
                }
            }
            if (neyspeh) {
                System.out.println("Не найден элемент");
            }
        }
        else {
            System.out.println("Нет списка");
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        MyLinkedList list3 = new MyLinkedList();
        list.add(list,"1");
        list.add(list,"2");
        list.add(list,"3");
  /*      System.out.println(list.head.next.value);
        list.clear(list);
        System.out.println(list);
        System.out.println(list.get(list,3));
        System.out.println(list.get(list,0));*/
        list.add(list,"11");
        list.add(list,"22");
        list3.add(list3,"33");
        list2.add(list2,"33");
        list.add(list,"44");
  /*      System.out.println(list.head.next.value);
        System.out.println(list.get(list,3));
        System.out.println(list.get(list,0));*/
        System.out.println(list.get(list2,0).value);
        list3.remove(list3,list3.head);
        System.out.println(list.get(list3,0).value);

    }
}
