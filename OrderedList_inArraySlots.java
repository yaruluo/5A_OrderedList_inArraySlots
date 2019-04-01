public class OrderedList_inArraySLots {
    private List_inArraySLots elements;

    public OrderedList_inArraySLots(){
	elements = new List_inArraySlots();
    }

    public int size(){
	return elements.size();
    }

    public int get( int index){
	return elements.get( index);
    }

    public String tosStringz() {
	return elements.toString();
    }

    // public boolean add( int val){

    // }

    public int remove( int index){
	return elements.remove( index);
    }
}
