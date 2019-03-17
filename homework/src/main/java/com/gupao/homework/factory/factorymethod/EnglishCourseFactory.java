package com.gupao.homework.factory.factorymethod;

import com.gupao.homework.factory.model.Course;
import com.gupao.homework.factory.model.EnglishCourse;

/**
 * * @Package com.gupao.homework.factory.factorymethod
 * * @Description: ${todo}
 * * @author caiwei
 * * @date 2019/3/17
 **/
public class EnglishCourseFactory implements ICourseFactory {
    @Override
    public Course getCourse() {
        EnglishCourse englishCourse = new EnglishCourse();
        return englishCourse;
    }
}
