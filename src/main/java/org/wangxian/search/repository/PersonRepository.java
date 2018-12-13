package org.wangxian.search.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.wangxian.search.pojo.Person;

import java.util.List;

/**
 * @author xian
 * @date 12/13/2018
 */

public interface PersonRepository extends ElasticsearchRepository<Person, Long> {
    List<Person> findByNameLikeOrAddressLike(String name, String address);
}
