import java.util.ArrayList;



/**
 * @author Joul
 * @author jakob
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**constructor
	 * @param array
	 * @param b
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return   getter for  winArray
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray    setter for winArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return     getter for array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return   getter for B
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return    getter for flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag    setter for flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
