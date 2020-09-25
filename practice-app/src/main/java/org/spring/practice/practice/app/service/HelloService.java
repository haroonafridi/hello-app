package org.spring.practice.practice.app.service;

import org.spring.practice.practice.app.dao.HelloDao;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy(value = true)
public class HelloService {
    private final HelloDao helloDao;

    public HelloService(HelloDao helloDao) {
        this.helloDao = helloDao;
    }

    public String getName() {
        return helloDao.toString();
    }
}
