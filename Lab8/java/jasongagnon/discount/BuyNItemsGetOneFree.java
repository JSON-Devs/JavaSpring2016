package jasongagnon.discount;

public class BuyNItemsGetOneFree extends DiscountPolicy{
	private float discount;
	private int noOfItemsForDiscount;
	
	public BuyNItemsGetOneFree(int n){
		noOfItemsForDiscount = n;
	}
	
	public float computeDiscount(int count, float itemCost){
		for(int i=0; i < count; i++){
			if((i+1)%noOfItemsForDiscount == 0){
				discount = discount + itemCost;
			}
		}
		return discount;
	}
}
