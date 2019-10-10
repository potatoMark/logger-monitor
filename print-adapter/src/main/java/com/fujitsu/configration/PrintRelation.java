package com.fujitsu.configration;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
//@PropertySource(value = "classpath:printRelation.properties", ignoreResourceNotFound = true)
@ConfigurationProperties(prefix = "adapter")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PrintRelation {

    private Map<String, String> cbop = new HashMap<>();

}
