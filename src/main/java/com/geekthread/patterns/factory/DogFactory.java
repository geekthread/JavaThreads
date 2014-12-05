package com.geekthread.patterns.factory;

public class DogFactory {
	Poodle poodle;
	Rottweiler rottweiler;
	SiberianHusky siberianhusky;

	public Poodle getPoodle() {
		return poodle;
	}

	public void setPoodle(Poodle poodle) {
		this.poodle = poodle;
	}

	public Rottweiler getRottweiler() {
		return rottweiler;
	}

	public void setRottweiler(Rottweiler rottweiler) {
		this.rottweiler = rottweiler;
	}

	public SiberianHusky getSiberianhusky() {
		return siberianhusky;
	}

	public void setSiberianhusky(SiberianHusky siberianhusky) {
		this.siberianhusky = siberianhusky;
	}

	public Dog getDog(String criteria) {
		if (criteria.equals("small"))
			return poodle;

		else if (criteria.equals(Dog.breedtype.SMALL))
			return rottweiler;
		else if (criteria.equals("working"))
			return siberianhusky;

		return poodle;
	}

	public Dog getDog(String criteria, String ability, String cote) {

		if (criteria.equals("small"))
			return poodle;
		else if (ability.equals("working") && cote.equals("Small"))
			return rottweiler;
		else if (cote.equals("Long") && ability.equals("working"))
			return siberianhusky;

		return poodle;
	}
}
