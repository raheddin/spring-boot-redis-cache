package az.raheddin.springbootrediscache.controller;

import az.raheddin.springbootrediscache.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping
    public String myMsj() throws InterruptedException {
        return myService.myService();
    }

    @GetMapping("/clear")
    public void clearMyCache() {
        myService.clearMyCache();
    }

}
