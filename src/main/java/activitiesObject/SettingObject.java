package activitiesObject;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SettingObject {
    static AndroidDriver driver;

    public SettingObject(AndroidDriver driver) {
        this.driver = driver;

    }

    By temperatureButton = By.id("com.weather.forecast.weatherchannel:id/tgTemperature_setting");
    By timeButton=By.id("com.weather.forecast.weatherchannel:id/tg_format_time_setting");
    By ToggleButton=By.id("com.weather.forecast.weatherchannel:id/tgNotifi_settings");
    By StatusBarButton=By.id("com.weather.forecast.weatherchannel:id/tg_notifi_second_settings");
    public void temSelect(TEMP temp) {
        MobileElement tempButton = (MobileElement) driver.findElement(temperatureButton);
        switch (temp){
            case C:{
                if(tempButton.getAttribute("checked").equals("true")){
                    tempButton.click();
                }
            }
            case F:{
                if(tempButton.getAttribute("checked").equals("false")){
                    tempButton.click();
                }
            }

        }
    }
    public void timeSelect(TEMP temp) {
        MobileElement timeSelect = (MobileElement) driver.findElement(timeButton);
        switch (temp){
            case Format1:{
                if(timeSelect.getAttribute("checked").equals("true")){
                    timeSelect.click();
                }
            }
            case Format2:{
                if(timeSelect.getAttribute("checked").equals("false")){
                    timeSelect.click();
                }
            }
        }
    }
    public void Toggle_switches (TEMP temp){
        MobileElement toggle_switches = (MobileElement) driver.findElement(ToggleButton);

        switch (temp){
            case ON:{
                if(toggle_switches.getAttribute("checked").equals("false")){
                    toggle_switches.click();
                }
            }
            case OFF:{
                if(toggle_switches.getAttribute("checked").equals("true")){
                    toggle_switches.click();
                }
            }
        }
    }
    public void StatusBar (TEMP temp){
        MobileElement statusBar = (MobileElement) driver.findElement(StatusBarButton);

        switch (temp){
            case ON:{
                if(statusBar.getAttribute("checked").equals("false")){
                    statusBar.click();
                }
            }
            case OFF:{
                if(statusBar.getAttribute("checked").equals("true")){
                    statusBar.click();
                }
            }
        }
    }

public enum TEMP {
    C, F,Format1,Format2,ON,OFF;
}



}