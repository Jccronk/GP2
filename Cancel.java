package gp2;

public class Cancel implements HomeState {
	Home home;
	private boolean status;
	public Cancel(Home home2) {
		this.home = home2;
	}

	@Override
    public boolean isArmed() {
        
        return this.status;
    }

	@Override
	public boolean checkForMotion() {
		// TODO Auto-generated method stub
		return false;
	}

}
