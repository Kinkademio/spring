package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "I love to create Sites";
    }

    @GetMapping("/cabinet")
    public String cabinet() {
        return "U are in cabinet now!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Oh! How did you end up here?";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "This is the greatest site that u have ever seen!!!";
    }

    @GetMapping("/secret")
    public String secret() {
        String secretText = "";
        String file ="secret1.txt";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            secretText = reader.readLine();
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "The secret in file: <br>" + secretText;
    }

}