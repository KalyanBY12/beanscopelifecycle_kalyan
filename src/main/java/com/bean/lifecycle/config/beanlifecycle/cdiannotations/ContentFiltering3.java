package com.bean.lifecycle.config.beanlifecycle.cdiannotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
@Qualifier("CF2")
public class ContentFiltering3 implements Filter {
    public String[] getRecommendations(String movie){


        return new String[]{"Italain Job","Mission Impossible", "MI3"};
    }
}
