package Helpers.Lessons.RemoteDevice_Lesson_7_4;

public class RemoteController_Lesson_7_4 implements Volume_Lesson_7_4, Device_Lesson_7_4 {

    public TVDevice_Lesson_7_4 tvDevice;


    public RemoteController_Lesson_7_4(TVDevice_Lesson_7_4 tvDevice){
        this.tvDevice = tvDevice;
    }

    public void downVolume(){
        this.tvDevice.downVolume();
    }

    public void upVolume(){
        this.tvDevice.upVolume();
    }

    public void mute(){
        this.tvDevice.mute();
    }

    public void powerOn(){
      this.tvDevice.powerOn();
    };

    public void powerOff(){
        this.tvDevice.powerOff();
    };

    public void setChannel(int channel){
        this.tvDevice.setChannel(channel);
    };

    public void currentChannel(){
        this.tvDevice.currentChannel();
    };

}
