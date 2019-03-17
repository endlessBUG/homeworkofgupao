package com.gupao.homework.factory.model;

import lombok.Data;

/**
 * * @Package com.gupao.homework.factory.model
 * * @Description: ${todo}
 * * @author caiwei
 * * @date 2019/3/17
 **/
@Data
public class EnglishCourse implements Course {


    @Override
    public String sayName() {
        return "ENGLISH";
    }
}
