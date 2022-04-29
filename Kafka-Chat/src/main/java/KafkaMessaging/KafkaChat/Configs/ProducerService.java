package KafkaMessaging.KafkaChat.Configs;

import org.apache.kafka.clients.producer.Producer;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

	Producer<String, String> producer;
	
	public void produceMessage(String message) {
		
	}
}
