package DIFramework.AbstractFactory;

import DIFramework.*;
import DIFramework.AbstractFactory.CloudSourceStorage.CloudSourceFromAPI;
import DIFramework.AbstractFactory.CloudSourceStorage.CloudSourceFromDataLake;
import DIFramework.AbstractFactory.CloudSourceStorage.CloudSourceFromFile;

public class OnCloudStorage implements OnStorage {
    @Override
    public IngestToDatabase getInstanceOfSource(String source) {
        if(source.equals("API")) return new CloudSourceFromAPI();
        else if(source.equals("FILE")) return new CloudSourceFromFile();
        else if(source.equals("DATALAKE")) return new CloudSourceFromDataLake();
        return null;
    }
}
