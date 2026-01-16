public class Stack<T> {
    private T[] data;
    private int ind;
    public Stack(int capacity){
        data = (T[]) new Object[capacity];
        ind = -1;
    }
    public void push(T element){
        ind++;
        data[ind] = element;
    }
    public T pop(){
        if(ind!=-1) {
            T temp = data[ind];
            data[ind] = null;
            ind--;
            return temp;
        }
        else return null;
    }
    public T peek(){
        return data[ind];
    }
}
