package com.yc.configs;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-08-02 15:05
 */
@Configuration
@PropertySource("classpath:db.properties")
@Data
@Log4j2
public class DataSourceConfig {

  //利用Di将db.properties中的内容注入
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.driverclass}")
    private String driverclass;
    //#{T(java.lang.Math).random()*100.0}
    @Value("#{T(Runtime).getRuntime().availableProcessors()*2}")
    //spEL->spring expression language
    private int cpuCount;

    //以上属性从db.properties文件中读取出来后,存到了spring容器中Environment的变量
    @Bean   //IOC注解:托管第三方Bean
    public DataSource dataSource(){
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName(driverclass);
      dataSource.setUrl(url);
      dataSource.setUsername(username);
      dataSource.setPassword(password);
      return dataSource;
    }

  @Bean   //IOC注解:托管第三方Bean
  public DataSource dbcpDataSource(){
    BasicDataSource dataSource = new BasicDataSource();
    dataSource.setDriverClassName(driverclass);
    dataSource.setUrl(url);
    dataSource.setUsername(username);
    dataSource.setPassword(password);
    //TODO:更多参数
    return dataSource;
  }

  //参数:第三方的框架中的类  用@Bean托管
  @Bean(initMethod = "init",destroyMethod = "close")  //DruidDataSource中提供了  init初始化方法
  public DruidDataSource druidDataSource(){           //另外要注意:idea会这个方法的返回值进行解析,判断
      DruidDataSource dds = new DruidDataSource();
      dds.setDriverClassName(driverclass);
      dds.setUrl(url);
      dds.setUsername(username);
      dds.setPassword(password);
      //以上只是配置了参数,并没有创建连接池,在这个类的init()中完成了连接池创建
      //当前主机的CPU数*2
//      int cpuCount = Runtime.getRuntime().availableProcessors()*2;
      log.info("配置druid的连接池大小:"+cpuCount);
      dds.setInitialSize(cpuCount);
      dds.setMaxActive(cpuCount*2);
      return dds;
  }





}
