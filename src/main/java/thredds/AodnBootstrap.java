package thredds;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "au.org.aodn.thredds")
public class AodnBootstrap {
    // Nothing goes here, just a bootstrap entry point because the web.xml only do component scan on thredds package
    // here we extend it to our customized package.
}
