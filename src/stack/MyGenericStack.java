package stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    LinkedList<T> stack;

    public MyGenericStack(){
        this.stack = new LinkedList<T>();
    }

    // thêm 1 phần tử vào đầu của ngăn xếp
    public void push(T element){
        stack.addFirst(element);
    }

    // xóa đi phần tử đầu tiên của ngăn xếp
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    // trả về kích thước của ngăn xếp
    public int size(){
        return stack.size();
    }

    // kiểm tra xem ngăn xếp có rỗng hay không
    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }
}
