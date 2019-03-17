package com.gupao.homework.factory.abtractfactory;

import com.gupao.homework.factory.model.Course;
import com.gupao.homework.factory.model.Note;
import com.gupao.homework.factory.model.Video;

/**
 * * @Package com.gupao.homework.factory.abtractfactory
 * * @Description: ${todo}
 * * @author caiwei
 * * @date 2019/3/17
 **/
public class AbstractFactoryTest {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        Course course = factory.createCourse();
        Note note = factory.createNote();
        Video video = factory.createVideo();
    }
}
