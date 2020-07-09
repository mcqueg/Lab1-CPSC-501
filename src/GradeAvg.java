//********************************************************************
//  Garrett McCue 	
//
//	7/08/20
//
//	CPSC-501-Lab1Ex2 
//  
// Averages all three quiz scores and 2 test scores then returns each
// average. 
//********************************************************************

public class GradeAvg {

	public static void main(String[] args) {

		double quizScore1 = 60;
		double quizScore2 = 83;
		double quizScore3 = 95;

		double testScore1 = 78;
		double testScore2 = 92;

		double quizScoreAvg = (quizScore1 + quizScore2 + quizScore3) / 3;

		double testScoreAvg = (testScore1 + testScore2) / 2;

		System.out.println("quiz average: " + quizScoreAvg + "%");
		System.out.println("test average: " + testScoreAvg + "%");

	}

}
