# 计192 王家增 2019310170
# EXP1
# 阅读程序

## 实验目的
1、掌握字符串String及其方法的使用
2、掌握异常处理结构
## 实验过程
首先完成对基本功能的实现
再完成每个类中两个以上元素的创建
再完成每个类中的两个构造方法
利用private和public避免直接通过”类对象.属性“的形式访问属性值
最终完成实验
## 核心方法
### 1、方法一
public CPU(int speed,String type,double temp) {
	setSpeed(speed);
	setType(type);
	setTemp(temp);
}
### 2、方法二

public void setTemp(double m) {
	if(m>60.00 && m<100.00)
		temp=m;
	    else 
	    	{System.out.println("CPU temp was wrong!");
	    	temp=m;
	    	}
### 3、方法三
 public int getRads() {
			return rads;
		}
	   public void setRads(int rads) {
		   this.rads = rads;
	}
### 4、方法四
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
## 实验结果
![1](https://github.com/Wangjiazeng123/EXP1/blob/main/2061873356d408af44749acb946ae38.png)
## 实验感想
通过此次实验初次了解了java并会利用private和public的用法，熟练掌握了在类中定义构造方法。
