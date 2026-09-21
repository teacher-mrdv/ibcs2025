/*
 * OOP ArrayList Test v2
 *
 * This class requires Person.java and Teacher.java to be in the same folder
 * Get them from the online homework. File name: ArrayListTest.zip
 * Complete info. on ArrayList class:
 * http://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 *
 * Author:
 * Date  : 
 *
 */
import java.util.*;
import java.io.*;

public class Test
{
	public static void addTeacher(ArrayList<Teacher> list) throws IOException
	{	int tid = inputInt("Enter teacher ID    : ");
		while( searchByID(list, tid) != -1 && tid < 1)
		{	System.out.println("Error - teacher ID already in the system.");
			tid = inputInt("Enter teacher ID    : ");
		}
		String tname = input("Enter teacher name  : ");
		String tphone= input("Enter teacher phone : ");
		int school = inputInt("Enter teacher school: [1-Kindy | 2-ES | 3-MS | 4-HS] ");
		while( school < 1 || school > 4 )
		{	System.out.println("Error - school code out of range.");
			school = inputInt("Enter teacher school: ");
		}
		char ee = inputChar("Supervising EE (y/n)? ");
		while( ee != 'y' && ee != 'Y' && ee != 'n' && ee != 'N')
		{	System.out.println("Error - Y/y or N/n only, please.");
			ee = inputChar("Supervising EE (y/n)? ");
		}
		char pp = inputChar("Supervising PP (y/n)? ");
		while( pp != 'y' && pp != 'Y' && pp != 'n' && pp != 'N')
		{	System.out.println("Error - Y/y or N/n only, please.");
			pp = inputChar("Supervising PP (y/n)? ");
		}
		Teacher newTeacher = new Teacher(tid, tname, tphone, school, ee, pp);
		list.add(newTeacher);
		save(list);
	}

	public static void fullList( ArrayList<Teacher> list )
	{
		//  ************* your code goes here ************* //
	}

	public static void compactList( ArrayList<Teacher> list )
	{
		//  ************* your code goes here ************* //
	}

	public static int searchByID(ArrayList<Teacher> list, int id)
	{
		//  ************* your code goes here ************* //
		return -1; // if not found, -1 signals error/not found
	}

	public static ArrayList<Teacher> eeSups(ArrayList<Teacher> list)
	{	ArrayList<Teacher> eeSupsList = new ArrayList<Teacher>();
		//  ************* your code goes here ************* //
		return eeSupsList;
	}

	public static ArrayList<Teacher> ppSups(ArrayList<Teacher> list)
	{	ArrayList<Teacher> ppSupsList = new ArrayList<Teacher>();
		//  ************* your code goes here ************* //
		return ppSupsList;
	}

	public static ArrayList<Teacher> bothSups(ArrayList<Teacher> list)
	{	ArrayList<Teacher> bothSupsList = new ArrayList<Teacher>();
		//  ************* your code goes here ************* //
		return bothSupsList;
	}

	public static ArrayList<Teacher> searchNames( ArrayList<Teacher> list, String name )
	{	ArrayList<Teacher> results = new ArrayList<Teacher>();
		//  ************* your code goes here ************* //
		return results;
	}

	public static ArrayList<Teacher> schoolList(ArrayList<Teacher> list, int school)
	{	ArrayList<Teacher> listBySchool = new ArrayList<Teacher>();
		//  ************* your code goes here ************* //
		return listBySchool;
	}

	public static void edit(ArrayList<Teacher> list, int index) throws IOException
	{
        System.out.println(list.get(index));
		//  ************* your code goes here ************* //
	}

	public static void main (String[] args) throws IOException
	{
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		boolean continues = true;
    	do
		{   // display the main menu
			load(teachers);
			System.out.println("\n\t== MENU ==");
			System.out.println("[ A ] Add teacher");
			System.out.println("[ L ] List all teachers");
			System.out.println("[ C ] Compact teacher list [ID + name + school]");
			System.out.println("[ S ] List teachers by school");
			System.out.println("[ E ] List teachers supervising EEs");
			System.out.println("[ P ] List teachers supervising PPs");
			System.out.println("[ B ] List teachers supervising BOTH EE & PP");
			System.out.println("[ N ] Search teacher by name");
			System.out.println("[ I ] Search teacher by ID");
			System.out.println("[ Q ] Quit");
			char decision = inputChar("\tEnter one letter for your option: ");
			decision = Character.toLowerCase(decision);
			System.out.println();
			switch(decision)
			{
				case 'a':
					addTeacher(teachers);
					break;
					
				case 'l':
					if(teachers.size() == 0)
					{	System.out.println("No teachers on file, please add them.");
					}
					else
					{	fullList(teachers);
					}
					break;
					
				case 'c':
					compactList(teachers);
					break;

				case 's':
					int school = inputInt("Enter teacher school: [1-Kindy | 2-ES | 3-MS | 4-HS] ");
					//  ************* validate this input ************* //
					compactList( schoolList(teachers, school) );
					break;

				case 'e':
					compactList( eeSups(teachers) );
					break;
					
				case 'p':
					compactList( ppSups(teachers) );
					break;

				case 'b':
					compactList( bothSups(teachers) );
					break;
					
				case 'n':
					String name = input("Enter name to search for: ");
					compactList( searchNames(teachers, name) );
					break;

				case 'i':
					int id = inputInt("Enter a teacher's id number to search: ");
					//  ^^^^^^^^^^^^^^ validate this input ^^^^^^^^^^^^^^ //
                    int find = searchByID(teachers, id);
					if(find != -1)
					{
						edit(teachers, find);
					} else {
						System.out.println("Student ID not found");
					}
					break;

				case 'q':
					continues = false;
					break;
					
				default:
					System.out.println("Wrong choice.");
					break;
			 } //end switch
		}   while (continues);
	}

