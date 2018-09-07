/*package com.ibs.clearing.org.common;

import java.io.IOException;
import com.ibm.mq.MQEnvironment;
import com.ibm.mq.MQException;
import com.ibm.mq.MQGetMessageOptions;
import com.ibm.mq.MQMessage;
import com.ibm.mq.MQPutMessageOptions;
import com.ibm.mq.MQQueue;
import com.ibm.mq.MQQueueManager;
import com.ibm.mq.constants.CMQC;
import com.ibm.mq.constants.MQConstants;

public class MQClient {

	public static void putMessage() throws MQException, IOException {
		MQEnvironment.hostname = "192.168.1.1";
		MQEnvironment.port = 1316;
		MQEnvironment.channel = "MQSERVER.CLIENT.SENDQUEUE";
		MQEnvironment.properties.put(MQConstants.APPNAME_PROPERTY, "MQ-java Program");
		//创建实例连接队列管理器
		MQQueueManager manager = new MQQueueManager("MQSERVER.Client.QUEUEMannager");
		MQQueue putQueue = new MQQueue(manager, "CientQueue.", CMQC.MQOO_OUTPUT, null, null, null);
		MQMessage message = new MQMessage();
		message.writeUTF("MQClient Send Message To MQServer");
		putQueue.put(message,new MQPutMessageOptions());
		putQueue.close();
		manager.disconnect();		
	}
	
	
	public static void getMessage() throws MQException, IOException {
		MQEnvironment.hostname = "192.168.1.1";
		MQEnvironment.port = 1316;
		MQEnvironment.channel = "MQSERVER.CLIENT.SENDQUEUE";
		MQEnvironment.properties.put(MQConstants.APPNAME_PROPERTY, "MQ-java Program");
		//创建实例连接队列管理器
		MQQueueManager manager = new MQQueueManager("MQSERVER.Client.QUEUEMannager");
		MQQueue getQueue = new MQQueue(manager, "CientQueue.", CMQC.MQOO_OUTPUT, null, null, null);
		MQMessage message = new MQMessage();
		getQueue.get(message,new MQGetMessageOptions());
		String mqmessage = message.readUTF();
		System.out.println(mqmessage);
		getQueue.close();
		manager.disconnect();	
	}
		
	public static void main(String[] args) throws MQException, IOException {
		MQClient.putMessage();
		MQClient.getMessage();
	}
}
*/