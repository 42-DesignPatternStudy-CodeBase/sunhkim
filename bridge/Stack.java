package bridge;

public class Stack<T> extends List<T> {
	public Stack(AbstractList<T> list) {
		super(list);
		System.out.println("Stack을 구현합니다.");
	}

    public void push(T obj){
        impl.addElement(obj);
    }
    public T pop(){
        return impl.deleteElement(impl.getElementSize() - 1);
    }

}