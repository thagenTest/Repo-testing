import tester.Tester;

class Dillo {
	int length;
	boolean isDead;

	Dillo(int length, boolean isDead) {
		this.length = length;
		this.isDead = isDead;

	}

	boolean canShelter() {
		return (this.length > 60 && this.isDead);
	}
}

class Examples {
	Examples() {
	}

	Dillo babyDillo = new Dillo(25, false);
	Dillo adultDillo = new Dillo(50, false);
	Dillo hugeDeadDillo = new Dillo(66, true);

	boolean testBabyShelter(Tester t) {
		return t.checkExpect(babyDillo.canShelter(), false);
	}

	boolean testHugeShelter(Tester t) {
		return t.checkExpect(hugeDeadDillo.canShelter(), true);
	}

}