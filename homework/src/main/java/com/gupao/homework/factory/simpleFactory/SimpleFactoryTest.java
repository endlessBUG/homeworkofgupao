package com.gupao.homework.factory.simpleFactory;

import com.gupao.homework.factory.model.JavaCourse;
import com.gupao.homework.factory.model.PythonCourse;

/**
 * * @Package com.gupao.homework.factory.simpleFactory
 * * @Description: ${todo}
 * * @author caiwei
 * * @date 2019/3/17
 **/
public class SimpleFactoryTest {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        System.out.println(courseFactory.getCourse(JavaCourse.class).sayName());
    }
}
