/*
 * To change this lic the classpath of project word-count-beam, only syntax errors are reportedense header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.beam.examples;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.beam.examples.Aire;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author leo
 */
public class JsonUrlReader2 {

   
    public static void main(String[] args) {
        try {
            JsonUrlReader2 jsonUrlReader = new JsonUrlReader2();
            List<Terremoto> terremotos = jsonUrlReader.cargarURL();
            
            for (Terremoto terremoto : terremotos) {
                System.out.println(terremotos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Terremoto> cargarURL() throws IOException {
        String url = "https://chilealerta.com/api/query/?user=demo&select=ultimos_sismos_chile&limit=50";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(new URL(url));

        JsonNode terremotosNode = rootNode.get("ultimos_sismos_chile");
        Iterator<JsonNode> terremotosIterator = terremotosNode.elements();

        List<Terremoto> terremotos = new ArrayList<>();

        while (terremotosIterator.hasNext()) {
            JsonNode terremotoNode = terremotosIterator.next();

            Terremoto terremoto = new Terremoto();
            terremoto.setState(terremotoNode.get("state").asInt());
            terremoto.setUtcTime(terremotoNode.get("utc_time").asText());
            terremoto.setLocalTime(terremotoNode.get("local_time").asText());
            terremoto.setReference(terremotoNode.get("reference").asText());
            terremoto.setMagnitude(terremotoNode.get("magnitude").asDouble());
            terremoto.setScale(terremotoNode.get("scale").asText());
            terremoto.setLatitude(terremotoNode.get("latitude").asDouble());
            terremoto.setLongitude(terremotoNode.get("longitude").asDouble());
            terremoto.setDepth(terremotoNode.get("depth").asDouble());
            terremoto.setUrl(terremotoNode.get("url").asText());
            terremoto.setSource(terremotoNode.get("source").asText());

            terremotos.add(terremoto);
        }

        return terremotos;
    }
}
