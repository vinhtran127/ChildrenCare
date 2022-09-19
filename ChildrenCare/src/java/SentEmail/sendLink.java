/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SentEmail;

import static java.lang.ProcessBuilder.Redirect.to;
import java.security.SecureRandom;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author vinh2
 */
public class sendLink {

    public static void SendLinkToMail(String recipient, String action, String randomString) throws MessagingException {
        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String acc = "vinhtthe153663@fpt.edu.vn";
        String pass = "yoagiamyojxeywob";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(acc, pass);
            }
        });
        Message mess = prepareMessage(session, acc, recipient, action, randomString);
        Transport.send(mess);
    }

    private static Message prepareMessage(Session session, String acc, String recipient, String action, String randomString) throws AddressException, MessagingException {
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(acc));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
        msg.setSubject("Verify link from Chidren care");
        msg.setContent("<p>This is your verificate link (valid in 5min): http://localhost:8080/ChildrenCare/ConfirmCode?action=" + action + "&randomString=" + randomString + "</p>", "text/html");
        return msg;
    }

    public static String getAlphaNumericString() {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        // create StringBuffer size of AlphaNumeric
        StringBuilder sb = new StringBuilder(40);

        for (int i = 0; i < 40; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());
            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }
}
