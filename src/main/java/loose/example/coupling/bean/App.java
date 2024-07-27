package loose.example.coupling.bean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// We are creating separate provider for each data source
// So, data sources will not be depends on each other
public class App {

    public static void main(String[] args) {

        // User User Data base Provider
        ApplicationContext context = new ClassPathXmlApplicationContext("looseCouplingBeanContext.xml");
        UserManager userManager = (UserManager) context.getBean("userManager");
        System.out.println(userManager.getUserInfo());


        // Web services provider
        UserManager userWebServiceManager = (UserManager) context.getBean("userWebServiceManager");
        System.out.println(userWebServiceManager.getUserInfo());


        // MongoDB Provider
        UserManager userMongoDBManager = (UserManager) context.getBean("userMongoDBManager");
        System.out.println(userMongoDBManager.getUserInfo());
    }
}
