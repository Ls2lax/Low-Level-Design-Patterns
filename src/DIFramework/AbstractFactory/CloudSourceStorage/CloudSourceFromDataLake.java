package DIFramework.AbstractFactory.CloudSourceStorage;

import DIFramework.AbstractFactory.IngestToDatabase;

public class CloudSourceFromDataLake implements IngestToDatabase {
    @Override
    public void ingestData() {
        System.out.println("Cloud: pull data from DataLake and ingest");
    }
}
