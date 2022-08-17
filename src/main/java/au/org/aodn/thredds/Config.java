package au.org.aodn.thredds;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Springboot config goes here, noted the web.xml that comes with war already contains a servlet dispatcher, so you
 * cannot init another servlet interceptor via springframework. However we the web.xml do suppoert annotation based
 * configuration.
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Config {

    private Logger logger = LoggerFactory.getLogger(Config.class);

    @Autowired
    private CatalogCreator catalogCreator;

    @PostConstruct
    public void init() throws IOException, JAXBException {
        logger.info("Init customized aodn configuration");
    }
    /**
     * Allow @Value("${resolve.....value}")
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        // Will fail to start if we do not ignore missing setup for example --> unidata.testdata.path
        configurer.setIgnoreUnresolvablePlaceholders(true);
        return configurer;
    }

    @Bean
    public CatalogCreator createCatalogCreator() {
        return new CatalogCreator();
    }
}
