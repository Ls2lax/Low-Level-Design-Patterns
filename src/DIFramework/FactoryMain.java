package DIFramework;

import DIFramework.AbstractFactory.OnStorage;

public class FactoryMain {

    public static void main(String[] args) {
        StorageFactory storageFactory = new StorageFactory();

        OnStorage onPremiseObject = storageFactory.getStorageService("PREMISE");
        onPremiseObject.ingestDataToMyDatabase("API");
        System.out.println();

        OnStorage onCloudObject = storageFactory.getStorageService("CLOUD");
        onCloudObject.ingestDataToMyDatabase("DATALAKE");
    }
}
