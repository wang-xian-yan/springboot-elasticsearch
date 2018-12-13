package org.wangxian.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.wangxian.search.pojo.Person;

/**
 * @author xian
 * @date 12/13/2018
 */
@RunWith(SpringRunner.class)
public class DemoTest {

    @Test
    public void test1() {
        Person person = null;
        if (person==null||person.getName().equalsIgnoreCase("null")){
            System.out.println("person is null");
        }
    }
}
