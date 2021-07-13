package com.test.hplus.converters;

import com.test.hplus.beans.Gender;

import javax.persistence.Converter;


public class StringToEnumConverter implements org.springframework.core.convert.converter.Converter<String,Gender> {

public Gender convert(String s){
    if (s.equals("MALE")){

    return Gender.MALE;
} else if (s.equals("FEMALE")){
    return Gender.FEMALE;}
    else {
        return Gender.OTHER;
    }
}
}
