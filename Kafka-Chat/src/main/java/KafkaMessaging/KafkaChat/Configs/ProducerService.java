package KafkaMessaging.KafkaChat.Configs;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
	private static String TOPIC = "abc";
	KafkaTemplate<String, String> kafkaTemplate;

	public void produceMessage(String message) {
		kafkaTemplate.send(TOPIC, message);
	}
}
