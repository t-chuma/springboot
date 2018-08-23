//package com.maocl.springboot.config;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//import org.apache.shiro.cache.ehcache.EhCacheManager;
//import org.apache.shiro.spring.LifecycleBeanPostProcessor;
//import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springboot.sample.dao.IScoreDao;
//import org.springboot.sample.security.MyShiroRealm;
//import org.springboot.sample.service.StudentService;
//import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
//import org.springframework.boot.context.embedded.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.filter.DelegatingFilterProxy;
///**
// * Created by maocl on 2018/8/15.
// */
//public class ShiroConfiguration {
//    private static final Logger logger = LoggerFactory.getLogger(ShiroConfiguration.class);
//
//    @Bean
//    public EhCacheManager getEhCacheManager() {
//        EhCacheManager em = new EhCacheManager();
//        em.setCacheManagerConfigFile("classpath:ehcache-shiro.xml");
//        return em;
//    }
//
//    @Bean(name = "myShiroRealm")
//    public MyShiroRealm myShiroRealm(EhCacheManager cacheManager) {
//        MyShiroRealm realm = new MyShiroRealm();
//        realm.setCacheManager(cacheManager);
//        return realm;
//    }
//
//
//}
