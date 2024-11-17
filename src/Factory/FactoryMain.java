package Factory;

public class FactoryMain {

    public static void main(String[] args) {
        IngestionService ingestionService = new IngestionService(new FactoryOfSource());
        ingestionService.ingestDataToMyDatabase("API");
    }
}
