package com.example.help_desk.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inLineEmployee", types = {Support.class})
public interface InLineEmployee {
    String getTitle();
    String getComment();

    Employee getEmployee();
}
