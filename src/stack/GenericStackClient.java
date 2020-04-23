package stack;

public class GenericStackClient {
    public static void stackOfString(){
        MyGenericStack<String> s1 = new MyGenericStack<>();
        s1.push("Five");
        s1.push("Four");
        s1.push("Three");
        s1.push("Two");
        s1.push("One");
        System.out.println("Kích thước của mảng sau khi push phần tử: " + s1.size());
        System.out.println("Pop phần tử ra khỏi ngăn xếp");
        while (!s1.isEmpty()){
            System.out.println(s1.pop());
        }
        System.out.println("Kích thước của stack sau khi pop: " + s1.size());
    }

    public static void stackOfInteger(){
        MyGenericStack<Integer> s1 = new MyGenericStack<>();
        s1.push(5);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(1);
        System.out.println("Kích thước của mảng sau khi push phần tử: " + s1.size());
        System.out.println("Pop phần tử ra khỏi ngăn xếp");
        while (!s1.isEmpty()){
            System.out.println(s1.pop());
        }
        System.out.println("Kích thước của stack sau khi pop: " + s1.size());
    }
}
