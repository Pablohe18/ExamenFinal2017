/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema3;

/**
 *
 * @author Pablo Herrera
 */
public class ImplLeakyStack <E> implements LeakyStack{
        public static final int CAPACITY=1000;
	private Animal[] data;
	private int t=-1;
    @Override
    public int size() {
        return t+1;
    }

    @Override
    public boolean isEmpty() {
       return (t == -1);
    }

    @Override
    public Object saveHistory(Object Animal) {
       data[++t] =  (Animal) Animal;
       return Animal;
    }

    @Override
    public Object actual() {
       if (isEmpty()) return null;
		return data[t];
    }

    @Override
    public Object undo() {
        if (isEmpty()) return null;
		Animal response = data[t];
		data[t] = null;
		t--;
		return response;
    }


    
}
