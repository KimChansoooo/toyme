package com.toy.me;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin("*")
@RestController
public class MainController {

    @RequestMapping("/login")
    public String pageForwarding() {
        return "login";
    }

    @RequestMapping("/sessionCheck")
    public Map<String, Object> sessCheck(HttpServletRequest request) {

        Map<String, Object> result = new HashMap<>();

        HttpSession session = request.getSession(false);
        if(session == null) {
            result.put("sessionCheck", true);
        } else {
            result.put("sessionCheck", false);
        }

        return result;
    }
}
