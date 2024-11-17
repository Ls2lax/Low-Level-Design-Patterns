package Factory;

public class FactoryOfSource {

    public IngestToDatabase getInstanceOfSource(String source) {
        IngestToDatabase sourceSystemObject = null;
        if(source.equals("API")) {
            sourceSystemObject = new SourceDataFromAPI();
        } else if(source.equals("FILE")) {
            sourceSystemObject = new SourceDataFromFile();
        } else if(source.equals("DATALAKE")) {
            sourceSystemObject = new SourceDataFromDataLake();
        }
        return sourceSystemObject;
    }

}
