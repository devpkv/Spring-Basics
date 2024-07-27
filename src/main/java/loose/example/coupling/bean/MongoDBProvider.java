package loose.example.coupling.bean;

public class MongoDBProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "Fetching data from Mongo DB";
    }
}
