package cardmain;

import java.util.*;
import java.util.logging.Logger;
import carddetails.Details;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc=new Scanner(System.in);
        Logger log=Logger.getLogger("Main");
        Scanner sc1=new Scanner(System.in);
        String cname;
        String duplicateName;
        String exDate;
        String duplicateDate;
        Long cno;
        Long duplicateNo;

        log.info("------CREATE A BASIC CREDIT CARD------");
        log.info("Enter the credit cardholder's name: ");
        cname=sc.nextLine();

        log.info("Enter the credit card number: ");
        cno=sc.nextLong();
        log.info("Enter the credit card expiration date: ");
        exDate=sc1.nextLine();

        Details d=new Details(cname, cno, exDate);
        Details clone=(Details)d.clone();


        log.info("\n ------DOBLICATE CARD DETAILS------");
        log.info("Enter the credit cardholder's name: ");
        duplicateName=sc1.nextLine();
        log.info("Enter the credit card number: ");
        duplicateNo=sc.nextLong();
        log.info("Enter the credit card expiration date: ");
        duplicateDate=sc1.nextLine();
        Details dub=new Details(duplicateName, duplicateNo, duplicateDate);
        log.info("\n Cloned Details of Original card : \n\n");
        clone.display();
        log.info("\n Details of Duplicate card : \n\n");
        dub.display();
        boolean ans=clone.equals(duplicateNo,cno);
        if(ans)
            log.info("\n Both Credit Card Numbers are Same. ");
        else
            log.info("\n Both Credit Card Numbers are Not Same.");
    }
}
