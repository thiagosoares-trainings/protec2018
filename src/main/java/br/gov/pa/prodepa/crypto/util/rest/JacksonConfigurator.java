package br.gov.pa.prodepa.crypto.util.rest;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JacksonConfigurator implements ContextResolver<ObjectMapper> {

    //private static final Logger LOG = LoggerFactory.getLogger(JacksonConfig.class);

    private ObjectMapper objectMapper;

    public JacksonConfigurator() throws Exception {
        this.objectMapper = new ObjectMapper();

        // sample to convert any DateTime to readable timestamps
        this.objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        this.objectMapper.configure(SerializationFeature.EAGER_SERIALIZER_FETCH, false);
        this.objectMapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
        this.objectMapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
        
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
    
    public ObjectMapper getContext(Class<?> objectType) {
        return objectMapper;
    }
}
