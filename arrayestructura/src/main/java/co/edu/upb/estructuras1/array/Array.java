package co.edu.upb.estructuras1.array;
import java.util.function.Function;
import java.util.function.Predicate;

import co.edu.upb.estructuras1.util.array.AbstractArray;
import co.edu.upb.estructuras1.util.collection.Collection;
import co.edu.upb.estructuras1.util.iterator.Iterator;

@SuppressWarnings("unchecked")
/**
 * This class represents a collection of elements that can be accessed by an index.
 */
public class Array<E> extends AbstractArray<E> {

    private E[] elements;
    
    public Array(int size) {
        super(size);
        elements = (E[]) new Object[size];

    }
    /**
     * This method get the available index for put elements in the array
     * @return return the index if there is one available, return -1 if there's no index available
     */
    private int getAnIndex(){
        for(int ii = 0; ii < elements.length; ii++){
            if (elements[ii] == null) {
                return ii;
            }
        }
        return -1;
    }

    @Override
    public boolean clear() {

        try {
            for(int ii = 0; ii < elements.length; ii++){
                elements[ii]= null;
               }
               return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean reverse() {
        try {
            int cntReverse = elements.length;
            E[] arrCop = (E[]) new Object[elements.length];

            for(int jj = 0; jj < elements.length; jj++){
                arrCop[jj] = elements[jj];
            }

            for(int ii = 0; ii < elements.length; ii++){
                elements[ii] = arrCop[cntReverse];
                cntReverse--;
               }
               return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void forEach(Function<E, Void> action) {
        try {
            
            Iterator<E> iterator = this.iterator();
        
            while (iterator.hasNext()) {
                action.apply(iterator.next());
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @Override
    public Iterator<E> iterator() {
            
            return new Iterator<E>() { 
                int index = 0; 
    
                @Override
                public boolean hasNext() {
                    if(index < elements.length){
                        return true;
                    }
                    else{
                        return false;
                    }
                    
                }
    
                @Override
                public E next() {
                    return elements[index++];
                }
                
    
            };
    }

    @Override
    public boolean add(E element) {
        try {
            int index = getAnIndex();

            if (index != -1) {
                elements[index] = element;
                return true;
            }

            return false;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean add(int index, E[] array) {
       try {
        int cnt = 0;
        if (index < elements.length) {
            for(int ii = index; ii < elements.length; ii++){
                elements[ii] = array[cnt++];
            }
            return true;
        }
        return false;
       } catch (Exception e) {
        return false;
       }
    }

    @Override
    public boolean add(int index, Collection<E> collection) {
        try {
            Iterator<E> iterator = collection.iterator();
                if (index < elements.length) {
                        while(iterator.hasNext()){
                            elements[index++] = iterator.next();
                        }
                        return true;
                    }
                    return false;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void defragment() {
        E[] arrTemp = (E[]) new Object[elements.length];
        int cnt = 0;

        for(int ii = 0; ii < elements.length; ii++){
            if (elements[ii] != null) {
                arrTemp[cnt++] = elements[ii];
            }
        }

        for(int ii = 0; ii < elements.length; ii++){
            elements[ii] = arrTemp[ii];
        }
    }

    @Override
    public boolean dimension(int newDimension) {

        try {
            E[] arrTemp = (E[]) new Object[newDimension];
    
            for(int ii = 0; ii < elements.length; ii++){
                arrTemp[ii] = elements[ii]; 
            }
    
            this.elements = (E[]) new Object[newDimension];
    
            for(int ii = 0; ii < arrTemp.length; ii++){
                elements[ii] = arrTemp[ii];
            }
    
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public boolean remove(int index) {
        try {
            elements[index] = null;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean remove(Predicate<E> filter) {

        for(int ii = 0; ii < elements.length; ii++){

            if(filter.test(elements[ii])){
                elements[ii] = null;
                return true;
            }
            
        }
        return false;
    }
    

    @Override
    public boolean remove(int from, int to) {
        try {
            for(int ii = 0; ii < elements.length; ii++){
    
                while (from <= ii || ii < to ) {
                    elements[ii] = null;
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean set(int index, E element) {
        try {
            elements[index] = element;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
