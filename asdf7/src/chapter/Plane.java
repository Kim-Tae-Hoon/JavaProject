package chapter;

public class Plane {
	private int producer, p_num;
	private String model;
	private static int Planes;

	public int getProducer() {
		return producer;
	}

	public void setProducer(int producer) {
		this.producer = producer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getP_num() {
		return p_num;
	}

	public void setP_num(int p_num) {
		this.p_num = p_num;
	}

	public static void Planes() {

	}

	@Override
	public String toString(){
		return "�ĺ���ȣ = "+getProducer()+"�� = "+getModel() + "�°��� = "+getP_num() + "�Դϴ�.";
		
	}

	Plane(int p, String m, int pn) {
		producer = p;
		model = m;
		p_num = pn;
	}
	
}
