package com.ibs.clearing.org.common;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.springframework.scheduling.config.AnnotationDrivenBeanDefinitionParser;
import org.springframework.scheduling.config.ExecutorBeanDefinitionParser;
import org.springframework.scheduling.config.ScheduledTasksBeanDefinitionParser;
import org.springframework.scheduling.config.SchedulerBeanDefinitionParser;

public class BusinessTimerTaskHandle extends NamespaceHandlerSupport {

	public void init() {	
		this.registerBeanDefinitionParser("annotation-driven", new AnnotationDrivenBeanDefinitionParser());
		this.registerBeanDefinitionParser("executor", new ExecutorBeanDefinitionParser());
		this.registerBeanDefinitionParser("scheduled-tasks", new ScheduledTasksBeanDefinitionParser());
		this.registerBeanDefinitionParser("scheduler", new SchedulerBeanDefinitionParser());		
	}
}
