package DIFramework.AbstractFactory.PremiseSourceStorage;

import DIFramework.AbstractFactory.IngestToDatabase;

public class PremiseSourceFromAPI implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("Premise: pull from API and ingest");
    }
}
