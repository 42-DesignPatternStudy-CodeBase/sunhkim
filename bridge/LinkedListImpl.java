package bridge;

import java.util.LinkedList;

public class LinkedListImpl<T> implements AbstractList<T> {
    private LinkedList<T> data;

	public LinkedListImpl() {
        data = new LinkedList<T>();
	}

	@Override
	public void addElement(T obj) {
		data.add(obj);
	}

	@Override
	public T deleteElement(int i) {
		T element = getElement(i);
        data.remove(i);
        return element;
	}

	@Override
	public int insertElement(T obj, int i) {
		try {
			data.add(i, obj);
			return i;
		} catch(Exception e) {
			return -1;
		}
	}

	@Override
	public T getElement(int i) {
		return data.get(i);
	}

	@Override
	public int getElementSize() {
		return data.size();
	}
}
