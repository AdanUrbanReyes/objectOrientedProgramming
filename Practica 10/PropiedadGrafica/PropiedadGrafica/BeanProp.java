import java.awt.Color;
import java.beans.*;
import org.apache.commons.beanutils.PropertyUtils;
public class BeanProp{ 
    private Object o;
    private String[] propertys,valueprop; 
    public BeanProp(String name)throws Exception{
        Class c=Class.forName(name);
        o=c.getDeclaredConstructor(new Class[]{String.class}).newInstance("Objeto");
        BeanInfo beanInfo = Introspector.getBeanInfo(c);
        PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
        propertys=new String[pds.length];
        valueprop=new String[pds.length];
        int i=0;
        for (PropertyDescriptor pd : pds) {
            propertys[i] = pd.getName();
            i++;
        }
    } 
    public String[] getPropertyNames(){
        return propertys;
    }
    public Object getComponent(){
        return o;
    } 
    public void setProperty(String name,String value){
        try{
            PropertyUtils.setProperty(o, name, value);
        }catch(Exception ex){ex.printStackTrace();} 
    }  
    public void setProperty(String name,Color value){
        try{
            PropertyUtils.setProperty(o, name, value);
        }catch(Exception ex){ex.printStackTrace();} 
    }  
    public void setProperty(String name,boolean value){
        try{
            PropertyUtils.setProperty(o, name, value);
        }catch(Exception ex){ex.printStackTrace();} 
    }
	public void setProperty(String name,int value){
        try{
            PropertyUtils.setProperty(o, name, value);
        }catch(Exception ex){ex.printStackTrace();} 
    }
}
