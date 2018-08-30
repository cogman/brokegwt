package com.garbage.client;

import com.google.gwt.core.client.EntryPoint;

import java.util.Optional;
import java.util.logging.Logger;

public class borked implements EntryPoint {
	private static Logger LOG = Logger.getLogger(borked.class.getName());

	public void onModuleLoad() {
		LOG.info(Optional.of("body")
				.map(document::querySelector)
				.map((v) -> v.innerHTML)
				.orElse(null));
		LOG.info(document.querySelector("body").innerHTML);
	}
}
