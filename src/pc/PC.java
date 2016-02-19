package pc;

public class PC {
	long price;
	String typePC;
	String chipset;
	String Processor;
	String processorType;
	int NumberOfCores;
	String frequencyProcessor;
	long amountRAM;
	String memoryType;
	String graphicsCardType;
	String manufacturerGraphicsCard;
	String ModelGraphicsCard;
	int amountGraphicsCard;
	String additionalParameters;
	String typeofDrive;
	String connectors;
	int USB;
	boolean Net;
	String driveUnit;
	boolean Audio;
	boolean Multimedia;
	boolean OC;
	String HousingMaterial;
	String design;
	String colour;
	String shapeOfPC;
	boolean designCustom;
	String dimensions;
	int proportions;
	int thicknessPC;
	int weight;
	boolean headset;
	String equipment;
	boolean AddParametersOfBoolean;

// 	** Main parameters **
	
	long howMuchItCost (String equipment) {
		return price;
	}
	
	String computerEquipment (String ComponentsOfComputer) {	
		return equipment;
	}
	
	String ComponentsOfComputer (String Processor, String memoryType,
			String graphicsCardType, String design) {	
		return equipment;
	}
	
// 	** Processor **
	
	int howNumberOfCores (String parameters) {
		return NumberOfCores;
	}
	
	String whatProcessorType (String parameters) {
		return processorType;
	}
	
	String whatfrequencyProcessor (String parameters) {
		return frequencyProcessor;
	}
	
	String whatProcessorYouNeed (int NumberOfCores, String processorType, String frequencyProcessor) {
		return Processor;
	}
	
// 	** Memory RAM **	
	String whatmemoryRAMYouNeed (long amountRAM, String type) {
		return memoryType;
	}
	
//	** Graphics Card **	
	String whatModelGraphicsCard (int integrated, int discrete) {
		return ModelGraphicsCard;
	}
	
	String manufacturer (int ATI, int NVidea) {
		return manufacturerGraphicsCard;
	}
	
	String whatGraphicsCardYouNeed (String ModelGraphicsCard, 
			                        String manufacturerGraphicsCard, int amountGraphicsCard) {
		return graphicsCardType;
	}
	
//	** Design **
	boolean isCustom() {
		return designCustom;
	}
	
	String whatColour (int RGB) {
		return colour;
	}
	
	String whatShapeOfPC (String material, String type){
		return shapeOfPC;
	}
	
	String designYourComputer (String colour, Boolean designCustom, String shapeOfPC) {
		return design;
	}
	
//	** Additional parameters **
	String whatAdditionalParameters (String typeofDrive, int USB, boolean ddParametersOfBoolean,
			String dimensions) {
		return additionalParameters;
	}
	boolean whatAddParametersOfBoolean (boolean Net, boolean Audio, boolean Multimedia, 
			boolean OC, boolean headset) {
		return AddParametersOfBoolean;
	}
	
	boolean isNet () {
		return Net;
	}
	
	boolean isAudio () {
		return Audio;
	}
	
	boolean isMultimedia () {
		return Multimedia;
	}
	
	boolean isOC () {
		return OC;
	}
	
	boolean isheadset () {
		return headset;
	}
	
	String whatDimensions(int proportions, int thicknessPC, int weight) {
		return dimensions;
	}
	
	int whatProportions () {
		 return proportions;
	}
	
	int whatThicknessPC () {
		return thicknessPC;
	}
	
}




