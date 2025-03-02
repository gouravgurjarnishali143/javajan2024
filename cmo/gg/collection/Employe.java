package cmo.gg.collection;

public class Employe {
	
	private int id;
	
	private String name;
	
public  Employe(int id , String name) {
	super();
	this.id = id ;
	this .name= name;
	
}

public int getId1() {
	
	return id;
}
public void setid(int id) {
	
	this.id = id;

}
public String getId() {

	return name;

}

public void setid(String name) {
	
this.name= name;

}
@Override
public String toString() {
	return "Employe = [id=" +id+",name="+name+"]";
}
}
