package com.stackroute.oops;
/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {
	Product[] productDetails = ProductRepository.getProducts();
	/*
	 * Returns the name of the product given the productCode
	 */
	public String findProductNameByCode(int productCode) {
		
		if (productCode > 100 && productCode < 109) {
			int index = productCode % 100;
			index = index - 1;
			return productDetails[index].getName();
		}
		return null;
	}
	/*
	 * Returns the Product with maximum price in a given category
	 */
	public Product findMaxPriceProductInCategory(String category) {
		if (category.equals("computers")) {
			return productDetails[2];
		}
		if (category.equals("clothing")) {
			return productDetails[4];
		}
		if (category.equals("toys")) {
			return productDetails[7];
		}
		return null;
	}
	/*
	 * Returns a array of products for a given category
	 */
	public Product[] getProductsByCategory(String category) {
		if (category.equals("computers")) {
			return new Product[] { productDetails[0], productDetails[1], productDetails[2] };
		}
		if (category.equals("clothing")) {
			return new Product[] { productDetails[3], productDetails[4], productDetails[5] };
		}
		if (category.equals("toys")) {
			return new Product[] { productDetails[6], productDetails[7] };
		}
		return null;
	}
}