
package visitor.management.system;

import java.util.ArrayList;

public class VisitorDetailsObjects 
{
    ArrayList data;

    public VisitorDetailsObjects() 
    {
        data=new ArrayList();
    }
    
    public void addData(Object a)
    {
        this.data.add(a);
    }
    
}
