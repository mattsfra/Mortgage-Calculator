import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

public class CSVReader {
	private static final int MONTHS_IN_YEAR=12;
	
	public static void main(String[] args) throws IOException{
		//String fileName = "prospects.txt";
		String path = args[0];
		
		List<Prospect> prospects = new CsvToBeanBuilder(new FileReader(path)).withType(Prospect.class).withSkipLines(1).build().parse();
		
		// calculate mortgage payment for each person, and print it out along with all other customer info
        ListIterator<Prospect> prospectIterator
        = prospects.listIterator();
        
        Prospect temp = null;
		
		int prospectNr = 0;
		while(prospectIterator.hasNext()) {
			temp = prospects.get(prospectNr);
			int years = temp.getYears();
			double total = temp.getTotal();
			String name = temp.getName();
			
			double payment = temp.getFixedPayment();
			
			prospectNr++;
			System.out.println(temp.toString(prospectNr));
			prospectIterator.next();
			
			
		}
		
		
		
	}
	
	
	
}
