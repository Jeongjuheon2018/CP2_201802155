package gameTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.ChocholateJar;

class ChocholateJarTest {

	@Test
	void testChocholateJar() {
		ChocholateJar jar = new ChocholateJar();
		assertEquals(13, jar.getChochlate());
		assertEquals(1, jar.getChilli());
	}

	@Test
	void testChocholateJarInt() {
		ChocholateJar jar = new ChocholateJar(11);
		assertEquals(11, jar.getChochlate());
		assertEquals(1, jar.getChilli());
	}

	@Test
	void testGetItem() {
		ChocholateJar jar = new ChocholateJar();
		assertEquals(14, jar.getItem());
	}
	@Test
	void testGetChochlate() {
		ChocholateJar jar = new ChocholateJar();
		assertEquals(13, jar.getChochlate());
	}

	@Test
	void testGetChilli() {
		ChocholateJar jar = new ChocholateJar();
		assertEquals(13, jar.getChochlate());
	}

	@Test
	void testTakeItem() {
		ChocholateJar jar = new ChocholateJar();
		assertEquals(14, jar.getItem());
		jar.takeItem(3);
		assertEquals(11, jar.getItem());
		jar.takeItem(2);
		assertEquals(9,jar.getItem());
		jar.takeItem(1);
		assertEquals(8,jar.getItem());
		
	}

	@Test
	void testStatus() {
		ChocholateJar jar = new ChocholateJar();
		assertEquals("[ бс бр бр бр бр бр бр бр бр бр бр бр бр бр ]", jar.status());
		jar.takeItem(3);
		assertEquals("[ бс бр бр бр бр бр бр бр бр бр бр ]", jar.status());
	}

	@Test
	void testIsEmpty() {
		ChocholateJar jar = new ChocholateJar();
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(2);
		assertTrue(jar.isEmpty());
		
		
	}

}
