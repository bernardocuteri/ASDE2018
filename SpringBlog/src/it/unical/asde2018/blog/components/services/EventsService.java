package it.unical.asde2018.blog.components.services;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class EventsService {

	@Scheduled(cron="*/10 * * * * *")
	public void similateEvents() {
		System.out.println("inserting element" + new Date());
		for (BlockingQueue<String> queue : events.values()) {
			try {
				queue.put(new Date().toString());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("done inserting element" + new Date());

	}

	private Map<String, BlockingQueue<String>> events = new HashMap<>();

	public String nextEvent(String id) throws InterruptedException {
		if (!events.containsKey(id)) {
			events.put(id, new LinkedBlockingQueue<>());
		}
		return events.get(id).take();

	}

}