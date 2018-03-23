package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void test1(){
		String t = Triangle.triangleKind(-1, 0, 4);
		assertEquals("Non-triangle", t);
	}
	
	@Test
	public void test2(){
		String t = Triangle.triangleKind(7, 14, 4);
		assertEquals("Non-triangle", t);
	}
	
	@Test
	public void test3(){
		String t = Triangle.triangleKind(5, 5, 7);
		assertEquals("isosceles", t);
	}
	
	@Test
	public void test4(){
		String t = Triangle.triangleKind(5, 5, 5);
		assertEquals("equilateral", t);
	}
	
	@Test
	public void test5(){
		String t = Triangle.triangleKind(5, 8, 7);
		assertEquals("scalene", t);
	}
}
