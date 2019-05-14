package hello;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public class YamlResponse {
    private final String xmlContent;

    public YamlResponse(String xmlContent) {
        this.xmlContent = xmlContent;
    }

    public String getYamlContent() {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            JsonNode node = xmlMapper.readTree(xmlContent.getBytes());
            ObjectMapper jsonMapper = new ObjectMapper();
            String json = jsonMapper.writeValueAsString(node);

            node = jsonMapper.readTree(json);
            YAMLMapper yamlMapper = new YAMLMapper();
            return yamlMapper.writeValueAsString(node);
        } catch (Exception e) {
            return "Some error occurs";
        }
    }
}
