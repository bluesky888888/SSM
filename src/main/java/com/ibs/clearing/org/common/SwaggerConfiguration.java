package com.ibs.clearing.org.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

	@EnableSwagger2//Swagger的开关，表示我们在项目中启用Swagger
	@Configuration//声名这是一个配置类
	@EnableWebMvc
	public class SwaggerConfiguration {

	    //controller接口所在的包
	    private String basePackage = "com.ibs.clearing.org.controller";

	    //当前文档的标题
	    private String title = "他很懒，什么都没有留下";

	    //当前文档的详细描述
	    private String description = "他很懒，什么都没有留下";

	    //当前文档的版本
	    private String version = "V1.0";

	    @Bean
	    public Docket createRestApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(apiInfo())
	                .select()
	                .apis(RequestHandlerSelectors.basePackage(basePackage))
	                .paths(PathSelectors.any())
	                .build();
	    }

	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title(title)
	                .description(description)
	                .version(version)
	                .build();
	    }

	    //Setter Getter ...

	}
