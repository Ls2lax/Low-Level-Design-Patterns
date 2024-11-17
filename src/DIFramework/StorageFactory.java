package DIFramework;

import DIFramework.AbstractFactory.OnCloudStorage;
import DIFramework.AbstractFactory.OnPremiseStorage;
import DIFramework.AbstractFactory.OnStorage;

public class StorageFactory {

    public OnStorage getStorageService(String storageType) {
        if(storageType.equals("CLOUD")) return new OnCloudStorage();
        else if(storageType.equals("PREMISE")) return new OnPremiseStorage();
        else return null;
    }
}
