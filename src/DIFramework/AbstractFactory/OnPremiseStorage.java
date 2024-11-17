package DIFramework.AbstractFactory;

import DIFramework.*;
import DIFramework.AbstractFactory.PremiseSourceStorage.PremiseSourceFromAPI;
import DIFramework.AbstractFactory.PremiseSourceStorage.PremiseSourceFromDataLake;
import DIFramework.AbstractFactory.PremiseSourceStorage.PremiseSourceFromFile;

public class OnPremiseStorage implements OnStorage {
    @Override
    public IngestToDatabase getInstanceOfSource(String source) {
        if(source.equals("API")) return new PremiseSourceFromAPI();
        if(source.equals("FILE")) return new PremiseSourceFromFile();
        else if(source.equals("DATALAKE")) return new PremiseSourceFromDataLake();
        else return null;
    }
}
