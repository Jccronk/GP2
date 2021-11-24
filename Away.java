package gp2;

public class Away implements HomeState {
	Home home;
	private boolean status;

    public  Away(Home home) {
        this.home = home;

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
