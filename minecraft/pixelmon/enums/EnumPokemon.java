package pixelmon.enums;

import pixelmon.config.PixelmonEntityList.ClassType;

public enum EnumPokemon {
	Abra("Abra"),
	Alakazam("Alakazam"),
	Arcanine("Arcanine"),
	Arbok("Arbok"),
	Beedrill("Beedrill"),
	//Bellsprout("Bellsprout"),
	Blastoise("Blastoise"),
	Bulbasaur("Bulbasaur"),
	Butterfree("Butterfree"),
	Camerupt("Camerupt"),
	Caterpie("Caterpie"),
	Chansey("Chansey"),
	Charizard("Charizard"),
	Charmander("Charmander"),
	Charmeleon("Charmeleon"),
	Cubone("Cubone"),
	Diglett("Diglett"),
	Dodrio("Dodrio"),
	Doduo("Doduo"),
	Dragonair("Dragonair"),
	Dragonite("Dragonite"),
	Dratini("Dratini"),
	Drowzee("Drowzee"),
	Dugtrio("Dugtrio"),
	Eevee("Eevee"),
	Ekans("Ekans"),
	Electrode("Electrode"),
	Farfetchd("Farfetchd"),
	Flareon("Flareon"),
	Flygon("Flygon"),
	Gastly("Gastly"),
	Geodude("Geodude"),
	Gloom("Gloom"),
	Golbat("Golbat"),
	Golem("Golem"),
	Goldeen("Goldeen"),
	Growlithe("Growlithe"),
	Gyarados("Gyarados"),
	Haunter("Haunter"),
	Horsea("Horsea"),
	Ivysaur("Ivysaur"),
	Jigglypuff("Jigglypuff"),
	Jolteon("Jolteon"),
	Kabuto("Kabuto"),
	Kadabra("Kadabra"),
	Kabutops("Kabutops"),
	Kakuna("Kakuna"),
	Kingler("Kingler"),
	Koffing("Koffing"),
	Krabby("Krabby"),
	Krokorok("Krokorok"),
	Lapras("Lapras"),
	Lunatone("Lunatone"),
	Magikarp("Magikarp"),
	Magnemite("Magnemite"),
	Magneton("Magneton"),
	Mankey("Mankey"),
	Mareep("Mareep"),
	Meowth("Meowth"),
	Metapod("Metapod"),
	Mew("Mew"),
	Miltank("Miltank"),
	//NidoranMale("NidoranMale"),
	Ninetales("Ninetales"),
	Numel("Numel"),
	Oddish("Oddish"),
	Omanyte("Omanyte"),
	Omastar("Omastar"),
	Paras("Paras"),
	Pidgey("Pidgey"),
	Pikachu("Pikachu"),
	Pidgeotto("Pidgeotto"),
	Pidgeot("Pidgeot"),
	Piloswine("Piloswine"),
	Poliwag("Poliwag"),
	Ponyta("Ponyta"),
	Primeape("Primeape"),
	Psyduck("Psyduck"),
	Rapidash("Rapidash"),
	Raichu("Raichu"),
	Rattata("Rattata"),
	Sandile("Sandile"),
	Scyther("Scyther"),
	Seaking("Seaking"),
	Shellder("Shellder"),
	Slowbro("Slowbro"),
	Slowpoke("Slowpoke"),
	Snorlax("Snorlax"),
	Solrock("Solrock"),
	Spearow("Spearow"),
	Squirtle("Squirtle"),
	Staryu("Staryu"),
	Starmie("Starmie"),
	Swinub("Swinub"),
	Tangela("Tangela"),
	Tentacool("Tentacool"),
	Trapinch("Trapinch"),
	Umbreon("Umbreon"),
	Venomoth("Venomoth"),
	Venonat("Venonat"),
	Venusaur("Venusaur"),
	Vaporeon("Vaporeon"),
	Vibrava("Vibrava"),
	Vileplume("Vileplume"),
	Voltorb("Voltorb"),
	Vulpix("Vulpix"),
	Wartortle("Wartortle"),
	Weedle("Weedle"),
	Weezing("Weezing"),
	Wigglytuff("Wigglytuff"),
	Zubat("Zubat");

	private EnumPokemon(String name){
		this.name = name;
	}
	public String name;
	public static boolean hasPokemon(String evolveTo) {
		for (EnumPokemon e: values()){
			if (e.name.equalsIgnoreCase(evolveTo)) return true;
		}
		return false;
	}
	public static EnumPokemon get(String name) {
		for (EnumPokemon e: values()){
			if (e.name.equalsIgnoreCase(name)) return e;
		}
		return null;
	}
}