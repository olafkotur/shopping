import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Interface i = new Interface();
		getItems();

	}

	public static void getItems() throws FileNotFoundException {
		ArrayList <String> itemList = new ArrayList <String>();

		Scanner scan = new Scanner(new File("resources/Items.txt"));
		while (scan.hasNextLine()) {
    		itemList.add(scan.nextLine());
		}
		scan.close();

		System.out.println(itemList);
	}
}

