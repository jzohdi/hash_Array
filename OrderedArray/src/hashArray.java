
public class hashArray {
	
	static tableData[] array;
	static int capacity;
	static Integer[] indices;
	static int bound = 0;
	
	public hashArray( int capacity ) {
		capacity = nextPrime( capacity );
		array = new tableData[ capacity ];
		indices = new Integer[capacity];
	}
	
	public static void insert( int value ) {
		tableData data = new tableData( value );
		array[ value % capacity ] = data;
		indices[bound] = value % capacity;
		bound++;
		return;
	}
	
	private static int nextPrime( int n ) {
        if ( n % 2 == 0 )
            n++;
        for (; !isPrime( n ); n += 2);
 
        return n;
    }
	
    private static boolean isPrime( int n ) {
        if ( n == 2 || n == 3 )
            return true;
        if ( n == 1 || n % 2 == 0 )
            return false;
        for ( int i = 3; i * i <= n; i += 2 )
            if ( n % i == 0)
                return false;
        return true;
    }
    
    public static void print() {
    	for ( int index = 0; index < bound; index++ ) {
    		System.out.print(array[indices[index]]);
    	}
    }

}
