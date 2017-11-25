package com.liushiyao.spring.aop.annotation;


import com.liushiyao.spring.aop.annotation.service.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
      AOP 使用注解的方式


 */
public class AOPDemo {


  public static void main(String []a){

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
        "applicationContext3.xml");
    MyService service = (MyService) applicationContext.getBean("myServiceImp");
   /* MyService myService = new MyServiceImp();
    myService.show();*/

  }


}
