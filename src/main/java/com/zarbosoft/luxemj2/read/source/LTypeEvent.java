package com.zarbosoft.luxemj2.read.source;

import com.zarbosoft.interface1.Configuration;
import com.zarbosoft.luxemj2.read.LuxemEvent;
import com.zarbosoft.pidgoon.events.Event;

@Configuration(name = "type")
public class LTypeEvent implements LuxemEvent {

	public LTypeEvent(final String string) {
		this.value = string;
	}

	public LTypeEvent() {
	}

	@Configuration
	public String value;

	@Override
	public boolean matches(final Event event) {
		return event.getClass() == getClass() && (value == null || value.equals(((LTypeEvent) event).value));
	}

	@Override
	public String toString() {
		return String.format("(%s)", value == null ? "*" : value);
	}
}
