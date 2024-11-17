package DIFramework.AbstractFactory.CloudSourceStorage;

import DIFramework.AbstractFactory.IngestToDatabase;

public class CloudSourceFromAPI implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("Cloud: pull data from API and ingest");
    }
}
