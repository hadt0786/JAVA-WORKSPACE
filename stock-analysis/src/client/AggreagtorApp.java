package client;

public class AggreagtorApp {
	
	public static void main(String[] args) throws IOException{
		MaxAggreagator agg = new MaxAggregator();
		AggregatorProcessor <MaxAggregator> aggsProcessor = new AggregatorProcessor <MaxAggregator> (agg,"table.csv");
		double value - aggsProcessor.runAggreagator(1);
		System.out.println(value);
	}

}
