public class UserOfOrderedList {
    private static OrderedList_inArraySlots list;

    public static void main( String[] args){
	list = new OrderedList_inArraySlots();
	
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

	/* ----------- Testing Add ---------------*/
	
        System.out.println("Test add");
        list.add( 0,1,2,3);
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added string: " + list);

	/* ----------- Testing get ---------------*/

	System.out.println( "element 2: " + list.get( 2) + " expecting \"3\"");
        System.out.println( "element 0: " + list.get( 0) + " expecting \"1\"");

	/* ----------- Testing toString ---------------*/
        System.out.println( list.toString());

	/* ----------- Testing expand ---------------*/
	
    }
    
}
