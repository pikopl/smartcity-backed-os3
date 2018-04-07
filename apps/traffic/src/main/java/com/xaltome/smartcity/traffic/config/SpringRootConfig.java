package com.xaltome.smartcity.traffic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@EnableScheduling
@ComponentScan({ 	"com.xaltome.smartcity.traffic.dbservice", 
					"com.xaltome.smartcity.traffic.config",
					"com.xaltome.smartcity.traffic.scheduler"})
public class SpringRootConfig {

}
