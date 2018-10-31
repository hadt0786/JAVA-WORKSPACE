package fileprocessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockFileReader {
	
	String filePath = null; 
	
	public StockFileReader(String filePath) {
		this.filePath = filePath;
		
	}
	
	public List<String> getHeaders() throws IOException{
		String line = readFirstLine(filePath);
		String [] header = line.split(",");
		List<String> values = new ArrayList<String>();
		values = Arrays.asList(header);
		return values;
	}
	static String readFirsLine(String path) throws IOException{
		try {
			BufferedReader br = new BufferedReader(new FileReader(path)))
			{
				return br.readLine();
			}
		}
	}

}
