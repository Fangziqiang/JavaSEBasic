package com.fzq.vcodeextractor.util;

import java.io.File;
  
public class TestOCR {  

 public static void main(String[] args) {  
        String path = "D://123456.jpg";
        System.out.println("ORC Test Begin......");
        try {
            String valCode = new OCR().recognizeText(new File(path), "jpeg");
            System.out.printf("识别的字符串为：%s",valCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ORC Test End......");
    }
  
}  