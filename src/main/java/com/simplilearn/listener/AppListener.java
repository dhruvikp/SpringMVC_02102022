package com.simplilearn.listener;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.simplilearn.event.SweetEvent;

@Component
public class AppListener {

	@EventListener
	public void tomcatStarted(ContextStartedEvent cse) {
		System.out.println("Tomcat Started..");
	}

	@EventListener
	public void tomcatStarted1(ContextStartedEvent cse) {
		System.out.println("Tomcat Started!..");
	}

	@EventListener
	public void tomcatStarted2(ContextStartedEvent cse) {
		System.out.println("Tomcat Started %%%..");
	}

	@EventListener
	public void tomcatStarted2(ContextStoppedEvent cse) {
		System.out.println("Tomcat Stopped %%%..");
	}
	
	
	@EventListener
	public void dhruvik(SweetEvent sweetEvent) {
		System.out.println("Dhruvik received sweet..");
	}
	
	@EventListener
	public void akanksha(SweetEvent sweetEvent) {
		System.out.println("Akanksha received sweet..");
	}
	
	@EventListener
	public void ramki(SweetEvent sweetEvent) {
		System.out.println("ramki received sweet..");
	}
}
