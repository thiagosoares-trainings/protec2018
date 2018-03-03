package br.gov.pa.prodepa.crypto.web.rest;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import br.gov.pa.prodepa.crypto.web.vm.BuildInfoDto;
import br.gov.pa.prodepa.crypto.web.vm.ProtecDto;
import io.swagger.annotations.ApiParam;

@RequestScoped
@Path("/v1")
@io.swagger.annotations.Api(description = "the templates API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2018-01-02T17:56:52.800Z")
public class ProtecApi {

	private static final long serialVersionUID = 1725388375553325713L;

	@GET
	@Produces({ "application/json", "application/xml" })
	@io.swagger.annotations.ApiOperation(value = "Get all templates", notes = "Get all templates which the user have access", response = ProtecDto.class, responseContainer = "List", tags = {
			"Templates", })
	@io.swagger.annotations.ApiResponses(value = {
			@io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProtecDto.class, responseContainer = "List"),
			@io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username supplied", response = ProtecDto.class, responseContainer = "List"),
			@io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = ProtecDto.class, responseContainer = "List") })
	public Response getTemplatesAll(
			@ApiParam(value = "", required = true) @HeaderParam("Authotization") String authotization,
			@Context SecurityContext securityContext) {

		return Response.ok().entity("").build();
	}

	@GET
	@Path("/search")
	@Produces({ "application/xml", "application/json" })
	@io.swagger.annotations.ApiOperation(value = "Search Templates by Parameters", notes = "Search for templates usuing parameters", response = ProtecDto.class, responseContainer = "List", tags = {
			"Templates", })
	@io.swagger.annotations.ApiResponses(value = {
			@io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProtecDto.class, responseContainer = "List"),
			@io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username supplied", response = ProtecDto.class, responseContainer = "List"),
			@io.swagger.annotations.ApiResponse(code = 404, message = "User not found", response = ProtecDto.class, responseContainer = "List") })
	public Response getTemplatesSearch(@NotNull @QueryParam("type") String type,
			@ApiParam(value = "", required = true) @HeaderParam("Authotization") String authotization,
			@Context SecurityContext securityContext) {
		return Response.ok().entity("").build();
	}

	@GET
	@Path("/version")
	@Produces({ "application/json" })
	public Response version() throws Exception {

		BuildInfoDto build = new BuildInfoDto();

		Map<String, String> configs = loadConfig();
		
		
		build.setBuildNumber(configs.get("build.number"));
		build.setBuildVersion(configs.get("build.version"));
		build.setEnvironment(configs.get("build.environment"));
		 

		return Response.ok().entity(build).build();
	}

	@GET
	@Path("/self")
	public Response self() {
		return Response.ok().build();
	}

	private static Map<String, String> loadConfig() throws Exception {

		Properties prop = loadPropertyFileFromResourceFolder("protec.properties");

		Map<String, String> map = new HashMap();

		for (Object key : prop.keySet()) {

			map.put((String) key, (String) prop.get(key));
		}

		return map;
	}

	private static Properties loadPropertyFileFromResourceFolder(String propFileName) throws Exception {
		try {

			Properties prop = new Properties();

			InputStream inputStream = ProtecApi.class.getClassLoader().getResourceAsStream(propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new Exception("O Arquivo de configuração \"" + propFileName + "\" não foi localizado.");
			}
			return prop;

		} catch (IOException e) {
			throw new Exception("O Arquivo de configuração \"" + propFileName + "\" não foi localizado.");
		}
	}

}
