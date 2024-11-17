package DIFramework.AbstractFactory.PremiseSourceStorage;

import DIFramework.AbstractFactory.IngestToDatabase;

public class PremiseSourceFromFile implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("Premise: pull data from File and ingest");
    }
}
