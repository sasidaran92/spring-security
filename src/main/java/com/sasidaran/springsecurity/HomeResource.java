package com.sasidaran.springsecurity;

import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class HomeResource {

    @GetMapping(value = "/")
    public String getWelcomeText() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping(value = "/user")
    public String getUserText() {
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping(value = "/admin")
    public String getAdminText() {
        return ("<h1>Welcome Admin</h1>");
    }

    @GetMapping(value = "/image", produces = MediaType.TEXT_PLAIN_VALUE)
    public byte[] getImage() throws IOException {
        File file = ResourceUtils.getFile("classpath:img/image2.jpg");
        InputStream in = new FileInputStream(file);
        return IOUtils.toByteArray(in);
    }
}
