package javaExternalLibraries;

import com.github.javafaker.Faker;

public class JavaFakerLibrary {

	public static void main(String[] args) {
		
		Faker faker = new Faker();
		
		System.out.println(faker.address().cityName());
		System.out.println(faker.name().fullName());
		System.out.println(faker.name().firstName());
		System.out.println(faker.name().nameWithMiddle());
		System.out.println(faker.animal().name());
		System.out.println(faker.shakespeare().asYouLikeItQuote());
		System.out.println(faker.weather().temperatureCelsius());
		
		System.out.println(faker.chuckNorris().fact());
		
		System.out.println(faker.cat().breed());
		
	}
}
