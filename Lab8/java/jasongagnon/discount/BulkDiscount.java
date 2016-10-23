package jasongagnon.discount;

public class BulkDiscount extends DiscountPolicy{
	private float discount;
	private int minBulk;
	private float perBulk;
	
	public BulkDiscount(int minimum, float percent){
		minBulk = minimum;
		perBulk = percent;
	}
	
	public float computeDiscount(int count, float itemCost){
		//float discountPercent = 100 - perBulk;
		float myDiscount = perBulk / 100;
		discount = itemCost * count;
		if(count >= minBulk){
			discount = discount * myDiscount;
		}
		else{
			discount = 0;
		}
		return discount;
	}
}
