package org.apache.pulsar.io.ignite;

import lombok.extern.slf4j.Slf4j;

import org.apache.pulsar.functions.api.Record;
import org.apache.pulsar.io.core.KeyValue;

@Slf4j
public class IgniteBytesSink extends IgniteAbstractSink<String, byte[]>{

	@Override
	public KeyValue<String, byte[]> extractKeyValue(Record<byte[]> record) {
		
		return new KeyValue<>(record.getKey().orElse(null), record.getValue());
	}
}
