package com.ibm.training.JDBC_XyzBank;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
//    public static void main( String[] args )//    {
//        System.out.println( "Hello World!" );
//    }
	
	public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
       
       BankDao dao = context.getBean("namedDao", BankDao.class);
       
//       System.out.println("Customer Name :" + dao.getCustomerName(143143));
//       System.out.println("Customer Balance: " + dao.getBalance(143143));
       
    }
}
