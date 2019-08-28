import java.util.Scanner;

public class numberGuessingGame
	{
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				Scanner userInputInt = new Scanner(System.in);

				// greet
				System.out.println("Hello! What's your name?");
				String name = userInput.nextLine();
				System.out.println("Hello " + name + ", Welcome to my Number Guessing Game!");

				// start of the replay loop
				boolean replaying = true;
				while (replaying)
					{
						// settings
						System.out.println("What dificulty would you like to play?\n"
								+ "1: Easy    (1-10,   3 guesses )\n" + "2: Medium  (1-50,   7 guesses )\n"
								+ "3: Hard    (1-100,  10 guesses)\n" + "4: Extreme (1-1000, 30 guesses)\n");
						int difficulty = userInputInt.nextInt();
						int tries = 0;
						int max = 0;
						switch (difficulty)
							{
							case 1:
								max = 10;
								tries = 3;
								System.out.println("Easy mode it is!");
								break;
							case 2:
								max = 50;
								tries = 7;
								System.out.println("Medium mode, a perfect average!");
								break;
							case 3:
								max = 100;
								tries = 10;
								System.out.println("OOOohh! Hard Mode! Very Impressive!");
								break;
							case 4:
								max = 1000;
								tries = 30;
								System.out.println("WOW I bet you're reallllly popular, huh?");
								break;

							}
						// play the game
						System.out.println("Okay, " + name
								+ ", I have a number in my head, can you guess it? (Between 1 and " + max + ")");
						int rand = (int) (Math.random() * max) + 1;
						// System.out.println(rand);
						boolean playing = true;
						int attempts = 0;
						while (playing)
							{
								attempts++;
								System.out.println("You have " + tries + " tries.");
								tries--;

								System.out.print(":");
								int guess = userInputInt.nextInt();

								if (guess > rand)
									{
										System.out.println("Too High!");
									} else if (guess < rand)
									{
										System.out.println("Too Low!");
									} else
									{
										System.out.println("Thats right! I\'m do proud of you, " + name
												+ "!\nYou got the number in " + attempts + " attempts.");
										playing = false;
									}

								if (tries == 0 && playing)
									{
										System.out.println("You're out of tries!");
										playing = false;
									}

							}

						System.out.println("\n\nWould you like to play again?\n[Y/N]");
						String response = userInput.nextLine();
						if (response.equals("Y"))
							{
								System.out.println("One more time then!");
							} else
							{
								System.out.println("I hete to see you go, " + name + ". Bye!");
								replaying = false;
							}
					}
			}
	}
