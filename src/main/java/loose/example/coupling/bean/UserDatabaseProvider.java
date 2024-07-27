package loose.example.coupling.bean;

public class UserDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "Fetching data from database";
    }
}
