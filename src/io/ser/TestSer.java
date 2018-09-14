package io.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestSer {

	public static void main(String[] args) throws Exception {

		Stu stu = new Stu(2,"jack");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/io/data/stu.data"));   //序列化
		
		out.writeObject(stu);
		
		Stu stu2 = new Stu();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/io/data/stu.data"));   //反序列化

		stu2 = (Stu)in.readObject();
		System.out.println(stu2);

	}

}
