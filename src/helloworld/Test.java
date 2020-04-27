package helloworld;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt(myArray);
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i] + " ");
        }
	}

}
class ChangeIt
{
    static void doIt( int[] z )
    {
    	int[] A = z;
        A = null;
    }
    
}
