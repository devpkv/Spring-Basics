package loose.example.coupling.bean;

public class WebServicesProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "Fetching data from Web Services";
    }
}
