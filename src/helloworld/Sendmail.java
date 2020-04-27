package helloworld;

import java.util.Properties;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class Sendmail {
	//�����˵�ַ
    public static String senderAddress = "18271681248@163.com";
    //�ռ��˵�ַ
    public static String recipientAddress = "598521237@qq.com";
    //�������˻���
    public static String senderAccount = "18271681248@163.com";
    //�������˻�����
    public static String senderPassword = "never323629";
	public static void main(String[] args) throws Exception {
		//1�������ʼ��������Ĳ�������
        Properties props = new Properties();
        //�����û�����֤��ʽ
        props.setProperty("mail.smtp.auth", "true");
        //���ô���Э��
        props.setProperty("mail.transport.protocol", "smtp");
        //���÷����˵�SMTP��������ַ
        props.setProperty("mail.smtp.host", "smtp.163.com");
        //2��������������Ӧ�ó�������Ļ�����Ϣ�� Session ����
        Session session = Session.getInstance(props);
        //���õ�����Ϣ�ڿ���̨��ӡ����
        session.setDebug(true);
        //3�������ʼ���ʵ������
        Message msg = getMimeMessage(session);
        //4������session�����ȡ�ʼ��������Transport
        Transport transport = session.getTransport();
        //���÷����˵��˻���������
        transport.connect(senderAccount, senderPassword);
        //�����ʼ��������͵������ռ��˵�ַ��message.getAllRecipients() ��ȡ�������ڴ����ʼ�����ʱ��ӵ������ռ���, ������, ������
        transport.sendMessage(msg,msg.getAllRecipients());
         
        //���ֻ�뷢�͸�ָ�����ˣ���������д��
        //transport.sendMessage(msg, new Address[]{new InternetAddress("xxx@qq.com")});
         
        //5���ر��ʼ�����
        transport.close();
	}
	public static MimeMessage getMimeMessage(Session session) throws Exception{
        //����һ���ʼ���ʵ������
        MimeMessage msg = new MimeMessage(session);
        //���÷����˵�ַ
        msg.setFrom(new InternetAddress(senderAddress));
        /**
         * �����ռ��˵�ַ���������Ӷ���ռ��ˡ����͡����ͣ�����������һ�д�����д����
         * MimeMessage.RecipientType.TO:����
         * MimeMessage.RecipientType.CC������
         * MimeMessage.RecipientType.BCC������
         */
        msg.setRecipient(MimeMessage.RecipientType.TO,new InternetAddress(recipientAddress));
        //�����ʼ�����
        msg.setSubject("�ʼ�����","UTF-8");
        //�����ʼ�����
        msg.setContent("�򵥵Ĵ��ı��ʼ���", "text/html;charset=UTF-8");
        //�����ʼ��ķ���ʱ��,Ĭ����������
        msg.setSentDate(new Date());
         
        return msg;
    }

}
