package org.weso.wesearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWesearch {

	@Test
	public void testVersion() {
		WesearchImpl ws = new WesearchImpl();
		assertEquals(ws.version(),"0.1");
	}

	@Test
	public void testVersionFailed() {
		WesearchImpl ws = new WesearchImpl();
		Subjects subjects = ws.getSubjects();
		Subject s = subjects.findSubjectByLabel("Ministro");
		assertEquals(s.label(), "Ministro");
	}

}
