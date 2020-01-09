package com.example.eurekaserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaServerApplicationTests {
	Integer count = 0;

	@Test
	public void publicvoidgetCount() {
		count ++;
		System.out.println(count);
	}

	public void publicvoidthreadMethod(int j){
		int i = 1;
		j = j + i;
	}

	public void publicclassThreadDemo(){
		int count = 0;
		// 记录方法的命中次数
		publicsynchronizedvoidthreadMethod(1);
	}

	public void publicsynchronizedvoidthreadMethod(int j){
		count++ ;
		int i = 1;
		j = j + i;
	}
}

