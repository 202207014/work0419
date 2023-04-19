package test.object;

public class TV {
// 추상화 과정에서  선택된 속성은 필드
	private String producer;
	private String modelNum;
	private String color;
	private int size;
	private int channel;
	private int volume;
	//setter 필드의값을 지정 set필드명() => setProducer();
	//getter 필드의값을 반환 get
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getModelNum() {
		return modelNum;
	}
	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
//츠상화 과정에서 선택된 기능은 메소드
	public void PowerOn() {
		System.out.println(color + "색상 tv 전원을 켜짐");
	}
	public void PowerOff() {
		System.out.println(color + "색상 tv 전원을 꺼짐");
	}
	public void upChannel()
	{
		System.out.println("현재 채널은 "+ ++channel + "입니다");
	}
	public void downChannel()
	{
		System.out.println("현재 채널은 "+ --channel + "입니다");
	}
	public void upVolume()
	{
		System.out.println("현재 볼륨은 "+ ++volume + "입니다");
	}
	public void downVolume()
	{
		System.out.println("현재 볼륨은 "+ --volume + "입니다");
	}
	
}	
