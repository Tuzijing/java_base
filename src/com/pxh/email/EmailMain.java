package com.pxh.email;

import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

/**
* <b>Description:邮件测试入口</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> java_base
* <br><b>PackageName:</b> com.pxh.email
* <br><b>ClassName:</b> EmailMain
* <br><b>Date:</b> 2017年11月30日 下午11:50:13
*/

public class EmailMain {

	public static void main(String[] args) {
		
		try {
			sendEmail();
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//ezzwkyitdjzabgba  ufhrmeovbhuqbccd 第三方登录验证码
	public static void sendEmail() throws GeneralSecurityException{
		//收件人
		String toUser = "2929448430@qq.com";
		//发件人
		String fromUser = "1033180006@qq.com";
		//指定发送邮件的主机
		String host = "smtp.qq.com"; //qq邮箱服务器
		//获取系统属性
		Properties properties = System.getProperties();
		//设置邮件服务器  
		properties.setProperty("mail.smtp.host", host);
		properties.put("mail.smtp.host", "true");
		MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.ssl.socketFactory", sf);
        Session session = Session.getDefaultInstance(properties,new Authenticator(){
            public PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(fromUser, "ezzwkyitdjzabgba"); //发件人邮件用户名、密码
            }
        });
        try{
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(fromUser));

            // Set To: 头部头字段
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toUser));

            // Set Subject: 头部头字段
            message.setSubject("This is the Subject Line!");

            // 设置消息体
            message.setText("This is actual message");

            // 发送消息
            Transport.send(message);
            System.out.println("Sent message successfully....from runoob.com");
        }catch (MessagingException mex) {
            mex.printStackTrace();
        }
	}

}
