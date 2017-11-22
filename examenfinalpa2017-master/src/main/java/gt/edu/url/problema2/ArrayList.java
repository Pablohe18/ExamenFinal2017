/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema2;

import java.util.Iterator;

/**
 *
 * @author Pablo Herrera
 */
public class ArrayList<E> implements List, Iterable{
	public static final int CAPACITY = 16;
	private E[] data;
	private int size = 0;
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
       return size == 0;
    }

    @Override
    public E get(int i) {
        checkIndex(i, size);
		return data[i];
    }


    @Override
    public void add(int i, Object e) {
        checkIndex(i, size + 1);
		if (size == data.length)
			resize(2 * data.length);
		for (int k = size - 1; k >= i; k--)
			data[k + 1] = data[k];
		data[i] = (E) e; 
		size++;
    }

    @Override
    public Object remove(int i) throws IndexOutOfBoundsException {
       checkIndex(i, size);
		E temp = data[i];
		for (int k = i; k < size - 1; k++)
			data[k] = data[k + 1];
		data[size - 1] = null;
		size--;
		return temp;
    }

    private void checkIndex(int i, int size) {
     if (i < 0 || i >= size)
			throw new IndexOutOfBoundsException("Illegal index: " + i);
    }
    protected void resize(int capacity) {
		E[] temp = (E[]) new Object[capacity];
		for (int k=0; k < size; k++)
			temp[k] = data[k];
		data = temp;
	}

    @Override
    public Object set(int i, Object e) {
        checkIndex(i, size);
		E temp = data[i];
		data[i] = (E) e;
		return temp;
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
