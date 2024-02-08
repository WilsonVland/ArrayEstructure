
public abstract class AbstractNode<E> implements Node<E>, Cloneable {
    
    protected E element;

    public AbstractNode(){
        this.element = null;
    }

    public AbstractNode(E elements){
        this.element = element;
    }
    
    public void set(E element){
        this.element = element;
    }

    public E get(){
        return element;
    }

    public String toString(){
        return element.toString();
    }
}