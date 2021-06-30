package com.paises.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.paises.dto.ListaPaises;
import com.paises.workservice.PaisesWorkService;

@Path("/test")
public class PaisesRest {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/get-paises")
	public ListaPaises getPaises() {
		PaisesWorkService pws = new PaisesWorkService();
		return pws.getPaises();
	}

}
