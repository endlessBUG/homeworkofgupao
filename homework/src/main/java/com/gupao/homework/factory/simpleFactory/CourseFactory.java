package com.gupao.homework.factory.simpleFactory;

import com.gupao.homework.factory.model.Course;

/**
 * * @Package com.gupao.homework.factory.simpleFactory
 * * @Description: ${todo}
 * * @author caiwei
 * * @date 2019/3/17
 **/
public class CourseFactory {

    protected final Course getCourse(Class clazz){
        if(clazz != null){
            try {
                return (Course) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
