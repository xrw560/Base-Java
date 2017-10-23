package cn.ncut.java.utils;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class FTPTest {

    @Test
    public void testFtpClient() throws Exception {
        //创建一个FtpClient对象
        FTPClient ftpClient = new FTPClient();
        // 创建ftp连接，默认端口是21
        ftpClient.connect("192.168.138.130", 21);
        // 登录Ftp服务器，使用用户名和密码
        ftpClient.login("ftpuser", "ftpuser");
        //上传文件
        //读取本地文件
        FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\Pictures\\timg.jpg"));
        //设置上传的路径
        ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        // 第一个参数：服务器端文档名
        // 第二个参数：上传文件的inputStream
        ftpClient.storeFile("123.jpg", inputStream);
        // 关闭连接
        inputStream.close();

        ftpClient.logout();
    }
}
