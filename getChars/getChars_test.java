
public class getChars_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Hello = "abcd";
		char[] world = new char[4]; //Creating an array of CHARACTERS to put the output in 
		Hello.getChars(0, 2, world, 0);  //Cuts the array from 0-2
		System.out.println(world); //Prints the Array
		//output - ab
	}
/*
 * Syntax: String_Name.getChars(StartCharacter, EndCharacter, DestinationArray, What Character to start on in the array)
 */
}
