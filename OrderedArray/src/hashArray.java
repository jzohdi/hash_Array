
public class hashArray {
	
	tableData[] valuesArray;
	public int capacity;
	int [] indices;
	int bound = 0;
	
	public hashArray( int capacity ) {
		this.capacity = nextPrime( capacity );
		valuesArray = new tableData[ this.capacity ];
		indices = new int[ this.capacity ];
	}
	
	public void append( int value ) {
		tableData data = new tableData( value );
		int hash = hashCode( String.valueOf( value ) );
		insertData( hash , data );
	}
	public void append( char value ) {
		tableData data = new tableData( value );
		int hash = hashCode( String.valueOf( value ) );
		insertData( hash , data );
	}
	public void insertData( int hash , tableData data ) {
		int index = hash;
		if ( index > capacity ) {
			capacity = index;
			valuesArray = copyArray();
			
		}
//		System.out.println(index);
		valuesArray[ index ] = data;
		indices[bound] = index;
		bound++;
	}
	public tableData[] copyArray() {
		tableData[] tempArray = new tableData[ capacity + 1 ];
		System.arraycopy( valuesArray, 0, tempArray, 0, valuesArray.length);
		return tempArray;
	}
	public int hashCode( String value ) {
		int hash = 7;
		for ( int x = 0; x < value.length(); x++ ) {
			hash = hash*31 + value.charAt(x);
			
		}
//		System.out.println(hash);
		return hash;
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
    
    public void print() {
    	for ( int index = 0; index < bound; index++ ) {
    		System.out.print(valuesArray[indices[index]] + " ");
    	}
    }

}
