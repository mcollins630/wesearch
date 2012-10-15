package org.weso.wesearch;

import static org.junit.Assert.*;

import org.weso.utils.NotImplementedException;
import org.junit.Test;
import org.weso.utils.WesearchException;
import org.weso.wesearch.context.Context;
import org.weso.wesearch.context.impl.DefaultContext;
import org.weso.wesearch.domain.Matter;
import org.weso.wesearch.domain.Matters;

public class TestWesearch {

	@Test
	public void testVersion() {
		Context ctx = new DefaultContext();
		JenaWesearch ws = new JenaWesearch(ctx);
		assertEquals(ws.version(),"0.1");
	}

	@Test(expected=NotImplementedException.class)
	public void testGetMatters() throws WesearchException {
	 Context ctx = new DefaultContext();
	 JenaWesearch ws = new JenaWesearch(ctx);
	 Matters ms = ws.getMatters("");
	 Matter s = ms.findMatter("Ministro");
	 assertEquals(s.label(), "Ministro");
	}

}
