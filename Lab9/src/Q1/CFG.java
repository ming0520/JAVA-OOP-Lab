package Q1;

import java.util.Scanner;

import Q1.Art.ArtStatus;

public class CFG {

	public static void main(String[] args) {
		Art[] art = new Art[5];
		Art Sart = new Art();
		Scanner input = new Scanner(System.in);
		
		Sart.setArt("Sunflowers", "Van Gogh", (long)568000000, ArtStatus.ON_LOAN);
		art[0] = Sart;
		Sart.setArt("Water Lilies", "Monet", (long)350000, ArtStatus.IN_HOUSE);
		art[1] = Sart;
		Sart.setArt("Pieta", "Michelangelo", (long)350000, ArtStatus.ON_LOAN);
		art[2] = Sart;
		
		for (int i = 3; i < 3 + 2; i++) {
			System.out.print("Enter name of art: ");
			String name = input.nextLine();
			System.out.print("Enter author: ");
			String author = input.nextLine();
			System.out.print("Enter value of art : ");
			long value = input.nextLong();
			
			System.out.println("1 - ON_LOAN, 2 - IN_HOUSE");
			System.out.println("Enter the art status");
			int art_choice = input.nextInt();
			
			ArtStatus art_status = null;
			switch(art_choice) {
				case 1:
					art_status = ArtStatus.ON_LOAN;
					break;
				case 2:
					art_status = ArtStatus.IN_HOUSE;
			}
			Sart.setArt(name, author, value, art_status);
			art[i] = Sart;
		}
		
		for(Art aart : art) {
			System.out.println("Name   : " 
			+ aart.getName());
			System.out.println("Author : " 
			+ aart.getAuthor());
			System.out.println("Value  : $" 
			+(new java.text.DecimalFormat("#.##").format(aart.getValue())));
			System.out.println("Status : "
					+ aart.getArtStatus().toString());
			System.out.println("=======================================================");
		}
	}

}
