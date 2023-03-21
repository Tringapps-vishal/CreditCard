package carddetails;

import java.util.*;
import java.util.logging.Logger;

public class Details implements Cloneable{
    Logger log=Logger.getLogger("Details");
    private final String cname;
    private final String exDate;
    private final Long cno;
    public Details(String cname, Long cno, String exDate)
    {
        this.cname=cname;
        this.cno=cno;
        this.exDate =exDate;
    }
    public void display()
    {
        log.info("Your credit card Name:"+this.cname+"");
        log.info("Your credit card Number:"+this.cno+"");
        log.info("Your credit card Expiration date:"+this.exDate +"");
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public boolean equals(Long duplicateNo, Long cno)
    {
        return Objects.equals(duplicateNo, cno);
    }
}
