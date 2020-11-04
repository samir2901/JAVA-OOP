public class HotelRoom {
    int roomNo;
    double rentalRate;
    HotelRoom(int roomNo){
	this.roomNo = roomNo;
	if(this.roomNo <= 299 ) {
        	this.rentalRate = 69.95;
	}
	else {
		this.rentalRate = 89.95;
	}
    }
	
    int getRoomNo(){
	return this.roomNo;
    }
    double getRentalRate() {
	return this.rentalRate;
    }    
}
