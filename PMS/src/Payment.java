import java.util.Vector;

public class Payment{
	private Order order;
	int cardNo;
	String cardType;
	double totalPay;
	Buyer buyer;
	
	Payment(Order order, int card, String type,Buyer regBuy){
		this.order = order;
		cardNo = card;
		cardType = type;
		totalPay = 0;
		buyer = regBuy;
	}

	public double getTotalPay() {
		totalPay = calculatePayment();
		return totalPay;
	}

	public void setTotalPay(int totalPay) {
		this.totalPay = totalPay;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public double calculatePayment(){
		for(int i =0; i< order.getDocs().size();i++){
			totalPay += order.getDocs().get(i).getPrice();
		}
		if(buyer instanceof RegisteredBuyer){
		return totalPay * 0.80;
		}
		else{
			return totalPay;
		}
	}
}
