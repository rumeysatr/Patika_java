package adventureGame;

public class Armor {
	private int id;
	private String name;
	private int block;
	private int price;

	public Armor(int id, String name, int block, int price) {
		super();
		this.id = id;
		this.name = name;
		this.block = block;
		this.price = price;
	}
	
	public static Armor[] armors()
	{
		Armor[] armorList = new Armor[3];
		armorList[0] = new Armor(1, "Weak armor", 1, 15);
		armorList[1] = new Armor(2, "Medium armor", 3, 25);
		armorList[2] = new Armor(3, "Heavy armor", 5, 40);
		return armorList;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBlock() {
		return block;
	}

	public int getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBlock(int block) {
		this.block = block;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static Armor getArmorObjByID(int id) {
		for(Armor a: Armor.armors())
		{
			if(a.getId() == id)
				return a;
		}	
		return null;
	}


}
