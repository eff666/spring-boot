package hello;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;


/**
 * @RestController 返回json字符串的数据，直接可以编写RESTFul的接口
 *
 * 在spring boot中来用@RestController来标注返回json给的数据
 *
 * 其实在其实Spring Boot也是引用了JSON解析包jackson-databind，它是包含在spring-boot-starter-parent当中的，
 * 因此自然就可以在对象上使用Jackson提供的json属性的注解。
 */
@RestController


/**
 * @RequestMapping 注解表明该方法处理那些URL对应的HTTP请求，也就是我们常说的URL路由（routing)，请求的分发工作是有Spring完成的
 */
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/greeting")
    public Greeting greetingToWorld(@RequestParam(value="name", defaultValue="World") String name) {
        System.out.println(counter.incrementAndGet());
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping(value = "/greeting/java", method = RequestMethod.GET)
    public Greeting greetingToJava(@RequestParam(value="name", defaultValue="Java") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping(value = "/greeting/scala", method = RequestMethod.POST)
    public Greeting greetingToScala(@RequestParam(value="name", defaultValue="Scala") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping("/greeting/{id}")
    public Greeting greetingToId(@PathVariable("id") int id) {
        return new Greeting(counter.incrementAndGet(), String.format(template, id));
    }
}
