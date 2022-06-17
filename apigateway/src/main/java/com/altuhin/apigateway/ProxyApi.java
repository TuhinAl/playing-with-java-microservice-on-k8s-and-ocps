package com.altuhin.apigateway;


import org.springframework.context.annotation.Configuration;

@Configuration
public class ProxyApi {

//    @Autowired
//    ZuulProperties zuulProperties;
//
//    @Primary
//    @Bean
//    public SwaggerResourcesProvider swaggerResourcesProvider() {
//        return () -> {
//            List<SwaggerResource> resources = new ArrayList<>();
//            zuulProperties.getRoutes()
//                    .values()
//                    .forEach(route -> resources.add(createSwaggerResource(route)));
//            return resources;
//        };
//    }
//    private SwaggerResource createSwaggerResource(ZuulProperties.ZuulRoute route) {
//        SwaggerResource swaggerResource = new SwaggerResource();
//        swaggerResource.setName(route.getServiceId());
//        swaggerResource.setLocation("/" + route.getId() + "/v2/api-docs");
//        swaggerResource.setSwaggerVersion("2.0");
//        return swaggerResource;
//    }
}
