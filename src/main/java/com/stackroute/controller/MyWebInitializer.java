package com.stackroute.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{Exercise1Config.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}

