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
//要求所有的子工厂都实现这个工厂
public interface ICourseFactory {

    Course createCourse();

    Video createVideo();

    Note createNote();
}
