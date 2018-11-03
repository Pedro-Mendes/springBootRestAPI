package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework" , "Spring Framework Description"),
				new Topic("angular", "Angular Framework" , "Angular Framework Description"),
				new Topic("java", "Java language" , "Java Description")
				);
	}
}
