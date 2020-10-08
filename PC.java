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

       System.out.println("CPUËÙ¶È:"+cpu.getSpeed());
       System.out.println("HardDisk is "+HD.getAmount()+" G.");
       System.out.println("Ó²ÅÌÈÝÁ¿:"+HD.getAmount());
       System.out.println("CPU temp is "+cpu.getTemp()+"¡ã ");
       System.out.println("HardDisk Rads is "+HD.getRads()+" rps.");
       System.out.println("CPU Type is "+cpu.getType()+" ");
    }


	}


