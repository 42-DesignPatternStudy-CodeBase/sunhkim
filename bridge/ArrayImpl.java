package bridge;

import java.util.ArrayList;

public class ArrayImpl<T> implements AbstractList<T> {
	private ArrayList<T> data;

    public ArrayImpl() {
        data = new ArrayList<T>();
    }
	
	@Override
	public void addElement(T obj) {
        data.add(obj);
	}

	@Override
	public T deleteElement(int i) {
		T element = getElement(i);
        data.remove(element);
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
