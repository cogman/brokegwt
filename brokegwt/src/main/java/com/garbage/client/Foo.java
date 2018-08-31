package com.garbage.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Foo {
	@JsMethod(name = "foo", namespace = JsPackage.GLOBAL)
	public static native Native foo(String token);
}
