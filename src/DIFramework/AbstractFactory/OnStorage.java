package DIFramework.AbstractFactory;

public interface OnStorage {
    default void ingestDataToMyDatabase(String source) {

        IngestToDatabase sourceObject = getInstanceOfSource(source);
        sourceObject.ingestData();;
    }
    IngestToDatabase getInstanceOfSource(String source);
}
