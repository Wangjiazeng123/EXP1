package pack3;

import pack1.CPU;
import pack1.HardDisk;

public class PC {

private    CPU cpu;

private    HardDisk HD;

    public void setCPU(CPU cpu) {

        this.cpu = cpu;

    }

    public PC(HardDisk HD) {
    	
    	  this.HD = HD;
    }

    public void show(){

       System.out.println("CPU�ٶ�:"+cpu.getSpeed());
       System.out.println("HardDisk is "+HD.getAmount()+" G.");
       System.out.println("Ӳ������:"+HD.getAmount());
       System.out.println("CPU temp is "+cpu.getTemp()+"�� ");
       System.out.println("HardDisk readspeed is "+HD.getRads()+" rps.");
    }


	}


