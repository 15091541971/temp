package com.test.zookeper;

import java.io.IOException;

import org.apache.zookeeper.AsyncCallback.DataCallback;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.data.Stat;
import org.apache.zookeeper.ZooKeeper;
import org.junit.Test;
public class ZookeperClient {
	@Test
public void test() throws IOException, KeeperException, InterruptedException {
		ZooKeeper  zk = new ZooKeeper("118.24.115.171:2181", 3000, new Watcher() {
			@Override
			public void process(WatchedEvent event) {
				// TODO Auto-generated method stub
			        if (event.getType() == Event.EventType.None) {
			        }
			}
		});
		String path1 = zk.create("/zk-test-ephemeral-", "".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
		int n=zk.exists("/zk-test-ephemeral-", true).getVersion();
		zk.setData("/zk-test-ephemeral-", "7878gjhghgh97887".getBytes(), n);
		zk.getData("/zk-test-ephemeral-", true, new DataCallback() {
			public void processResult(int rc, String path, Object ctx, byte[] data, Stat stat) {
				System.out.println("执行回调方法");
				System.out.println(rc+"\t"+path+"\t"+ctx+"\t"+data);
			}
		}, zk.getState());
		byte[] bs=zk.getData("/zk-test-ephemeral-", new Watcher() {
			@Override
			public void process(WatchedEvent event) {
			}
		}, null);
		System.out.println(bs.length);
		System.out.println(new String(bs));
		/*int n=zk.exists("/zk", true).getVersion();
		System.out.println(n);*/
	
		//zk.setData("/zk", "7878gjhghgh97887".getBytes(), n);
}
}
