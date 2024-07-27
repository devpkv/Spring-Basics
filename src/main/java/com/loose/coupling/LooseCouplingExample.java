package com.loose.coupling;


// We are creating separate provider for each data source
// So, data sources will not be depends on each other
public class LooseCouplingExample {

    public static void main(String[] args) {

        // User User Data base Provider
        UserDataProvider userDatabaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(userDatabaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());


        // Web services provider
        UserDataProvider webServicesProvider = new WebServicesProvider();
        UserManager userManagerWithWebS = new UserManager(webServicesProvider);
        System.out.println(userManagerWithWebS.getUserInfo());


        // MongoDB Provider
        UserDataProvider mongoDBProvider = new MongoDBProvider();
        UserManager userManagerWithMongoDB = new UserManager(mongoDBProvider);
        System.out.println(userManagerWithMongoDB.getUserInfo());
    }
}
