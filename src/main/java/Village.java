package lesschtroumpfs;

import java.util.ArrayList;
import lesschtroumpfs.Schtroumpf;

public class Village {
	private String name;
	private ArrayList<Schtroumpf> lesSchtroumpfs;
	private int nbSchtroumpf;
	private int salsepareille;
	
	public Village(String pfNomV, int pfStockSalsepareille, 
	String[] pfNomsDesSchtroumpfs) {
		Schtroumpf s;
		this.name = pfNomV;
		this.salsepareille = pfStockSalsepareille;
		this.nbSchtroumpf = pfNomsDesSchtroumpfs.length;
		this.lesSchtroumpfs = new ArrayList<Schtroumpf>();
		for (int i = 0; i<pfNomsDesSchtroumpfs.length;i++) {
			s = new Schtroumpf(pfNomsDesSchtroumpfs[i],(int)(Math.random()*150),this);
			this.lesSchtroumpfs.add(s);
		}
	}
	
	public String getNom() {
		return this.name;
	}
	
	public int getNbSchtroumpf() {
		return this.nbSchtroumpf;
	}
	
	public int getStockSalsepareille() {
		return this.salsepareille;
	}
	
	public void solstice_d_ete() {
		int isHappy = 0;
		for(int i = 0; i<this.nbSchtroumpf;i++) {
			this.lesSchtroumpfs.get(i).sePresenter();
			this.lesSchtroumpfs.get(i).chanter();
			if(this.lesSchtroumpfs.get(i).getHappiness()) {
				isHappy++;
			}
		}
		System.out.println("Nombre de schtroumpf présents à la fête : " + nbSchtroumpf + "\n");
		System.out.println("Nombre de schtroumpf heureux : " + isHappy + "\n");
	}
	
	public Schtroumpf chefDuVillage() {
		Schtroumpf chef = this.lesSchtroumpfs.get(0) ;
		for(int i = 1; i<this.nbSchtroumpf;i++) {
			if(this.lesSchtroumpfs.get(i).getAge()>chef.getAge()) {
				chef = this.lesSchtroumpfs.get(i);
			}
		}
		return chef;
	}
	
	public void envoyerAuTravail() {
		int isHappy = 0;
		for(int i = 0; i<this.nbSchtroumpf;i++) {
			if(this.lesSchtroumpfs.get(i).getHappiness()) {
				isHappy++;
			}
		}
		for(int i = 0; i<isHappy/2;i++) {
			this.lesSchtroumpfs.get(i).allerTravailler();;
		}
	}
	
	public void schtroumpsfHeureux () {
		for(int i = 0; i<this.nbSchtroumpf;i++) {
			this.lesSchtroumpfs.get(i).sePresenter();
			this.lesSchtroumpfs.get(i).chanter();
		}
	}
	
	public void addSalsepareille(int pfFeuille) {
		this.salsepareille+=pfFeuille;
	}
	
	public void dinerTousEnsemble() {
		for(int i = 0; i<this.nbSchtroumpf;i++) {
			this.lesSchtroumpfs.get(i).dinnerAuVillage();
		}
	}
	
	public void envoyerCueillirSalsepareille() {
		int isHappy = 0;
		for(int i = 0; i<this.nbSchtroumpf;i++) {
			if(this.lesSchtroumpfs.get(i).getHappiness()) {
				isHappy++;
			}
		}
		for(int i = 0; i<isHappy/2;i++) {
			this.lesSchtroumpfs.get(i).recolterSalsepareille();
		}
	}
	
}