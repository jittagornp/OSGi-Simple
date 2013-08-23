package com.blogspot.na5cent.osgi.service.implementation;

import com.blogspot.na5cent.osgi.service.api.HelloWorldService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ServiceImplementationActivator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        context.registerService(HelloWorldService.class.getName(), new HelloWorldServiceImpl(), null);
    }

    public void stop(BundleContext context) throws Exception {
        context.ungetService(context.getServiceReference(HelloWorldService.class.getName()));
    }

}
