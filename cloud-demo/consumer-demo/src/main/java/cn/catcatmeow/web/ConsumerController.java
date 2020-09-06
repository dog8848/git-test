package cn.catcatmeow.web;

import cn.catcatmeow.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/account/{id}")
    public Account queryById(@PathVariable(value = "id",required = true)Integer id){
        String url="http://localhost/account/"+id;
        Account account=restTemplate.getForObject(url,Account.class);
        return account;
    }
}
