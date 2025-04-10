package com.example.Blogera_demo.dto;

import java.util.List;
import java.util.Set;

import lombok.Data;

@Data
public class ExcludedIds {
    private Set<String> excludedIds;
    private List<String> listOfCategories;
    private String userId;
    private String text;
    private Integer sample;
}
