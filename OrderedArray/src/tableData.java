public class tableData {
	private int intData;
	private float floatData;
	private double doubleData;
	private char charData;
	private String stringData;
	private String repr;
	
	public tableData( int value ){
		this.intData = value;
		repr = Integer.toString( value );
		return;
	}
	public tableData( float value ){
		this.floatData = value;
		repr = Float.toString( value );
		return;
	}
	public tableData( String value ) {
		this.stringData = String.valueOf( value );
		repr = String.valueOf( value );
		return;
	}
	
	@Override
	public String toString() {
		String result = String.valueOf( this.repr );
		return result;
	}

}
