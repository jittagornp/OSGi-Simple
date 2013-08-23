/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.na5cent.osgi.service.implementation;

import com.blogspot.na5cent.osgi.service.api.HelloWorldService;

/**
 *
 * @author jittagornp
 */
public class HelloWorldServiceImpl implements HelloWorldService{

    public String sayHelloWorld() {
        return "hello na5cent.blogspot.com";
    }
    
}
