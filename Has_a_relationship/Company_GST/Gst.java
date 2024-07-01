package Company_GST;

public class Gst {
	private int gstno;

	public int getGstno() {
		return gstno;
	}

	public void setGstno(int gstno) {
		this.gstno = gstno;
	}

	@Override
	public String toString() {
		return "Gst [gstno=" + gstno + "]";
	}

	public Gst(int gstno) {
		super();
		this.gstno = gstno;
	}
	
	public void showgst() {
		System.out.println("GST:" + gstno);
	}
}
