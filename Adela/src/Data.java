public class Data {
	private int dita;
	private int muaji;
	private int viti;
	public Data() {
		setDita(1);
		setMuaji(1);
		setViti(1970);
	}
public Data(int dita,int muaji,int viti) {
	if(kontrolloData(dita,muaji,viti)) {
	setDita(dita);
	setMuaji(muaji);
	setViti(viti);
}
	else {
		setDita(1);
		setMuaji(1);
		setViti(1970);
	}
	}
private boolean kontrolloData(int dita,int muaji,int viti) {
	if(dita<=0|| dita>31|| muaji<=0||muaji>12|| viti<=0) return false;
	if((muaji==4||muaji==6||muaji==9||muaji==11)&&dita>30) return false;
	if(muaji==2 && dita > 29)return false;
	if(!vitiBrishte(viti)&& muaji==2 && dita>28)return false;
	
	return true;
}
private boolean vitiBrishte(int viti) {
	if (viti%4==0 && viti%100!=0||viti%400 == 0)
		return true;
	else return false;
}


public int getDita() {
	return dita;
}
public void setDita(int dita) {
	this.dita = dita;
}
public int getMuaji() {
	return muaji;
}
public void setMuaji(int muaji) {
	this.muaji = muaji;
}
public int getViti() {
	return viti;
}
public void setViti(int viti) {
	this.viti = viti;
}
public void afishoDaten() {
	String dita;
	String muaji;
	String data;
	if(getDita()<10)
		dita="0"+getDita();
	else
		dita=""+getDita();
	if(getMuaji()<10)
		muaji= "0"+getMuaji();
	else
		muaji=""+ getMuaji();
	data = dita+"/"+muaji+"/"+ getViti();
	System.out.println(data);
}
}
	

	


