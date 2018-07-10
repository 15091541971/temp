package demo.HDFS_DEMO;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.ConfigurationDecoder;
import org.apache.commons.configuration2.ImmutableConfiguration;
import org.apache.commons.configuration2.interpol.ConfigurationInterpolator;
import org.apache.commons.configuration2.interpol.Lookup;
import org.apache.commons.configuration2.io.DefaultFileSystem;
import org.apache.commons.configuration2.sync.LockMode;
import org.apache.commons.configuration2.sync.Synchronizer;
import org.apache.commons.io.FileSystemUtils;



public class FileSystem {
public static void main(String[] args) throws IOException {
	 String uri="hdfs://127.0.0.1:9000/";   //hdfs 地址
     String local="C:/Users/Administrator/Desktop/a.txt";  //本地路径
     String remote="hdfs://127.0.0.1:9000/Workspace/houlinlin";
     Configuration conf = new Configuration() {
		
		@Override
		public void unlock(LockMode arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setSynchronizer(Synchronizer arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void lock(LockMode arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public Synchronizer getSynchronizer() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public ImmutableConfiguration immutableSubset(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String[] getStringArray(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getString(String arg0, String arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getString(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Short getShort(String arg0, Short arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public short getShort(String arg0, short arg1) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public short getShort(String arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Object getProperty(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Properties getProperties(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Long getLong(String arg0, Long arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public long getLong(String arg0, long arg1) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public long getLong(String arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public <T> List<T> getList(Class<T> arg0, String arg1, List<T> arg2) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> List<T> getList(Class<T> arg0, String arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<Object> getList(String arg0, List<?> arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<Object> getList(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Iterator<String> getKeys(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Iterator<String> getKeys() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Integer getInteger(String arg0, Integer arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int getInt(String arg0, int arg1) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getInt(String arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Float getFloat(String arg0, Float arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public float getFloat(String arg0, float arg1) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public float getFloat(String arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public String getEncodedString(String arg0, ConfigurationDecoder arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getEncodedString(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Double getDouble(String arg0, Double arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public double getDouble(String arg0, double arg1) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public double getDouble(String arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public <T> Collection<T> getCollection(Class<T> arg0, String arg1, Collection<T> arg2, Collection<T> arg3) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> Collection<T> getCollection(Class<T> arg0, String arg1, Collection<T> arg2) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Byte getByte(String arg0, Byte arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public byte getByte(String arg0, byte arg1) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public byte getByte(String arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Boolean getBoolean(String arg0, Boolean arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean getBoolean(String arg0, boolean arg1) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean getBoolean(String arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public BigInteger getBigInteger(String arg0, BigInteger arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public BigInteger getBigInteger(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public BigDecimal getBigDecimal(String arg0, BigDecimal arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public BigDecimal getBigDecimal(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Object getArray(Class<?> arg0, String arg1, Object arg2) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Object getArray(Class<?> arg0, String arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> T get(Class<T> arg0, String arg1, T arg2) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T> T get(Class<T> arg0, String arg1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean containsKey(String arg0) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public Configuration subset(String arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void setProperty(String arg0, Object arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setInterpolator(ConfigurationInterpolator arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void installInterpolator(Map<String, ? extends Lookup> arg0, Collection<? extends Lookup> arg1) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public ConfigurationInterpolator getInterpolator() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void clearProperty(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addProperty(String arg0, Object arg1) {
			// TODO Auto-generated method stub
			
		}
	};
	org.apache.commons.configuration2.io.FileSystem  fs=new DefaultFileSystem();
	fs.locateFromURL("d://log", "d://logs");
	 
    // org.apache.commons.configuration2.io.FileSystem fs =  org.apache.commons.configuration2.io.FileSystem.
}
}
