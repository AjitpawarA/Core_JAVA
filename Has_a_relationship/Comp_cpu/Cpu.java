package Comp_cpu;

public class Cpu {
	private String systemName;
	private int cpuid;
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	public int getCpuid() {
		return cpuid;
	}
	public void setCpuid(int cpuid) {
		this.cpuid = cpuid;
	}
	public Cpu(String systemName, int cpuid) {
		super();
		this.systemName = systemName;
		this.cpuid = cpuid;
	}
	@Override
	public String toString() {
		return "Cpu [systemName=" + systemName + ", cpuid=" + cpuid + "]";
	}
	
	public void displaycpu() {
		System.out.println("CPU: "+systemName+" cpiid: "+cpuid);
	}
	
}
