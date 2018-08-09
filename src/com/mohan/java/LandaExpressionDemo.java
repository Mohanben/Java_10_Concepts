package com.mohan.java;

public class LandaExpressionDemo {

	public static void main(String[] args) {

		Thread thread = () -> {
			System.err.println("");
			return "";
		};
		
		thread.run();
		
		View view = null;
		view.setOnclickListner(new onClickListener() {

			@Override
			public void onClick(View view) {

			}
		});

	}

}

interface onClickListener {
	public void onClick(View view);
}

class View {
	public void setOnclickListner(onClickListener onClickListener) {

	}
}

interface Thread {
	public String run();
}