	/*
	 * Note the following two methods which save an arraylist to a file
	 * and load the contents of a file to an arraylist, respectively.
	 * Could these methods be improved by the use of exceptions (try/catch)?
	 */
	public static void save(ArrayList<Teacher> list) throws IOException
	{	System.out.println("<<< Saving data >>>");
		File teacherFile= new File("teacher.txt");
		FileWriter  fw  = new FileWriter(teacherFile);
		PrintWriter out = new PrintWriter(fw);	// write mode
		for (Teacher t : list)  //loop to save each element ->
		{	out.println( t.getID() );//of the list to the file
			out.println( t.getName() );
			out.println( t.getPhone() );
			out.println( t.getSchoolCode() );
			out.println( t.getEESupervisor() );
			out.println( t.getPPSupervisor() );
		}
		out.close();
		System.out.println("Data file saved."); // optional
	}

	public static void load(ArrayList<Teacher> list) throws IOException
	{	System.out.println("<<< Loading data >>>");
		File teacherFile = new File("teacher.txt");
		if( !teacherFile.exists() )
		{	teacherFile.createNewFile();
			System.out.println("Data file not found. Creating one.");
			addTeacher(list);
		}
		FileReader fr = new FileReader(teacherFile);
		BufferedReader in = new BufferedReader(fr);//read mode
		int newID = 0;
		String newName = "";
		String newPhone = "";
		int newSchool = 0;
		char ee, pp;
		String temp;
		list.clear();
		while ( in.ready() )// read lines while file has content
		{	temp = in.readLine();
			newID = Integer.parseInt(temp);
			newName = in.readLine();
			newPhone = in.readLine();
			temp = in.readLine();
			newSchool = Integer.parseInt(temp);
			ee = in.readLine().charAt(0);
			pp = in.readLine().charAt(0);
			Teacher newTeacher = new Teacher(newID, newName, newPhone, newSchool, ee, pp);
			list.add(newTeacher);
		}
		in.close();
		System.out.println("Data file loaded.");// optional
    }
    

    /********************************************
     * Easy input methods (from old IBIO JETS)  *
     * Note the use of try/catch for exceptions *
     *******************************************/
    
	static String input(String prompt) {
		String inputLine = "";
		System.out.print(prompt);
		try {
			inputLine = (new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in))).readLine();
		} catch (Exception e) {
			String err = e.toString();
			System.out.println(err);
			inputLine = "";
		}
		return inputLine;
	}

	static String inputString(String prompt) {
		return input(prompt);
	}

	static String input() {
		return input("");
	}

	static int inputInt() {
		return inputInt("");
	}

	static double inputDouble() {
		return inputDouble("");
	}

	static char inputChar(String prompt) {
		char result = (char) 0;
		try {
			result = input(prompt).charAt(0);
		} catch (Exception e) {
			result = (char) 0;
		}
		return result;
	}

	static byte inputByte(String prompt) {
		byte result = 0;
		try {
			result = Byte.valueOf(input(prompt).trim()).byteValue();
		} catch (Exception e) {
			result = 0;
		}
		return result;
	}

	static int inputInt(String prompt) {
		int result = 0;
		try {
			result = Integer.valueOf(
				input(prompt).trim()).intValue();
		} catch (Exception e) {
			result = 0;
		}
		return result;
	}

    static long inputLong(String prompt)
    {	long result=0;
        try {
			result=Long.valueOf(input(prompt).trim()).longValue();
		} catch (Exception e) {
			result = 0;
		}
        return result;
    }

    static double inputDouble(String prompt)
    {	double result=0;
        try{	result=Double.valueOf(
                input(prompt).trim()).doubleValue();
        } catch (Exception e) {
			result = 0;
		}
        return result;
    }

}

