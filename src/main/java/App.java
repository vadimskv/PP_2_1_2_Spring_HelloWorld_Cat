import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                 applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean2.getMessage());
        Cat beanCat = applicationContext.getBean("cat", Cat.class);
        System.out.println(beanCat.getName());
        Cat beanCat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(beanCat2.getName());
        System.out.println("_____________");
        System.out.println(bean.equals(bean2));
        System.out.println(beanCat.equals(beanCat2));
    }
}