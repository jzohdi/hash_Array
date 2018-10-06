public class tableData {
	private int intData;
	private float floatData;
	private double doubleData;
	private char charData;
	private String stringData;
	public Object objectData;
	public String repr;
	
	// Constructor overloading will handle creating data of different types;
	
	public tableData( int value ){
		this.intData = value;
		repr = Integer.toString( value );
	}
	public tableData( float value ){
		this.floatData = value;
		repr = Float.toString( value );
	}
	public tableData( String value ) {
		this.stringData = String.valueOf( value );
		repr = String.valueOf( value );
	}
	public tableData( double value ) {
		this.doubleData = value;
		repr = String.valueOf( value );
	}
	public tableData ( char value ) {
		this.charData = value;
		repr = String.valueOf( value );
	}
	
	
	@Override
	public String toString() {
		String result = String.valueOf( this.repr );
		return result;
	}
	
	public boolean equals( tableData other ) {
		return repr.equals( other.repr );
	}

}
