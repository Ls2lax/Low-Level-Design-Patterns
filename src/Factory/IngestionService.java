package Factory;

public class IngestionService {
    private FactoryOfSource factoryOfSource;
    public IngestionService(FactoryOfSource factoryOfSource) {
        this.factoryOfSource = factoryOfSource;
    }
    public void ingestDataToMyDatabase(String source) {
        IngestToDatabase sourceObject = factoryOfSource.getInstanceOfSource(source);
        sourceObject.ingestData();
    }
}
