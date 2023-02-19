package tcs.com.lenovoms;

import org.springframework.web.bind.annotation.GetMapping;

public class monitor {
    @GetMapping("/mymonitor")
    public String getData(){
        return "Monitors are avilable from 17th to 54 inch";
    }
}
