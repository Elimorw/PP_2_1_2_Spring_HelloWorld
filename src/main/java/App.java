import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat benCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(benCat.getMessage());
        Cat benCat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(benCat2.getMessage());
    }
}