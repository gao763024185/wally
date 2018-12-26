//package com.spb.wally.config;
//
//import com.spb.wally.mapper.BaseUserMapper;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import javax.annotation.Resource;
//
///**
// * @description 自定义配置安全验证
// * @author: gaobh
// * @date: 2018/12/26 10:57
// * @version: v1.0
// */
////@Configuration
////@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Resource
//    private BaseUserMapper baseUserMapper;
//    @Override
//    protected void configure(HttpSecurity security) throws Exception {
////        security.authorizeRequests()
////                .antMatchers("/").access("hasRole('READER')")
////                .antMatchers("/**").permitAll().and()
////                .formLogin().loginPage("/login")
////                .failureUrl("/login?error=true");
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//        auth.userDetailsService(new UserDetailsService() {
//            @Override
//            public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//                return (UserDetails) baseUserMapper.selectByPrimaryKey(1);
//            }
//        });
//    }
//}
