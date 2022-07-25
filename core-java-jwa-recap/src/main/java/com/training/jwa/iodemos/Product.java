package com.training.jwa.iodemos;

import java.io.Serializable;

//POJO/BEANS
public class Product implements Serializable{
		private int productId;
		private String productName;
		
		
		public Product(int productId, String productName) {
			super();
			this.productId = productId;
			this.productName = productName;
		}


		public int getProductId() {
			return productId;
		}


		public void setProductId(int productId) {
			this.productId = productId;
		}


		public String getProductName() {
			return productName;
		}


		public void setProductName(String productName) {
			this.productName = productName;
		}


		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + "]";
		}
		
		
}
