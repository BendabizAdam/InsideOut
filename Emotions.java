package InsideOut;
import java.util.Arrays;

public class Emotions {
	boolean Joie=false,Tristesse=false,D�go�t=false,Peur=false,Col�re=false;
	int ScoreJoie,ScoreTristesse,ScoreD�go�t,ScorePeur,ScoreCol�re;
	int[] Sorter;
	public void getEmotion(int SortedInt) {
		if(SortedInt==ScoreJoie)
			Joie=true;
		if(SortedInt==ScoreTristesse)
			Tristesse=true;
		if(SortedInt==ScoreD�go�t)
			D�go�t=true;
		if(SortedInt==ScorePeur)
			Peur=true;
		if(SortedInt==ScoreCol�re)
			Col�re=true;
	}
	public void VerifyEmotions() {
		Sorter= new int[] {ScoreJoie,ScoreTristesse,ScoreD�go�t,ScorePeur,ScoreCol�re};
		Arrays.sort(Sorter);
		getEmotion(Sorter[4]);
	}
}
