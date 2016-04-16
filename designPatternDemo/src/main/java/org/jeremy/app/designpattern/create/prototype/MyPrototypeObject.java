package org.jeremy.app.designpattern.create.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyPrototypeObject implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private int base;

	private Integer obj;

	public Object clone() throws CloneNotSupportedException {
		// 因为Cloneable接口是个空接口，你可以任意定义实现类的方法名
		// 如cloneA或者cloneB，因为此处的重点是super.clone()这句话
		// super.clone()调用的是Object的clone()方法
		return (MyPrototypeObject) super.clone();
	}

	public Object deepClone() throws IOException, ClassNotFoundException {
		/* 写入当前对象的二进制流 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		/* 读出二进制流产生的新对象 */
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return the obj
	 */
	public Integer getObj() {
		return obj;
	}

	/**
	 * @param obj the obj to set
	 */
	public void setObj(Integer obj) {
		this.obj = obj;
	}

}
