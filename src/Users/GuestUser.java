package Users;

import java.io.Serializable;

public class GuestUser extends User implements Serializable {

	String sAddress1="";
	String sAddress2="";
	String sAddress3="";
	String bAddress1="";
	String bAddress2="";
	String bAddress3="";
	String sCity="";
	String sState="";
	String sZip="";
	String bCity="";
	String bState="";
	String bZip="";
	int id;
	String fName="";
	String lName="";
	String mName="";
	String ccNumber;
	String expDate;
	String cardType;
	
	public GuestUser(){
		
	}
	
	public GuestUser(String sAddress1,String sAddress2,String sAddress3,String bAddress1,
			String bAddress2,String bAddress3,String sCity,String sState,String sZip,
			String bCity,String bState,String bZip, String ccNumber, String expDate, String cardType){
		
		 
		 this.sAddress1=sAddress1;
		 this.sAddress2=sAddress2;
		 this.sAddress3=sAddress3;
		 this.bAddress1=bAddress1;
		 this.bAddress2=bAddress2;
		 this.bAddress3=bAddress3;
		 this.sCity=sCity;
		 this.sState=sState;
		 this.sZip=sZip;
		 this.bCity=bCity;
		 this.bState=bState;
		 this.bZip=bZip;
		 this.ccNumber=ccNumber;
		 this.expDate=expDate;
		 this.cardType=cardType;
		
	}
	
	public void setSAddress1(String s1){
		sAddress1=s1;
	}
	public void setSAddress2(String s1){
		sAddress2=s1;
	}
	public void setSAddress3(String s1){
		sAddress3=s1;
	}
	public void setBAddress1(String s1){
		bAddress1=s1;
	}
	public void setBAddress2(String s1){
		bAddress2=s1;
	}
	public void setBAddress3(String s1){
		bAddress3=s1;
	}
	public void setSState(String s1){
		sState=s1;
	}
	public void setSCity(String s1){
		sCity=s1;
	}
	public void setSZip(String s1){
		sZip=s1;
	}
	public void setBState(String s1){
		bState=s1;
	}
	public void setBCity(String s1){
		bCity=s1;
	}
	public void setBZip(String s1){
		bZip=s1;
	}
	
	public void setccNumber(String s1){
		ccNumber=s1;
	}
	
	public void setexpDate(String s1){
		expDate=s1;
	}
	
	public void setcardType(String s1){
		cardType=s1;
	}
	
	public void setfName(String s1){
		fName=s1;
	}
	public void setmName(String s1){
		mName=s1;
	}
	public void setlName(String s1){
		lName=s1;
	}
	
	public void userId(int id){
		this.id=id;
	}
	
	public int getUserId(){
		return id;
	}
	
	public String toString(){
		return   sAddress1 +"/n"+  sAddress2+"/n"+ sAddress3 +"/n"+ bAddress1+"/n"+
				 bAddress2+"/n"+  bAddress3+"/n"+  sCity+"/n"+  sState +"/n"+ sZip+"/n"+
				 bCity+"/n"+ bState+"/n"+ bZip+"/n"+  ccNumber+"/n"+  expDate+"/n"+  cardType;
	}
}
