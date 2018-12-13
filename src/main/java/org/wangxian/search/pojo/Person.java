package org.wangxian.search.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author xian
 * @date 12/13/2018
 */
@Getter
@Setter
@ToString
@Document(indexName = "person", type = "person", shards = 1, replicas = 0, refreshInterval = "-1")
public class Person {
    @Id
    private Long id;

    private String name;

    private int age;

    private String sex;

    private String address;


}
