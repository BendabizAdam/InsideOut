package InsideOut;

import java.util.Scanner;

public class Simulateur {
	Scanner clavier = new Scanner(System.in);
	Emotions x=new Emotions();
	Emotions y=new Emotions();
	int r�ponse;
	public void Jeu() {
		// x.Emotion
		System.out.println("Bienvenue dans ce simulateur d'�motions" 
				+ "\nPremi�re question : "
				+ "\nVous travaillez sur un projet artistique mais vous ne trouvez pas le r�sultat satisfaisant"
				+ "\n Vous :"
				+ "\n		1- vous en fichez, c'est de l'art apr�s tout ! "
				+ "\n		2- le jetez et recommencez"
				+ "\n		3- le montrez anonymement"
				+ "\n		4- riez de combien le r�sultat est stupide");
		r�ponse=clavier.nextInt();
		switch(r�ponse) {
		case 1 :
			x.ScoreJoie=+2;
		case 2 : {
			x.ScoreJoie++;
			x.ScoreD�go�t++;
			}
		case 3 :
			x.ScorePeur++;
			x.ScoreTristesse++;
		case 4 :
			x.ScoreTristesse=+2;}
		System.out.println("\nDeuxi�me question :"
				+ "\n� un d�ner, on vous sert un plat que vous n'avez jamais go�t�, comment vous sentez-vous ?"
				+ "\n		1-Excit�(e) ; vous aimez exp�rimenter de nouvelles choses"
				+ "\n		2-D�gout�(e) ; vous ne l'aimerez probablement pas"
				+ "\n		3-D��u(e) ; vous n'auriez jamais d� venir"
				+ "\n		4-Inquiet(e) ; comment cacheriez-vous le repas si vous ne l'aimerez pas ?"
				+ "\n		5-Fach�(e) ; pourquoi me feraient-ils manger �a ?");
		r�ponse=clavier.nextInt();
		switch(r�ponse) {
		case 1 :
			x.ScoreJoie=+2;
		case 2 :
			x.ScoreD�go�t++;
			x.ScorePeur++;
		case 3 :
			x.ScoreD�go�t++;
			x.ScoreCol�re++;
		case 4 :
			x.ScorePeur++;
			x.ScoreTristesse++;
		case 5 :
			x.ScoreCol�re=+2;
		}
		System.out.println("\nTroisi�me question :"
				+ "\nComment r�agissez-vous apr�s un cauchemar ?"
				+ "\n		1-Je ne dors pas tranquillement pendant quelque jours"
				+ "\n		2-J'essaye de penser � des choses heureuses"
				+ "\n		3-J'en parle � quelqu'un"
				+ "\n		4-J'analyse mon r�ve");
		r�ponse=clavier.nextInt();
		switch(r�ponse) {
		case 1 :
			x.ScorePeur=+2;
		case 2 :
			x.ScoreJoie++;
		case 3 :
			x.ScorePeur++;
			x.ScoreTristesse=+2;
		case 4 :
			x.ScorePeur--;
		}
		// y.Emotion
		System.out.println("\nQuatri�me question :"
				+ "\nVous demandez � votre ami une faveur mais elle vous est refus�e, comment r�agissez-vous ?"
				+ "\n		1-Un peu d��u(e)..."
				+ "\n		2-En col�re, mes amis devraient toujours r�pondre \"oui\" ! "
				+ "\n		3-Inquiet de devoir la faire moi-m�me"
				+ "\n		4-Pas tr�s content, mais je peux comprendre"
				+ "\n		5-D�t�rmin�(e) � vouloir la faire par moi-m�me !");
		r�ponse=clavier.nextInt();
		switch(r�ponse) {
		case 1 :
			y.ScoreTristesse++;
		case 2 :
			y.ScoreTristesse++;
			y.ScoreCol�re=+2;
		case 3 :
			y.ScorePeur++;
			y.ScoreTristesse++;
		case 4 :
			y.ScoreCol�re--;
			y.ScoreTristesse--;
		case 5:
			y.ScoreJoie=+2;
		}
		System.out.println("\nCinqui�me question :"
				+ "\nVous �tes en for�t avec vos amis, et ils proposent de prendre en raccourci une voie que vous ne connaissez pas, que faites-vous ?"
				+ "\n		1-Vous allez avec eux"
				+ "\n		2-Vous prenez la voie que vous connaissez"
				+ "\n		3-Vous tentez de les convaincre de pas prendre le raccourci");
		r�ponse=clavier.nextInt();
		switch(r�ponse) {
		case 1 :
			y.ScoreJoie++;
		case 2 :
			y.ScoreTristesse++;
			y.ScorePeur=+2;
		case 3 :
			y.ScoreCol�re++;
			y.ScoreD�go�t++;
		}
		System.out.println("\nDerni�re question :"
				+ "\nVous �tes dans un parc d'attraction, mais les queues semblent tr�s longues, que faites-vous ?"
				+ "\n		1-Vous ne perdez pas de temps ! vous prenez la premi�re place qui s'offre � vous"
				+ "\n		2-Vous rentrez chez-vous, �a ne vaut pas d'attendre..."
				+ "\n		3-Vous parlez aux r�sponsables de la gestion, le parc a besoin d'un meilleur syst�me de queue !"
				+ "\n		4-Attendez toute la journ�e pr�s des lignes de queue, en esp�rant qu'elle se vident");
		r�ponse=clavier.nextInt();
		switch(r�ponse) {
		case 1 :
			y.ScoreJoie=+2;
		case 2 :
			y.ScoreTristesse=+2;
			y.ScoreD�go�t++;
		case 3 :
			y.ScoreJoie++;
			y.ScoreD�go�t=+2;
		case 4 :
			y.ScoreD�go�t++;
			y.ScoreCol�re=+2;
		}
	}
	public void Scorer() {
		x.VerifyEmotions();
		y.VerifyEmotions();
		if(x.Joie == true) {
			if(y.Joie==true)
				System.out.println("Vous d�bloquez l'extase !!!\n");
			else if(y.Tristesse==true)
				System.out.println("Vous d�bloquez la m�lancolie !\n");
			else if(y.D�go�t == true)
				System.out.println("Vous d�bloquez l'obsession !\n");
			else if(y.Peur==true)
				System.out.println("Vous d�bloquez la surprise !\n");
			else if(y.Col�re==true)
				System.out.println("Vous d�bloquez la f�rocit� !\n");
		}
		else if(x.Tristesse==true) {
			if(y.Joie==true)
				System.out.println("Vous d�bloquez la m�lancolie ! !\n");
			else if(y.Tristesse==true)
				System.out.println("Vous d�bloquez le d�sespoir !!!\n");
			else if(y.D�go�t == true)
				System.out.println("Vous d�bloquez la d�pression !\n");
			else if(y.Peur==true)
				System.out.println("Vous d�bloquez l'anxi�t� !\n");
			else if(y.Col�re==true)
				System.out.println("Vous d�bloquez la trahison !\n");
		}
		else if(x.D�go�t==true) {
			if(y.Joie==true)
				System.out.println("Vous d�bloquez l'obsession !\n");
			else if(y.Tristesse==true)
				System.out.println("Vous d�bloquez la d�pression !\n");
			else if(y.D�go�t == true)
				System.out.println("Vous d�bloquez le m�pris  !!!\n");
			else if(y.Peur==true)
				System.out.println("Vous d�bloquez la r�vulsion !\n");
			else if(y.Col�re==true)
				System.out.println("Vous d�bloquez l'aversion !\n");
		}
		else if(x.Peur==true) {
			if(y.Joie==true)
				System.out.println("Vous d�bloquez la surprise !\n");
			else if(y.Tristesse==true)
				System.out.println("Vous d�bloquez l'anxi�t� !\n");
			else if(y.D�go�t == true)
				System.out.println("Vous d�bloquez la r�vulsion !\n");
			else if(y.Peur==true)
				System.out.println("Vous d�bloquez la terreur !!!\n");
			else if(y.Col�re==true)
				System.out.println("Vous d�bloquez la haine !\n");
		}
		else if(x.Col�re==true) {
			if(y.Joie==true)
				System.out.println("Vous d�bloquez la f�rocit� !\n");
			else if(y.Tristesse==true)
				System.out.println("Vous d�bloquez la trahison !\n");
			else if(y.D�go�t == true)
				System.out.println("Vous d�bloquez l'aversion !\n");
			else if(y.Peur==true)
				System.out.println("Vous d�bloquez la haine !\n");
			else if(y.Col�re==true)
				System.out.println("Vous d�bloquez la rage !!!\n");
		}
	}

}
