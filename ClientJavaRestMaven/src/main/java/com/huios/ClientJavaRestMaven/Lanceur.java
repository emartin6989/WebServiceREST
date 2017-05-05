package com.huios.ClientJavaRestMaven;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// je pointe la racine
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		URI uri = UriBuilder.fromUri("http://localhost:8085/TPWebServiceRest").build();
		WebResource service = client.resource(uri);
		
		//j'affiche ce que je veux dans les methodes
		WebResource path = service.path("banque").path("test");
		String res = path.get(String.class);
		System.out.println(res);
		
		WebResource path2 = service.path("banque").path("infos");
		String res2 = path2.get(String.class);
		System.out.println(res2);
	}

}
