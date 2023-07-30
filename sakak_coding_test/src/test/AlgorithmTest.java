package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import sakak_coding_test.Algorithm;

public class AlgorithmTest {

	@Test
	@DisplayName("1.입력값 (n) 의 범위 확인하기")
	public void nSizeTest() {
		int n = 5;
		assertTrue(n > 3 && n < 100, "n의 값은 3보다 크고 100보다 작습니다.");
	}
	
	@Test
	@DisplayName("2.가운데 두자리 수 (m) 결과값 확인하기")
	public void mResultTest() {
		Algorithm algorithm =  new Algorithm();
		algorithm.setN(5);
		Algorithm.checkResultAndM();
		String result = algorithm.getResult();
		String m = algorithm.getM();
		
		assertEquals("111221", result);
		assertEquals("12", m);
		
	}
	
	
}
