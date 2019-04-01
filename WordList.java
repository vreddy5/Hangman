import java.util.LinkedList;
import java.util.Random;

public class WordList 
{
	private String[] house = new String[50];
	private String[] wildlife = new String[50];
	private String[] hard = new String[50];
	
	public WordList()
	{
		hard[0] = "Awkward";
		hard[1] = "Bagpipes";
		hard[2] = "Banjo";
		hard[3] = "Bungler";
		hard[4] = "Croquet";
		hard[5] = "Crypt";
		hard[6] = "Dwarves";
		hard[7] = "Fervid";
		hard[8] = "Fishhook";
		hard[9] = "Fjord";
		hard[10] = "Gazebo";
		hard[11] = "Gypsy";
		hard[12] = "Haiku";
		hard[13] = "Haphazard";
		hard[14] = "Hyphen";
		hard[15] = "Ivory";
		hard[16] = "Jazz";
		hard[17] = "Jazzy";
		hard[18] = "Jiffy";
		hard[19] = "Jinx";
		hard[20] = "Jukebox";
		hard[21] = "Kayak";
		hard[22] = "Kiosk";
		hard[23] = "Klutz";
		hard[24] = "Memento";
		hard[25] = "Mystify";
		hard[26] = "Numbskull";
		hard[27] = "Ostracize";
		hard[28] = "Oxygen";
		hard[29] = "Pajama";
		hard[30] = "Phlegm";
		hard[31] = "Pixel";
		hard[32] = "Polka";
		hard[33] = "Quad";
		hard[34] = "Quip";
		hard[35] = "Rhythmic";
		hard[36] = "Rogue";
		hard[37] = "Sphinx";
		hard[38] = "Squawk";
		hard[39] = "Swivel";
		hard[40] = "Toady";
		hard[41] = "Twelfth";
		hard[42] = "Unzip";
		hard[43] = "Waxy";
		hard[44] = "Wildebeest";
		hard[45] = "Yacht";
		hard[46] = "Zealous";
		hard[47] = "Zigzag";
		hard[48] = "Zephyr";
		hard[49] = "Zombie";
		
		wildlife[0] = "aardvark";
		wildlife[1] = "alpaca";
		wildlife[2] = "lizard";
		wildlife[3] = "armadillo";
		wildlife[4] = "monkey";
		wildlife[5] = "squirrel";
		wildlife[6] = "bonobo";
		wildlife[7] = "pig";
		wildlife[8] = "capuchin";
		wildlife[9] = "cat";
		wildlife[10] = "chicken";
		wildlife[11] = "chimpanzee";
		wildlife[12] = "cod";
		wildlife[13] = "cow";
		wildlife[14] = "macaque";
		wildlife[15] = "dog";
		wildlife[16] = "dolphin";
		wildlife[17] = "duck";
		wildlife[18] = "elephant";
		wildlife[19] = "ferret";
		wildlife[20] = "flycatcher";
		wildlife[21] = "fruitfly";
		wildlife[22] = "goat";
		wildlife[23] = "hamster";
		wildlife[24] = "gorilla";
		wildlife[25] = "hedgehog";
		wildlife[26] = "horse";
		wildlife[27] = "human";
		wildlife[28] = "rat";
		wildlife[29] = "deer";
		wildlife[30] = "mouse";
		wildlife[31] = "baboon";
		wildlife[32] = "opposum";
		wildlife[33] = "orangutan";
		wildlife[34] = "turtle";
		wildlife[35] = "panda";
		wildlife[36] = "platypus";
		wildlife[37] = "rabbit";
		wildlife[38] = "sheep";
		wildlife[39] = "sloth";
		wildlife[40] = "whale";
		wildlife[41] = "turkey";
		wildlife[42] = "giraffe";
		wildlife[43] = "snake";
		wildlife[44] = "scorpion";
		wildlife[45] = "ant";
		wildlife[46] = "mosquito";
		wildlife[47] = "starfish";
		wildlife[48] = "duck";
		wildlife[49] = "iguana";
		
		house[0] = "vacuum";
		house[1] = "carpet";
		house[2] = "television";
		house[3] = "radio";
		house[4] = "lamp";
		house[5] = "bed";
		house[6] = "toilet";
		house[7] = "soap";
		house[8] = "detergent";
		house[9] = "washer";
		house[10] = "dryer";
		house[11] = "dishwasher";
		house[12] = "cabinet";
		house[13] = "drawer";
		house[14] = "desk";
		house[15] = "computer";
		house[16] = "shampoo";
		house[17] = "pans";
		house[18] = "stove";
		house[19] = "microwave";
		house[20] = "refrigerator";
		house[21] = "oven";
		house[22] = "toaster";
		house[23] = "bedroom";
		house[24] = "patio";
		house[25] = "fan";
		house[26] = "bathtub";
		house[27] = "sink";
		house[28] = "couch";
		house[29] = "sponge";
		house[30] = "toothbrush";
		house[31] = "toothpaste";
		house[32] = "mouthwash";
		house[33] = "razor";
		house[34] = "clothes";
		house[35] = "pet";
		house[36] = "speaker";
		house[37] = "battery";
		house[38] = "towel";
		house[39] = "tissue";
		house[40] = "silverware";
		house[41] = "tile";
		house[42] = "treadmill";
		house[43] = "charger";
		house[44] = "blinds";
		house[45] = "chair";
		house[46] = "closet";
		house[47] = "mop";
		house[48] = "games";
		house[49] = "blanket";
	}
	
	public String house()
	{
		String word = "";
		Random r = new Random();
		int random = r.nextInt(50);
		
		word = house[random];
		return word;
	}
	
	public String wildlife()
	{
		String word = "";
		Random r = new Random();
		int random = r.nextInt(50);
		
		word = wildlife[random];
		return word;
	}
	
	public String hard()
	{
		String word = "";
		Random r = new Random();
		int random = r.nextInt(50);
		
		word = hard[random];
		return word;
	}
}
