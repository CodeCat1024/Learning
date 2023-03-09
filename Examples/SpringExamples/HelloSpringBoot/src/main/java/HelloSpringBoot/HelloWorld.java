package HelloSpringBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    @Value("${server.port}")
    private String port;

    @Value("${my.properties}")
    private String properties;

    @ResponseBody // 返回一个非静态页面的数据
    @RequestMapping("sayhi") // 设置路由地址，全部使用小写
    public String sayHi() {
        return "Hello World + server.port = " + port + " my.properties" + properties;
    }
}