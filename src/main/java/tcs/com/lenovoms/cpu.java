package tcs.com.lenovoms;

import org.springframework.web.bind.annotation.GetMapping;

public class cpu {
    @GetMapping("/cpu")
    public String getData(){
        return "cpu is of intel i7";
    }
}
