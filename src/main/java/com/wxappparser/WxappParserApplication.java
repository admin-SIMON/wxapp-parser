package com.wxappparser;

import com.wxappparser.core.InvalidWXPackageException;
import com.wxappparser.core.WXAppParser;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class WxappParserApplication {

    public static void main(String[] args) {
        WXAppParser wxAppParser = new WXAppParser();
        Scanner input = new Scanner(System.in);
        System.out.print("请输入电脑用户名:");
        String Administ = input.next();
        System.out.print("请输入桌面解析文件夹名称:");
        String folder = input.next();
        System.out.print("请输入解析wxapkg文件名称:");
        String wxapkg = input.next();

        try {
            wxAppParser.unzipWXAppPackage("C:/Users/" + Administ + "/Desktop/" + folder + "/" + wxapkg + ".wxapkg", "C:/Users/" + Administ + "/Desktop/" + folder + "/" + wxapkg + "/");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidWXPackageException e) {
            e.printStackTrace();
        }
    }
}
