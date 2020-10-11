package kurinD_Lab6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook g1;
	GradeBook g2;

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(79.0);
		g1.addScore(39.0);
		g1.addScore(65.0);
		g1.addScore(67.0);
		g1.addScore(10.0);

		
		
		g2.addScore(99);
	    g2.addScore(10);
	    g2.addScore(77);
	    g2.addScore(43);
		g2.addScore(87);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("79.0 39.0 65.0 67.0 10.0 "));	
	    assertTrue(g2.toString().equals("99.0 10.0 77.0 43.0 87.0 "));
	}

	@Test
	void testSum() {
		assertEquals(260, g1.sum(), .0001);
		assertEquals(316, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(10, g1.minimum(), .001);
		assertEquals(10, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(250, g1.finalScore(), .0001);
		assertEquals(306, g2.finalScore(), .0001);
	}

	@Test
	void testGetScoresSize() {
		assertEquals(5, g1.getScoresSize());
		assertEquals(5, g2.getScoresSize());
	}

	@Test
	void testToString() {
		assertTrue(g1.toString().equals("79.0 39.0 65.0 67.0 10.0 "));
		assertTrue(g2.toString().equals("99.0 10.0 77.0 43.0 87.0 "));
	}

}
