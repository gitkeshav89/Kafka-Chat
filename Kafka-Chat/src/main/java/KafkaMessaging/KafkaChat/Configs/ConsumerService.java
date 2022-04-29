package KafkaMessaging.KafkaChat.Configs;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@KafkaListener(topics = { "abc" }, groupId = "testgroup")
	public void KafkaListener(String data) {
		System.out.println("consumed : " + data);
	}
}
