package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AggregatedViewEntity;
import com.example.demo.repository.AggregatedViewRepository;

@Service
public class AggregatedViewService {

    @Autowired
    private AggregatedViewRepository aggregatedViewRepository;

    public Map<String, Double> getAttributeNamesAndValues() {
        Map<String, Double> attributeMap = new HashMap<>();

        List<AggregatedViewEntity> aggregatedViewEntities = aggregatedViewRepository.findAll();

        for (AggregatedViewEntity entity : aggregatedViewEntities) {
            attributeMap.put(entity.getAttribute(), entity.getTotalBudgetInLakhs());
        }

        return attributeMap;
    }
}
