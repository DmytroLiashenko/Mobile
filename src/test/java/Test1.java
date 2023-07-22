import activitiesObject.SettingObject;

import configuration.Base;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test1 extends Base {
    static SettingObject object;

    @BeforeClass
    public static void bef(){
        object=new SettingObject(driver);

    }

 @Test
    public void testSetting1(){
     System.out.println(driver.currentActivity());
 }

 @Test
    public void testSettingTmp1(){
        object.temSelect(SettingObject.TEMP.F);
 }
 @Test
    public void testTime(){
        object.timeSelect(SettingObject.TEMP.Format1);
 }
    @Test
    public void testNotification(){
        object.Toggle_switches(SettingObject.TEMP.ON);
    }
    @Test
    public void testStatusBar(){
        object.StatusBar(SettingObject.TEMP.ON);
    }

}
