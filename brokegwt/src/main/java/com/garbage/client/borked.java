package com.garbage.client;

import com.google.gwt.core.client.EntryPoint;

import java.util.Optional;
import java.util.logging.Logger;

public class borked implements EntryPoint {
	private static Logger LOG = Logger.getLogger(borked.class.getName());

	public void onModuleLoad() {
		LOG.info(Optional.of("body")
				.map(Foo::foo)
				.map((v) -> v.username)
				.orElse(null));
		LOG.info(Foo.foo("body").username);
	}
}
