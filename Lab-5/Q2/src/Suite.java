public class Suite extends HotelRoom{
    Suite(int roomNo){
	super(roomNo);
	if(super.roomNo <= 299) {
		super.rentalRate = super.rentalRate + 40;
	}
	else {
		super.rentalRate = super.rentalRate + (super.rentalRate * 0.15) + 40;
	}
    }
}
