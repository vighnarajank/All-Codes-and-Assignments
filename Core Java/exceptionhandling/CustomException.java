package com.onebill.corejava.exceptionhandling;

class DemoException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DemoException(String string) {
    	super(string);
    	//System.out.println(string);
	}
}
 
public class CustomException {

	public static void main(String[] args) {
		try
        {
            throw new DemoException("Vighna");
        }
        catch (DemoException e)
        {
            System.out.println("Exception is getting catched here");
            System.out.println(e.getMessage());
        }
	}

}
