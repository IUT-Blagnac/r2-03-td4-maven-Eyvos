package lesschtroumpfs;

public class Schtroumpf {
	private String name;
	private int age;
	private boolean isHappy;
	private Village village;
	
	/*
	/Permet de créer un Schtroumpf
	/@param pfName
	/@param pfAge
	*/
	public Schtroumpf(String pfName, int pfAge){
		this.name = pfName;
		this.age = pfAge;
		this.isHappy = true;
	}
	
	/**
	*Permet de créer un Schtroumpf
	*@param pfName
	*@param pfAge
	*@param pfVillage
	*/
	public Schtroumpf(String pfName, int pfAge, Village pfVillage) {
		this.name = pfName;
		this.age = pfAge;
		this.village = pfVillage;
		this.isHappy = true;
	}
	
	public String getNom() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public boolean getHappiness(){
		return this.isHappy;
	}
	
	public Village getVillage() {
		return this.village;
	}
	
	public void setVillage(Village pfV) {
		this.village = pfV;
	}
	
	public String toString() {
		String toString = "Je suis " + this.name + ", j'ai "+ this.age + " ans et je suis ";
		if(!this.isHappy) {
			toString += "PAS ";
		}
		toString += "content ";
		if(this.village == null) {
			toString+="je suis ermite";
		}else {
			toString+=this.village;
		}
		return toString;
	}
	
	public void sePresenter() {
		System.out.println(this.toString());
	}
	
	public String leChant() {
		String chant = "";
		if(this.isHappy) {
			chant += "la, la, la Schtroumpf la, la";
		}else {
			chant += "gloups"; 
		}
		return chant;
	}
	
	public void chanter() {
		System.out.println(this.leChant());
	}
	
	public void anniversaire() {
		this.age++;
	}
	
	public void manger(int pfQte) {
		if(pfQte>0) {
			this.isHappy = true;
		}
	}
	
	public void allerTravailler() {
		this.isHappy = false;
	}
	
	public void recolterSalsepareille() {
		if(this.village == null) {
			this.manger(5);
		}else {
			this.village.addSalsepareille(5);
		}
		this.isHappy = false;
	}
	
	public void dinnerAuVillage() {
		if(this.village == null) {
			this.isHappy = false;
		}else {
			if(this.village.getStockSalsepareille()>=3) {
				this.manger(3);
				this.village.addSalsepareille(-3);
			}else {
				this.isHappy = false;
			}
		}
	}

}