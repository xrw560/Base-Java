package cn.ncut.java.base.springannotation.customannotation.test;

import java.lang.reflect.Method;
import java.util.Map;

import cn.ncut.java.base.springannotation.customannotation.annotation.RpcService;
import cn.ncut.java.base.springannotation.customannotation.service.HelloService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:spring2.xml")
//@Component
public class MyServer2 implements ApplicationContextAware {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring2.xml");
        Map<String, Object> beans = ctx.getBeansWithAnnotation(RpcService.class);
        for (Object obj : beans.values()) {
            HelloService hello = (HelloService) obj;
            String hello2 = hello.hello("mmmm");//代码写死，不好
            System.out.println(hello2);
        }
    }

	/*@Test
    public void helloTest1() {
	System.out.println("开始junit测试……");
	}*/

    public void setApplicationContext(ApplicationContext ctx)
            throws BeansException {
        Map<String, Object> serviceBeanMap = ctx
                .getBeansWithAnnotation(RpcService.class);
        for (Object serviceBean : serviceBeanMap.values()) {
            try {
                Method method = serviceBean.getClass().getMethod("hello",
                        new Class[]{String.class});
                Object invoke = method.invoke(serviceBean, "bbb");
                System.out.println(invoke);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
