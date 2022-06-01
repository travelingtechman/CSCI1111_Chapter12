package chapter12;
import java.util.*;
import java.io.*;

public class Exercise12_15 {
	//main method
	public static void main(String[] args) throws Exception {
		File file = new File("Exercise12_15.txt");
		//checks if the file already exists
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		try (
				//creates a output file
			PrintWriter output = new PrintWriter(file);
		) {
			//writes 100 random ints into the file created by the printwriter
			for (int i = 0; i < 100; i++) {
				output.print(((int)(Math.random() * 500) + 1));
				output.print(" ");
			}
		}
		//creates an Arraylist
		ArrayList<Integer> list = new ArrayList<>();
		try(
				//creates an input file
			Scanner input = new Scanner(file);
		) {
			//reads the data back from the file
			while (input.hasNext()) {
				list.add(input.nextInt());
			}
		}
		//sorts the array list
		Collections.sort(list);
		//prints out the data in increasing order to console
		System.out.print(list.toString());
		System.out.println();
	}
}