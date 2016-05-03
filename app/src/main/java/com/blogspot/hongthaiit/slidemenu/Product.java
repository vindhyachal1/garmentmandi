package com.blogspot.hongthaiit.slidemenu;

import java.util.ArrayList;

/**
 * 
 * first level item
 * 
 */
public class Product {

	private String pName;

	private ArrayList<SubCategory> mSubCategoryList;

	public Product(String pName, ArrayList<SubCategory> mSubCategoryList) {
		super();
		this.pName = pName;
		this.mSubCategoryList = mSubCategoryList;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public ArrayList<SubCategory> getmSubCategoryList() {
		return mSubCategoryList;
	}

	public void setmSubCategoryList(ArrayList<SubCategory> mSubCategoryList) {
		this.mSubCategoryList = mSubCategoryList;
	}

	/**
	 * 
	 * second level item
	 * 
	 */

	public static class SubCategory {

		private String pSubCatName;
		private ArrayList<ItemList> mItemListArray;

		public SubCategory(String pSubCatName,
				ArrayList<ItemList> mItemListArray) {
			super();
			this.pSubCatName = pSubCatName;
			this.mItemListArray = mItemListArray;
		}

		public String getpSubCatName() {
			return pSubCatName;
		}

		public void setpSubCatName(String pSubCatName) {
			this.pSubCatName = pSubCatName;
		}

		public ArrayList<ItemList> getmItemListArray() {
			return mItemListArray;
		}

		public void setmItemListArray(ArrayList<ItemList> mItemListArray) {
			this.mItemListArray = mItemListArray;
		}

		/**
		 * 
		 * third level item
		 * 
		 */
		public static class ItemList {

			private String itemName;
			private String itemPrice;
			private ArrayList<ItemList4> mItemListArray;

			public ItemList(String itemName, ArrayList<ItemList4> mItemListArray) {
				super();
				this.itemName = itemName;
				this.itemPrice = itemPrice;
				this.mItemListArray=mItemListArray;
			}

			public String getItemName() {
				return itemName;
			}

			public void setItemName(String itemName) {
				this.itemName = itemName;
			}

			public String getItemPrice() {
				return itemPrice;
			}

			public void setItemPrice(String itemPrice) {
				this.itemPrice = itemPrice;
			}

			public ArrayList<ItemList4> getmItemListArray() {
				return mItemListArray;
			}

		}
		/**
		 * 
		 * fourth level item
		 * 
		 */
		public static class ItemList4 {

			private String itemName;
			private String itemPrice;

			public ItemList4(String itemName) {
				super();
				this.itemName = itemName;
//				this.itemPrice = itemPrice;
			}

			public String getItemName() {
				return itemName;
			}

			public void setItemName(String itemName) {
				this.itemName = itemName;
			}

			public String getItemPrice() {
				return itemPrice;
			}

			public void setItemPrice(String itemPrice) {
				this.itemPrice = itemPrice;
			}

		}

	
	}

}
