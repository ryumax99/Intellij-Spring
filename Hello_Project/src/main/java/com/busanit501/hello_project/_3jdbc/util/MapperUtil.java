package com.busanit501.hello_project._3jdbc.util;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;


public enum MapperUtil {
    INSTANCE;

    private ModelMapper modelMapper;

    MapperUtil() {
        this.modelMapper = new ModelMapper();
        this.modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.STRICT);

    }

    public ModelMapper get() {
        return modelMapper;
    }
}
