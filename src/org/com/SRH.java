package org.com;
import java.io.File;
import java.io.IOException;
public class SRH {
	public static void main(String[] args) throws IOException {
	File f=new File("E:\\BGMI");
	boolean txt=f.mkdir();
	System.out.println(txt);
	File q=new File("E:\\BGMI\\LOOT");
	boolean loot=q.createNewFile();
	System.out.println(loot);
	boolean read=f.canRead();
	System.out.println(read);
	boolean write=f.canWrite();
	System.out.println(write);
	boolean exist=f.exists();
	System.out.println(exist);
	File a=new File("E:\\");
	String [] List=a.list();
	for (String j:List) {
		System.out.println(j);
	}
	File [] files=a.listFiles();
	for(File l:files) {
		System.out.println(l);
	}
	}
}
