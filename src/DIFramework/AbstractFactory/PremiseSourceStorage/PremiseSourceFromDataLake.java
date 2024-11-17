package DIFramework.AbstractFactory.PremiseSourceStorage;

import DIFramework.AbstractFactory.IngestToDatabase;

public class PremiseSourceFromDataLake implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("Premise: pull data from DataLake and ingest");
    }
}
