package RemoteDevice_Lesson_7_4;

public class TV_Lesson_7_4 extends TVDevice_Lesson_7_4 {

    public int volumeLevel;
    public int channelNumber;
    public String modelName;
    public boolean isOn;


    public TV_Lesson_7_4 (int volumeLevel, int channelNumber, boolean isOn, String modelName){
       this.volumeLevel = volumeLevel;
       this.channelNumber = channelNumber;
       this.modelName = modelName;
       this.isOn = isOn;
    }

    public void downVolume(){
        this.volumeLevel -= 1;
        if (volumeLevel < 0){
            volumeLevel = 0;
        }
        System.out.println("TV class - down_Volume: volumeLevel - " + this.volumeLevel);
    }

    public void upVolume(){
        this.volumeLevel += 1;
        if (volumeLevel > 100){
            volumeLevel = 100;
        }
        System.out.println("TV class - up_Volume: volumeLevel - " + this.volumeLevel);
    }

    public void mute(){
        this.volumeLevel = 0;
        System.out.println("TV class - mute: volumeLevel - " + this.volumeLevel);
    }

    public void powerOn(){
        this.isOn = true;
        System.out.println("TV class - power_On: isOn = " + this.isOn);
    };

    public void powerOff(){
        this.isOn = false;
        System.out.println("TV class - power_Off: isOn = " + this.isOn);
    };

    public void setChannel(int channel){
        this.channelNumber=channel;
        System.out.println("TV class - setChannel: " + channelNumber);
    };

    public void currentChannel(){
        System.out.println("TV class - Current_Channel: " + channelNumber);
    };
}


