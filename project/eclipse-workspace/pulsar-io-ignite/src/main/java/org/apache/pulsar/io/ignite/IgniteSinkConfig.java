package org.apache.pulsar.io.ignite;

import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

import org.apache.pulsar.io.core.annotations.FieldDoc;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class IgniteSinkConfig implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	@FieldDoc(
	        required = true,
	        defaultValue = "",
	        help =
	            "The number of acknowledgments the producer requires the leader to have received "
	          + "before considering a request complete. This controls the durability of records that are sent.")
	    private String acks;
	    @FieldDoc(
	        defaultValue = "16384L",
	        help =
	            "The batch size batch records together before sending them to ignite.")
	    private long batchSize = 16384L;
	    @FieldDoc(
	        defaultValue = "1048576L",
	        help =
	            "The maximum size of a request in bytes.")
	    private long maxRequestSize = 1048576L;
	    @FieldDoc(
	        required = true,
	        defaultValue = "",
	        help =
	            "The Pulsar topic that is used for Pulsar moving messages to.")
	    private String topic;
	    
	    public static IgniteSinkConfig load(Map<String, Object> map) throws IOException {
	        ObjectMapper mapper = new ObjectMapper();
	        return mapper.readValue(new ObjectMapper().writeValueAsString(map), IgniteSinkConfig.class);
	    }
}
