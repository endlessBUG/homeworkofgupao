package com.gupao.homework.factory.abtractfactory;

import com.gupao.homework.factory.model.*;

/**
 * * @Package com.gupao.homework.factory.abtractfactory
 * * @Description: ${todo}
 * * @author caiwei
 * * @date 2019/3/17
 **/
public class JavaCourseFactory implements ICourseFactory {

    @Override
    public Course createCourse() {
        return new JavaCourse();
    }

    @Override
    public Video createVideo() {
        return new JavaVideo();
    }

    @Override
    public Note createNote() {
        return new JavaNote();
    }
}
