public class LinkedNode<E> extends AbstractList<E> {

    private LinkedNode<E> next;

    public LinkedNode (E element){
        super(element);
        next = null;
    }

    public LinkedNode<e> next(){
        return next;
    }

    public void setNext(LinkedNode<E> next){
        this.next = next;
    }
    
}