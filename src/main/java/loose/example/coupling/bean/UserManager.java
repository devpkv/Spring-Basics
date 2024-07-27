package loose.example.coupling.bean;

public class UserManager {

    private UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo()
    {
        return userDataProvider.getUserDetails();
    }
}
