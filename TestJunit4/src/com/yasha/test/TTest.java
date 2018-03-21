package com.yasha.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yasha.T;

public class TTest {

	@Test
	public void testAdd() {
		int z = new T().add(2, 4);
		// 判断z==6,以往的assert
		assertEquals(6, z);
	}

	@Test
	public void testDivide() {
		// 测试T类中的divide方法
		int z = new T().divide(8, 2);
		System.out.println(z);
	}

}
