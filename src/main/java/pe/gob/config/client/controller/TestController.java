package pe.gob.config.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RefreshScope
public class TestController {

	@Value("${jsa.cassandra.keyspace-name}")
	private String cassandraName;
	
	@RequestMapping(path = "/config", method = RequestMethod.GET)
	public String getCassandraName() {
		return cassandraName;
	}

}

