package carddetails;

import java.util.*;
import java.util.logging.Logger;

public class Details implements Cloneable{
    Logger log=Logger.getLogger("Details");
    private final String cname;
    private final String exdate;
    private final Long cno;
    public Details(String cname, Long cno, String exdate)
    {
        this.cname=cname;
        this.cno=cno;
        this.exdate=exdate;
    }
    public void display()
    {
        log.info("Your credit card Name:"+this.cname+"");
        log.info("Your credit card Number:"+this.cno+"");
        log.info("Your credit card Expiration date:"+this.exdate+"");
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public boolean equals(Long dubcno, Long cno)
    {
        return Objects.equals(dubcno, cno);
    }
}
