package com.madhusudhan.jscore.basics;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oreilly.justspring.ch1.IReader;


/**
 * This is a client that reads the data using FileReader. Notice the tight
 * coupling between the client and reader.
 *
 * @author kondama
 *
 */
public class DataReaderClient {

	private ApplicationContext ctx = null;
	
    private IReader reader = null;

    public DataReaderClient() {
    	ctx = new ClassPathXmlApplicationContext("reader-beans.xml");
    }

    private String fetchData() {
    	reader = (IReader)ctx.getBean("fileReader");
   
        return reader.read();
    }

    public static void main(String[] args) {

        DataReaderClient client = new DataReaderClient();
        System.out.println("Got data using interface design priciple: " + client.fetchData());
    }
}
