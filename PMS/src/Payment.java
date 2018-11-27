import java.util.Vector;

public class Payment{
	private Order order;
	int cardNo;
	String cardType;
	double totalPay;
	
	
	Payment(Order order, int card, String type){
		this.order = order;
		cardNo = card;
		cardType = type;
		totalPay = 0;
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
		return totalPay;
	}
}
