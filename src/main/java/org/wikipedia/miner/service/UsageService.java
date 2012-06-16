package org.wikipedia.miner.service;

import org.w3c.dom.Element;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;

public class UsageService extends Service{
	
	DateFormat df ;

	public UsageService() {
		super("meta","Provides information on how much you have been using the wikipedia miner web services, and what your limits are",
				"<p>Provides information on how much you have been using the wikipedia miner web services, and what your limits are.</p>",
				false, false
				);
	}

	@Override
	public Element buildWrappedResponse(HttpServletRequest request,
			Element response) throws Exception {
		
		response = buildUsageResponse(request, response) ;
		return response;
	}

	@Override 
	public int getUsageCost(HttpServletRequest request) {
		return 0 ;
	}
}
