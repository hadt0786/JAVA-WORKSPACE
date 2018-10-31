package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

	// this method will read data from a Csv file and return as a list

	public List<String[]> read(String file) {
		List<String[]> data = new LinkedList<>();
		String dataRow;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((dataRow = br.readLine()) != null)// ; putting a semiclon after while gives you nullpointer exception
			{

				String[] dataRecords = dataRow.split(",");
				data.add(dataRecords);

			}

		} catch (FileNotFoundException e) {
			System.out.println("could not find file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("could read from file");
			e.printStackTrace();
		}
		// go to bankaccount app
		return data;
	}

}
