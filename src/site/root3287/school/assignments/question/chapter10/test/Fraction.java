
public class Fraction {
	private float num, denum;

	public Fraction(int num, int denum) {
		super();
		this.num = num;
		if(denum != 0)
			this.denum = denum;
	}
	
	public boolean isGreaterThan(Fraction f){
		if(this.num/this.denum > f.num / f.denum){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.num + "/" + this.denum;
	}
}
