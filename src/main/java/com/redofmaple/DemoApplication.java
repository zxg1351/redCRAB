package com.redofmaple;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
@EnableAutoConfiguration
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		log.info("夜雨寄北");
		log.info("君问归期未有期");
		log.info("巴山夜雨涨秋池");
		log.info("何当共剪西窗烛");
		log.info("却话巴山夜雨时");
	}
}
