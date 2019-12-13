package com.hp.student02.controller;

import com.hp.student02.domain.JsonData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/stu")
public class StuController {
@GetMapping("/tiao")
    private String tiao(){

        return "temp";
    }

    @PostMapping("/upload")
    @ResponseBody
    public JsonData upload(MultipartFile upload){
    //1.提供一个文件上传的位置
        String path = "D:/xuexi/student01/student02/src/main/resources/static/upload/";
    //2.找到被上传文件的 原始名字 123.jpg
        String originalFilename = upload.getOriginalFilename();
        //3.处理上传文件名
        String filename = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
        //4.完成上传
        try {
            upload.transferTo(new File(path+filename));
            return new JsonData(0,"上传成功",filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JsonData(-1,"上传失败",null);
    }

}
