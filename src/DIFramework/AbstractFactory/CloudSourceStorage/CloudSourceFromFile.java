package DIFramework.AbstractFactory.CloudSourceStorage;

import DIFramework.AbstractFactory.IngestToDatabase;

public class CloudSourceFromFile implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("Cloud: pull data from file and ingest");
    }
}
