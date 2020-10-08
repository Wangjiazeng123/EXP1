package pack2;

import pack1.CPU;
import pack1.HardDisk;
import pack3.PC;

public class Test {

	   public static void main(String args[]) {

	       CPU cpu = new CPU();

	       HardDisk HD=new HardDisk();

	       cpu.setSpeed(2200);
	       cpu.setTemp(67);
	       cpu.setType("intel i9");
	       HD.setAmount(200);
	       HD.setRads(5400);
	       PC pc =new PC(HD);

	       pc.setCPU(cpu);

	       pc.show();

	    }

	}
