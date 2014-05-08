package com.h2kinfosys.java.lamdaExpression;

public class ClientProgram {

	public static void main(String[] args) {
		
		/**
		 * 
		 */
		/*WorkerInterface itWorker = new ITWorker();
		itWorker.working();
		*/
		
		/**
		 * 
		 */
		/*WorkerInterface itWorker = new ITWorker()
		{
			@Override
			public void working() {
				System.out.println("I am a JAVA IT Worker");
				callMe();
			}
			public void callMe(){
				System.out.println("Please call me");
			}
		};
		itWorker.working();*/
		
		/**
		 * 
		 */
		WorkerInterface nonItWorker = () -> System.out.println("I am non IT Worker");
		//Lamda Expression
		nonItWorker.working();
	}
}