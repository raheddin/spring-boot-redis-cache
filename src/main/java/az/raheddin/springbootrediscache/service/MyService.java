package az.raheddin.springbootrediscache.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Cacheable("myCache")
    public String myService() throws InterruptedException {
        Thread.sleep(5000);
        return "Raheddin Asadzade!!";
    }

    @CacheEvict(cacheNames = "myCache")
    public void clearMyCache(){
        System.out.println("clear my service cache!");
    }

}
