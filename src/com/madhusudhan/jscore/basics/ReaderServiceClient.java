package com.madhusudhan.jscore.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oreilly.justspring.ch1.ReaderService;

/**
 * This is a client that reads the data using an implementation of IReader.
 * Notice the decoupling between the client and reader - client wouldn't know
 * who the reader is.
 * 
 * @author kondama
 * 
 */
public class ReaderServiceClient {
  private ApplicationContext ctx = null;
  private ReaderService service =  null;

  public ReaderServiceClient() {
    ctx = new ClassPathXmlApplicationContext("reader-beans.xml");
    service = (ReaderService) ctx.getBean("readerService");
  }

  private String fetchData() {
    return service.fetchData();
  }

  public static void main(String[] args) {

    ReaderServiceClient client = new ReaderServiceClient();
    System.out.println("Got data using ReaderService: " + client.fetchData());
  }
}
