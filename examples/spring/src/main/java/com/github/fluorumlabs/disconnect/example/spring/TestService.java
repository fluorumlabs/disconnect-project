package com.github.fluorumlabs.disconnect.example.spring;

import com.github.fluorumlabs.disconnect.core.annotations.AllowClientCalls;
import com.github.fluorumlabs.disconnect.spring.server.DynamicStream;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

/**
 * Created by Artem Godin on 2/11/2020.
 */
@Service
public class TestService {
	private final CopyOnWriteArrayList<DynamicStream<Message>> messageStreams = new CopyOnWriteArrayList<>();

	@AllowClientCalls
	public void sendMessage(String message) {
		int users = messageStreams.size();
		String timeStampedMessage = message == null ? null : new Date() + ": " + message;
		messageStreams.forEach(client -> client.push(new Message(timeStampedMessage, users)));
	}

	@AllowClientCalls
	public Stream<Message> getMessageStream() {
		DynamicStream<Message> dynamicStream = new DynamicStream<>();
		dynamicStream.onClose(() -> {
			messageStreams.remove(dynamicStream);
			sendMessage(null); // Send empty message to notify of leaving user
		});
		messageStreams.add(dynamicStream);
		sendMessage(null); // Send empty message to notify of new user
		return dynamicStream;
	}

	public static class Message implements Serializable {
		public String message;

		public int userCount;

		public Message() {
		}

		public Message(String message, int userCount) {
			this.message = message;
			this.userCount = userCount;
		}
	}
}
