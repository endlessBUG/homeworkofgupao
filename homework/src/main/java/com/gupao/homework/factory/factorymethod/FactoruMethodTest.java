package com.gupao.homework.factory.factorymethod;

import com.gupao.homework.factory.model.Course;

/**
 * * @Package com.gupao.homework.factory.factorymethod
 * * @Description: ${todo}
 * * @author caiwei
 * * @date 2019/3/17
 **/
public class FactoruMethodTest {

    public static void main(String[] args) {
        Course course = new JavaCourseFactory().getCourse();
        System.out.println(course.sayName());
        Course course1 = new PythonCourseFactory().getCourse();
        System.out.println(course1.sayName());
        Course course2 = new EnglishCourseFactory().getCourse();
        System.out.println(course2.sayName());
    }
}
