package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 使应用程序可执行
 *
 * 虽然可将此服务打包为war部署到外部服务器上，但是可以利用下面更简单的方法是应用程序可执行。
 * 我们可以在一个可执行的jar文件中打包所有的内容，由一个main()方法驱动。可以使用spring的支持将tomcat容器嵌入http运行时，而不用部署到外部实例。
 */
@SpringBootApplication
/**
 * @SpringBootApplication 申明让spring boot自动给程序进行必要的配置，它默认等同于 @Configuration ， @EnableAutoConfiguration 和 @ComponentScan
 */
public class Application {

    public static void main(String[] args) {
        //run()方法会创建一个Spring应用上下文
        SpringApplication.run(Application.class, args);
    }
}
