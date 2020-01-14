package org.io.jdbc.ignite.test;



import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.Schema;




/**
 * Hello world!
 *
 */
public class App 
{
	static void connectToPulsar(){
		try{
			
		PulsarClient client = PulsarClient.builder().serviceUrl("pulsar://localhost:6650").build();
		
		Producer<String> stringProducer = client.newProducer(Schema.STRING)
		        .topic("my-topic")
		        .create();
		stringProducer.send("My message");
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		
	}
	
    public static void main( String[] args )
    {  	
    	System.out.println( "main start!" );
    	try{
    		connectToPulsar();    		
		}
		catch(Exception ex){
			System.out.println("---"+ex);
		}    	
    	System.out.println( "main end!" );
    }
}
