package Factory;

public class SourceDataFromAPI implements IngestToDatabase{
    @Override
    public void ingestData() {
        System.out.println("get data from file api and ingest");
    }
}
