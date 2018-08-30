package com.garbage.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative = true, namespace = GLOBAL)
public class document {
	@JsMethod(name = "querySelector")
	public static native Native querySelector(String token);
}
