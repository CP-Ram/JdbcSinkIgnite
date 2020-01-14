package org.apache.pulsar.functions.api.publishexample;

import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.client.api.Schema;
import org.apache.pulsar.client.api.schema.SchemaDefinition;
import org.apache.pulsar.client.internal.DefaultImplementation;

import com.google.gson.Gson;


public class App 
{
	private static PulsarClient client=null;
	private static Producer<ICustomFunction> producer=null;
    public static void main( String[] args ) throws PulsarClientException
    {
        System.out.println( "Hello World!" );
		//String input ="{\"ENTITYID\":\"abc\",\"ENTITYNAME\":\"0\"}";
		//String output = String.format("%s!", input);
		
		//System.out.println(output);
		 //Gson gson = new Gson();
		//EntitiesTableInfo inputObject1 = gson.fromJson(input, EntitiesTableInfo.class);
		//System.out.println("EntityObject:"+inputObject1);
		
       /// System.out.println(gson.toJson(inputObject1));
        
        //Schema<Object> ss = DefaultImplementation.newAvroSchema(SchemaDefinition.builder().withPojo(EntitiesTableInfo.class).build());
        //Schema<EntitiesTableInfo> s = Schema.AVRO(EntitiesTableInfo.class);
        //System.out.println(s);
      
      	//System.out.println("Object:");
      	
        //Object inputObject = gson.fromJson(input, Object.class);
        //System.out.println(inputObject);
		/*
		if(client==null){
    		client=PulsarClient.builder().serviceUrl("pulsar://192.168.1.65:6650").build();
    	}
    	
		if(producer==null){
			producer = 
					client.newProducer(Schema.AVRO(ICustomFunction.class))
			        .topic("my6-function-output-topic")
			        .create();
		}*/
    	//PulsarClient client = PulsarClient.builder().serviceUrl("pulsar://192.168.1.65:6650").build();
    	//Producer<ICustomFunction> producer = 
		//		client.newProducer(Schema.AVRO(ICustomFunction.class))
		 //       .topic("my6-function-output-topic")
		   //     .create();
    	
    	
    	//producer.send(inputObject1);  
    }
}
