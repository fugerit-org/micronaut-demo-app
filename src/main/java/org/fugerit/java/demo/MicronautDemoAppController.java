package org.fugerit.java.demo;

import io.micronaut.http.annotation.*;

@Controller("/micronaut-demo-app")
public class MicronautDemoAppController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}